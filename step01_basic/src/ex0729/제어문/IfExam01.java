package ex0729.제어문;

public class IfExam01 {

	public static void main(String[] args) {
		// 1.정수형 변수를 선언하고 적당히 초기화한다
		// 2.선언한 정수의 값이 짝수이면 짝입니다. 아니면 홀수 입니다.출력
		
		int no = (int)(Math.random()*56+45); //45에서 100 사이의 난수
		
		if(no%2 == 0) {
		System.out.println(no+"는 짝수");
		} else {
		System.out.println(no+"는 홀수");
		}
		
		
	}

}
