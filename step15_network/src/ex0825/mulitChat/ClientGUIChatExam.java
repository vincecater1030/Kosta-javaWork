package ex0825.mulitChat;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class ClientGUIChatExam extends JFrame {

	JTextArea textArea = new JTextArea();
	JTextField textField = new JTextField();
	JScrollPane scrollPane = new JScrollPane(textArea);// textArea를 담아 스크롤 생기게

	Socket sk;
	PrintWriter pw;
	BufferedReader br;

	public ClientGUIChatExam() {
		super("채팅프로그램");// 상단 문구

		Container con = getContentPane();

		// 컴포넌트 추가
		con.add(textField, BorderLayout.SOUTH);// textField 위치지정
		con.add(scrollPane, BorderLayout.CENTER);// scrollPane 위치지정

		// 옵션 설정
		textArea.setFocusable(false);// 커서 놓기 안됨, 이거 안하면 아무곳에 입력이 되어버림
		textArea.setBackground(Color.CYAN);

		// 창크기
		setSize(500, 400);

		// 정중앙놓기
		setLocationRelativeTo(null);

		// 보여줘
		setVisible(true);

		// x클릭했을때 프로그램 종료
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// 서버 연결
		connection();

		// **이벤트처리(JTextField에 값을 입력하고 enter 했을때 서버에 데이터 전송)
		textField.addActionListener((e) -> {

			// textField 값을 읽어서..
			String input = textField.getText();

			// 서버에 전송한다
			pw.println(input);

			// textField 내용지우기
			textField.setText("");
		});

		// 서버가 보내온 데이터를 받아서 JTextArea에 추가 하는 스레드

		new Thread(() -> {
			try {
				while (true) {
					String data = br.readLine();

					textArea.append(data + "\n");

					// 옵션
					textArea.setCaretPosition(textArea.getText().length());

				}
			} catch (Exception e) {
				e.printStackTrace();
			}

		}).start();

	}// 생성자끝

	/**
	 * 서버 접속 요청 메소드
	 */
	public void connection() {
		try {

			sk = new Socket("127.0.0.1", 8002);
			br = new BufferedReader(new InputStreamReader(sk.getInputStream()));
			pw = new PrintWriter(sk.getOutputStream(), true);
			String name;
			// 대화명 입력 창을 띄운다.
			name = JOptionPane.showInputDialog(this, "대화명을 입력하세요");
			while (true) {
				pw.println(name);
				String res = br.readLine();
				if (res.equals("NO")) {
					name = JOptionPane.showInputDialog(this, "대화명을 다시 입력하세요");

				} else {
					break;
				}

			}

			setTitle("[" + name + "]");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		new ClientGUIChatExam();

	}

}
