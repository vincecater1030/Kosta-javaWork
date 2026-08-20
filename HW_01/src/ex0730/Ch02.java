package ex0730;

import java.util.Scanner;

public class Ch02 {

	public static void main(String[] args) {
//		1번.4
		System.out.println("1번에 4번");
//		2번.
		System.out.println("2번에\n String grade = \"B\";\n int score1 = 0;\n switch (grade) {\n case\"A\"->score1=100;\n case\"B\"->int result = 100-20;\n score1=result;\n default ->score1=60;\n }");
//			
//			
//			
//			

//		3번.
		int a = 1 ;
		int total = 0;
		for(a=1;a<=100;a++) {
			if(a%3==0)
				total += a;
		}System.out.println("3번에 " + total);
//		4번.
//				int a = 1;
//				int b = 1;					
//					while (a+b != 5) {     
//		   		 System.out.println(i); 
//		    		i++;    //모르겠어요..         
//		5번.모르겠어요..  
		System.out.println("4번,5번 모르겠어요");
//		6번.
		System.out.println("6번");
			int i = 1;
			int j = 1;
			
			for (i = 1; i <= 5; i++) {
			    for ( j = 1; j <= i; j++) {
			        System.out.print("*"); 
			    }
			    System.out.println();
			}
		System.out.println("7번 모르겠어요");
	

	}//메소드 중괄호

}//클래스 중괄호
