package ex0825.net;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerExam {
	public ServerExam() {// 생성자 만들기
		try (ServerSocket server = new ServerSocket(8000)) {
			while (true) {
				System.out.println("클라이언트 접속을 대기중입니다.~~^^");
				// 클라이언트 접속대기-접속되면 수락되어 Socket 반환
				Socket sk = server.accept();

				// 접속된 클라이언트 IP조회
				String ip = sk.getInetAddress().toString();

				System.out.println(ip + "님 접속 되었습니다.");

				// 클라이언트로 부터 전송된 데이터 읽기
				BufferedReader br = new BufferedReader(new InputStreamReader(sk.getInputStream()));
				String clientData = br.readLine();
				System.out.println("클라이언트가 보내온 내용=" + clientData);

				// 클라이언트에게 데이터 전송
				PrintWriter pw = new PrintWriter(sk.getOutputStream(), true);
				pw.println("자바세상에 오신걸 환영합니다~");// 반드시 println

				System.out.println();
			} // 와일문 끝

		} catch (Exception e) {
			e.printStackTrace();
		}

	}// 생성자끝

	public static void main(String[] args) {
		new ServerExam();
	}// 메소드끝

}// 클래스끝
