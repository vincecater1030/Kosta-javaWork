package ex0812Test;

//1.예외 클래스 한개 -> Exception을 상속 -체크예외
//- 예외메시지 작성("애들은 가라") -> String하나받는 부모생성자호출
public class NoKidsException extends RuntimeException {

	static int count; // 스태틱 공유필드로 반드시..그래야 카운팅이 공유된다.

	public NoKidsException() {
		System.out.println("애들은가라");
		count++;
	}

	public NoKidsException(String message) {
		super(message);
		count++;
	}
}
