package ex0729.report;

public class Report {

	public static void main(String[] args) {
//if문
	/*	
	  String name = "형진";
		int kuk = (int)(Math.random()*56+45);
		int eng = (int)(Math.random()*56+45);
		int mat = (int)(Math.random()*56+45);
		
		int total = kuk + eng + mat ;
		double average = total/3 ;
		
		if(average>=90) {
			System.out.println( name + "의 평균학점은 "+average+"이며 A 입니다.");
		}else if(average>=80) {
			System.out.println( name + "의 평균학점은 "+average+"이며 B 입니다.");
		}else if(average>=70) {
			System.out.println( name + "의 평균학점은 "+average+"이며 C 입니다.");
		}else if(average>=60) {
			System.out.println( name + "의 평균학점은 "+average+"이며 D 입니다.");
		}else {
			System.out.println( name + "의 평균학점은 "+average+"이며 F 입니다.");
		}
	}
}
*/

//switch 문
	String name = "형진";
	int kuk = (int)(Math.random()*56+45);
	int eng = (int)(Math.random()*56+45);
	int mat = (int)(Math.random()*56+45);
	
	int total = kuk + eng + mat ;
	double average = total/3.0 ;
	
	System.out.println(average);
	}
}

	//char grade = 'f';
	
/*	switch (average01) {
	case 10 : grade='A'; break;
	case 9 : grade='A'; break;
	case 8 : grade='B'; break;
	case 7 : grade='C'; break;
	case 6 : grade='D'; break;
	default : grade='F';
		}	
	//System.out.println(name + "의 평균학점은 "+ average + "이며 " + grade + "입니다.");
	}
}	*/


// 어렵습니다...스위치문으로 하는게 더 어려웠습니다..그렇다고 이프문이 쉽다는 것은 아닙니다.ㅜㅜ