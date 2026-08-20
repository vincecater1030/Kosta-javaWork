package ex0806.finalEx;

/**
 * final 필드는 반드시 초기화 필수(값을 명시해야 한다.)
 * =>초기화를 하는 방법
 *  1) 직접 명시적 초기화
 *  2) 생성자 안에서 초기화
 *  
 * static final 필드는 상수이다.
 * 	1)직접명시적초기화, 생성자 안에서 초기화 못한다
 * 
 */

public class FinalFieldExam {

	int i;
	//final int j =100; // final 은 값변경 불가인 고정값이 된다.1)직접명시적 초기화
	final int j;
	
	final static int k=10; //static 이 붙었다, k 값이 명시적 초기화, 진정한 상수이다.
	
	//static final int k; //스태틱 블럭에서 초기화 가능하다
	//	static {
	//		k=40;
	//	}
	
	public FinalFieldExam() {
		j=50;
	}
	public FinalFieldExam(int j) {
		this.j=j;
		
		
	}
	
	public static void main(String[] args) {
		FinalFieldExam fe = new FinalFieldExam();
		FinalFieldExam fe2 = new FinalFieldExam(100);
		
		fe.i=5; // 값변경
		//fe.j=5; 

	}

}
