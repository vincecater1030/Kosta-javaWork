package hw0820;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ProfileManager {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (true) {
			// 메뉴 출력
			System.out.println("1. 프로필 저장  2. 프로필 불러오기  3. 종료");
			System.out.print("메뉴 선택 > ");

			int menu = sc.nextInt();
			sc.nextLine(); // 버퍼에 남은 개행문자 제거

			if (menu == 1) {
				saveProfile(sc);
			} else if (menu == 2) {
				loadProfile(sc);
			} else if (menu == 3) {
				System.out.println("프로그램을 종료합니다.");
				break; // while문 탈출
			} else {
				System.out.println("잘못된 메뉴입니다. 다시 선택해주세요.");
			}
		}

		sc.close();
	}

	// 1. 프로필 저장 기능
	public static void name(Scanner sc) {
		System.out.print("이름 > ");
		String name = sc.nextLine();

		System.out.print("몸무게 > ");
		String weight = sc.nextLine();

		System.out.print("비밀번호 > ");
		String password = sc.nextLine();

		// "이름.txt" 형태의 파일 객체 생성 (아직 실제 파일은 아님)
		File file = new File(name + ".txt");

		try {
			// 실제로 파일을 생성 (이미 있으면 만들지 않고 false 반환)
			file.createNewFile();

			// 파일에 글자를 쓰기 위한 FileWriter 생성
			FileWriter fw = new FileWriter(file);

			// "몸무게:비밀번호" 형태로 저장
			fw.write(weight + ":" + password);

			fw.close(); // 반드시 닫아줘야 실제로 저장됨

			System.out.println(name + "님의 프로필이 저장되었습니다.");

		} catch (IOException e) {
			System.out.println("파일 저장 중 오류가 발생했습니다.");
			e.printStackTrace();
		}
	}

	// 2. 프로필 불러오기 기능
	public static void loadProfile(Scanner sc) {
		System.out.print("이름 > ");
		String name = sc.nextLine();

		File file = new File(name + ".txt");

		// 파일이 존재하는지 먼저 확인
		if (!file.exists()) {
			System.out.println(name + "님의 프로필을 찾을 수 없습니다.");
			return;
		}

		try {
			// 파일을 읽기 위한 FileReader + BufferedReader 생성
			FileReader fr = new FileReader(file);
			BufferedReader br = new BufferedReader(fr);

			String line = br.readLine(); // "몸무게:비밀번호" 한 줄 읽기
			br.close();

			// ":" 기준으로 문자열을 잘라서 배열로 저장
			String[] arr = line.split(":");
			String weight = arr[0];
			String password = arr[1];

			System.out.println(name + "님 몸무게는 " + weight + "kg 이고 비번은 " + password + " 입니다.");

		} catch (IOException e) {
			System.out.println("파일을 읽는 중 오류가 발생했습니다.");
			e.printStackTrace();
		}
	}
}