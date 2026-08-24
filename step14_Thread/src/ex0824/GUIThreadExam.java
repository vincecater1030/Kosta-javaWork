package ex0824;

import java.awt.Container;
import java.awt.FlowLayout;
import java.util.Calendar;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class GUIThreadExam extends JFrame {// 창역활-Container

	JTextField text1 = new JTextField(5); // 5글자 넣는다
	JTextField text2 = new JTextField(5); // 5글자 넣는다

	JButton btn1 = new JButton("눌러봐");
	boolean state = true;

	// 생성자 만들고 기능 넣는다
	public GUIThreadExam() {
		super("여기에 시계달거야~");

		// JFrame의 레이아웃(배치도)를 변경하기
		super.setLayout(new FlowLayout());

		// component 를 JFrame 위에 올리기
		Container con = super.getContentPane();

		super.add(btn1);
		super.add(text1);
		super.add(text2);

		// 창크기 설정
		super.setSize(500, 400);

		// 창의 위치 설정(반드시 창 크기 설정 이후에 해야한다)
		super.setLocationRelativeTo(null);// 중앙에 위치 시키기

		// 항상 창보이게 해야한다
		super.setVisible(true);

		// 생성된 창의 x를 클릭했을때 프로그램 종료하게 하는 옵션
		super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// 스레드시작(메소드에서 해도 되지만 여기서 하는 이유는 화면구성과 동시에 하려고)
		new NowTimeThread().start();// 시계
		// 근데 이미 상속 받아서 바깥(아래에)에 클래스 하나 만들어야 하는게 있다

		/*
		 * new Thread(new Runnable() { public void new Runnable() {
		 * 
		 * @Override public void run() { }).start();
		 */
		// 1~1000까지...인스턴스에서 바로 구현

		new Thread(() -> {// 람다식으로 한다면...
			// run 메소드 안
			for (int i = 0; i <= 1000; i++) {
				text1.setText(i + "");
				try {

					Thread.sleep((int) Math.random() * 100);

				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}).start();

		// 버튼을 클릭하면 A~Z 출력하는 이벤트 만들기
		/*
		 * btn1.addActionListener(new ActionListener() {
		 * 
		 * @Override public void actionPerformed(ActionEvent e) { } });
		 */ // 이렇게 길지만 아래와 같이 람다식으로..

		btn1.addActionListener((e) -> {// 람다식
			System.out.println("state값=" + state);

			if (state) {
				state = false;
				new Thread(() -> {
					for (char ch = 'A'; ch <= 'Z'; ch++) {
						text2.setText(ch + "");
						try {
							Thread.sleep(100);
						} catch (Exception ex) {
							ex.printStackTrace();
						}
					}
					state = true;
				}).start();
			} //
		});

	}// 생성자 끝

	public static void main(String[] args) {
		new GUIThreadExam();

	}

	// -------------------------------------------------------------------
	// 현재 시간을 구해서 JFrame title 에 1초 마다 갱신하는 스레드
	class NowTimeThread extends Thread {
//		GUIThreadExam gui;
		//
//		NowTimeThread(GUIThreadExam gui) {
//			this.gui = gui;
//		}             ***이너클래스 방식으로 할경우 위와같은 방법은 안쓸수 있다

		@Override
		public void run() {
			while (true) {
				// 현재 시간을 구한다
				Calendar now = Calendar.getInstance();

				int y = now.get(Calendar.YEAR);
				int m = now.get(Calendar.MONTH) + 1; // 내부적을 0 부터 시작하므로 반드시 +1 해준다
				int d = now.get(Calendar.DATE);

				int h = now.get(Calendar.HOUR);
				int mm = now.get(Calendar.MINUTE);
				int sec = now.get(Calendar.SECOND);

				StringBuilder sb = new StringBuilder();
				sb.append(y);
				sb.append("년 ");
				sb.append(m);
				sb.append("월 ");
				sb.append(d);
				sb.append("일 ");

				sb.append(h);
				sb.append("시 ");
				sb.append(mm);
				sb.append("분 ");
				sb.append(sec);
				sb.append("초 ");

				// JFrame 의 title 에 시계 넣기
				// gui.setTitle(sb.toString());
				GUIThreadExam.this.setTitle(sb.toString());// gui.을 GUIThreadExam.this. 로 바꾼다

				try {
					Thread.sleep(1000); // 1초 중지할때 스레드
				} catch (InterruptedException e) {
					e.printStackTrace();
				}

			} // while 끝

		}// run 끝

	}// 이너클래스 끝

}// 클래스 끝
