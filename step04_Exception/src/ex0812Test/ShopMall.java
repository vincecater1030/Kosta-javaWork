package ex0812Test;

//2.쇼핑몰 클래스 한개
//- 나이를 인수로 받는 메소드 작성
//  입력된 나이에 따라 예외발생 또는 메시지 출력
//  만약, 예외가 발생하면 직접처리하지 않고 던진다. - throws 
public class ShopMall {

	public void enter(int age) throws NoKidsException {

		if (age < 18) {
			// 예외를 발생시켜라(직접처리)
			// try {
			throw new NoKidsException(age + "살님 노노 성인만오세요");
			// } catch (NoKidsException e) {
			// System.out.println(e.getMessage());
			// } 직접처리
		} else {
			System.out.println(age + "살 님 환영합니다");
		}
	}
}
