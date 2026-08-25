package ex0825.net;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class ClientExam {
	public ClientExam() {
		try (Socket sk = new Socket("192.168.0.28", 8000)) {

			// 서버에게 데이터를 전송
			PrintWriter pw = new PrintWriter(sk.getOutputStream(), true);
			pw.println("옆사람입니다");// 반드시 println

			// 서버가 보내온 데이터 읽기
			BufferedReader br = new BufferedReader(new InputStreamReader(sk.getInputStream()));

			String clientData = br.readLine();
			System.out.println("서버가 보내온 내용=" + clientData);

		} catch (Exception e) {
			e.printStackTrace();
		}

	}// 생성자끝

	public static void main(String[] args) {
		new ClientExam();

	}// 메소드끝

}// 클래스끝
