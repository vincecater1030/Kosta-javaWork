package ex0821;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedFileReaderWriterExam {
	public BufferedFileReaderWriterExam() {
		// 문자 단위로 파일을 읽기/쓰기(저장)-> Buffered 이용
		BufferedReader br = null;
		BufferedWriter bw = null;

		try {
			// 객체생성
			br = new BufferedReader(new FileReader("src/ex0820/a.txt"));

			// br.read();//한문자씩 읽기
			/*
			 * int i = 0; while ((i = br.read()) != -1) { System.out.println(i + "=" +
			 * (char) i); }
			 */

			// 한줄씩 읽기
			String str = null;
			while ((str = br.readLine()) != null) {
				System.out.println(str);
				// 파일에 저장하기
				bw = new BufferedWriter(new FileWriter("src/ex0821/info.txt"));
				bw.write("쉬고싶어요");
				bw.newLine();// 개행
				bw.write("뭐라고요?");
				bw.newLine();// 개행
				bw.write("지금 쉴때에요?\n");
				bw.write("죽으면 쉬세요");
				bw.flush();

			}

		} catch (IOException e) {
			e.printStackTrace();
		} finally {

			try {
				if (br != null)
					br.close();
				if (bw != null)
					bw.close();
			} catch (IOException e) {
				e.printStackTrace();

			}
		}
	}

	public static void main(String[] args) {
		new BufferedFileReaderWriterExam();

	}

}
