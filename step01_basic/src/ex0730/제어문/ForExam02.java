package ex0730.제어문;

public class ForExam02 {

	public static void main(String[] args) {
		//1. 1 ~ 100가지 10행 10열로 출력 (for문 안에 for문이용)
		//2. 1 ~ 100가지 10행 10열로 출력 (for문 안에  if문이용)

		//3. 구구단 출력  -  for 문안에 for문이용
		/*
				 *
				 *  2*1=2  3*1=3 ..... 9*1=9
				 *  2*2=4  3*2=4  4*2=4
				 *  2*3=6
				 *  ..
				 *
				 *  2*9=18              9*9=81
				 *
				 * */

		//구구단
				for(int a =1; a<=9 ; a++) {
					for(int b=2 ; b<=9 ; b++) {
						System.out.print(b+"x"+a+"="+(a*b)+" ");
					}System.out.println();
				}
		//while
				
			
	}//메소드 중괄호

}//클래스 중괄호
