package ex0820;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileInputOutputExam {
	public FileInputOutputExam() {
		FileInputStream fis = null;
		FileOutputStream fos = null;
		try {
			fis = new FileInputStream("src/ex0820/a.txt");
			/*
			 * while (true) {
			 * 
			 * int i = fis.read();// 1byte 씩 읽기 if (i == -1) break;
			 * 
			 * System.out.println(i + "=" + (char) i); }
			 */

//----------------------------------------------------

			int len = fis.available();// 읽을수 있는 byte 수 반환
			System.out.println("len=" + len);

			// ---------------------------
			// byte [] 크기만큼 한번에 읽기
			byte[] b = new byte[len]; // []안에 숫자만큼이 문자 들어오는것
			fis.read(b);

			// byte [] 를 String 변환 방법
			String str = new String(b);
			System.out.println(str);
			System.out.println("**완료**");

			// 파일에 내용저장=쓰기
			fos = new FileOutputStream("src/ex0820/save.txt");
			// fos = new FileOutputStream("src/ex0820/save.txt", true);

			/*
			 * fos.write(65); fos.write(66); fos.write(67);
			 * 
			 * fos.write(13); fos.write(10);
			 * 
			 * fos.write(70); // String -> byte[]배열로 변환하면 좋은데..그래서 String data =
			 * "집에 가고 싶어요~"; fos.write(data.getBytes());
			 */

			fos.write(b);

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (fis != null)
					fis.close();
				if (fos != null)
					fos.close();
			} catch (IOException e) {
				e.printStackTrace();

			}
		}
	}

	public static void main(String[] args) {
		new FileInputOutputExam();

	}

}
