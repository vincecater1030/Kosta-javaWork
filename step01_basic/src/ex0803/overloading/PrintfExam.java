package ex0803.overloading;

import java.util.Calendar;
import java.util.GregorianCalendar;

class  PrintfExam{
	public static void main(String[] args) {
		System.out.printf("%d  %d %n",20,30);
		System.out.printf("%d , %d %n",20,30);
		System.out.println();
	   System.out.printf("가격 : %, d원 %n",25320000);
	   System.out.printf("%5.2f %n",35.33333);
	 System.out.println();
		 System.out.printf("%d년  %d월 %d일      %n",2009,5,3);
		 System.out.printf("%2$d년 %3$d월 %1$d일     %n",4, 2005, 3);

		Calendar now= Calendar.getInstance();//스태틱 메소드 정해져 있는 매소드
		//꺼내고 싶은것만 꺼내고 싶을떄 예제
		System.out.println("\nYear=>"+now.get(Calendar.YEAR)); //년도만 꺼낸다
		System.out.println("month=>"+ (now.get(Calendar.MONTH)+1) ); //월만 1월을 0월으로 하므로 +1해준다
		System.out.println("date=>"+now.get(Calendar.DATE) +"\n"); //일만 꺼낸다
		
		System.out.println(now);
		System.out.printf("%1$tY년 %1$tm월 %1$td일 %1$tH시 : %1$tM분 : %1$tS초%n" , now);
		System.out.println();
		System.out.printf("%3d %-10s %-8s %-5d%n",1,"jang","장희정",20);
		System.out.printf("%3d %-10s %-8s %-5d%n",22,"hee","정효욱",03);
		System.out.printf("%3d %-10s %-8s %-5d%n",3,"rew97","장정희",20);
		System.out.printf("%3d %-10s %-8s %-5d%n",4,"jang","장희정",20);
	}
}
