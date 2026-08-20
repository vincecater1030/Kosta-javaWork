package ex0731.method;

class GradeScore {
	private int methodTotal(int a, int b, int c) {
	    int kor = a ;
	    int eng = b ;
	    int mat = c ;
	    int total = kor + eng + mat ;
		
	    return total;
	}	//methodTotal 끝
	
	private double methodAvg ( int d , int e ) {
		double avg= (double)d/(int)e ;
		
		return avg;
	} //methodAvg 끝
	
	private String methodGrade ( double f  ) {
		String grade = "F" ;
		if (f>90) {
			grade = "A";
		}else if(f>80) {
			grade = "B";
		}else if(f>70) {
			grade = "C";
		}else if(f>60) {
			grade = "D";
		}else grade = "F";
		
		return grade ;
	} //methodGrade 끝
 
	public void methodResult ( String name ,double avg, String grade ) {
		int myTotal = methodTotal( 80,70, 60);
		double myAverage = methodAvg(myTotal, 3);
		String myGrade = methodGrade (avg);
		
		System.out.println("총점은"+myTotal+"이고 평균은" +myAverage+"이며 등급은" + myGrade + "입니다.");
	}
 
 }// class GradeScore 끝


		
