package ex0731.scanner;

import java.util.Scanner;

public class ScannerExam {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("국어>");
		int kor = sc.nextInt(); // \n 개행문자 무시한다
		
		System.out.println("영어>");
		int eng = sc.nextInt();

		System.out.println("이름?");
		
		sc.nextLine();
		
		String name = sc.nextLine();	// \n 개행문자 무시한다
		
		System.out.println(name+"님 성적kor : " + kor + " eng : " + eng);

	}

}