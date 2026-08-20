package ex0730.제어문;

public class WhileExam01 {

	public static void main(String[] args) {
		//1. 1~ 100가지 한줄로 출력
	int i = 1;
	while (i <= 100) {
		System.out.print(i+" ");
		i++;
	}
		
		//2. A ~Z 까지 한줄로 출력
	System.out.println();

	int j = 0;
	char s ='A';
	while (j <= 25) {
		System.out.print((char)('A'+j));
		j++;
	}
		//3. 1~ 10 까지  합 구해서 출력
	System.out.println();
	int k = 1;
	int total = 0;
	while ( k<=10 ) {
		
		total+=k;
		k++;
		
	}System.out.print(total);
		//4. 1 ~ 100 사이의 7의 배수만 출력 
	System.out.println();
	int n = 1;
	while (n <= 100) {
		System.out.print(n+" ");
		n++;
	}
		//5. 100 ~ 1 사이의 5 의 배수만 출력 
		//====================================

		//1.  1 ~ 100가지 10행 10열로 출력 (while문 안에 while문이용)

		//2. 1 ~ 100가지 10행 10열로 출력 (while문 안에  if문이용)

		//3. 구구단 출력  -  while 문안에 while문이용
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

				
				
				
	}//메소드 중괄호

}//클래스 중괄호
