package ex0825.chat;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.Socket;

//서버와 1:1채팅을 위한 클라이언트
public class ClientChatExam {
	public ClientChatExam() {

		try {
			Socket sk = new Socket("192.168.0.28", 8001);

			// 보내는 스레드
			new SendThread(sk, "[CLIENT]").start();

			// 받는스레드
			new Thread(new Runnable() {
				@Override
				public void run() {
					try {
						BufferedReader br = new BufferedReader(new InputStreamReader(sk.getInputStream()));
						while (true) {
							String readData = br.readLine();
							if (readData.equals("exit"))
								break;
							System.out.println(readData);
						}
						System.out.println("서버받는 스레드 종료합니다.^^");

					} catch (Exception e) {
						e.printStackTrace();
					} finally {
						System.exit(0);
					}
				}
			}).start();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}// 생성자끝

	public static void main(String[] args) {
		new ClientChatExam();

	}// 메소드끝

}// 클래스끝
