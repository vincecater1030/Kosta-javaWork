package ex0812Test;
//3. main 클래스 한개

//난수를 1~55 사이를 발생하여 쇼핑몰 클래스의 메소드를
//10번 호출한다.
//(int)(Math.random() * 경우의수) + 최소값-> 0.0 ~ .9999
//메인 메소드 마지막 줄에서...
//총 발생한 예외의 개수 를 찍어라..!!
//(조건 : Exception 클래스의 필드 이용)

import java.util.Random;

public class MainApp {

	public static void main(String[] args) {
		System.out.println("**OPEN**");

		ShopMall mall = new ShopMall();
		// 난수발생 전용 클래스
		Random r = new Random();

		for (int i = 0; i < 10; i++) {
			// 난수발생
			int age = r.nextInt(55) + 1; // 1~55
			try {
				mall.enter(age);
			} catch (NoKidsException e) {
				System.out.println(e.getMessage());
			}
		}
		System.out.println("**Close** ");
		// 예외발생 개수
		System.out.println("예외 개수" + NoKidsException.count);
	}

}
