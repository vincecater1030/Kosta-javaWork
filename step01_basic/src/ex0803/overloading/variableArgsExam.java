package ex0803.overloading;

public class variableArgsExam {

	public static void aa( int i ) { //i는 배열이 된다.
		System.out.println("i="+i);
		
		System.out.println("\n*************");
	}
	
	//
	public void bb(int i , String ...s ) { //...이 들어가려면 마지막에 넣어야만 에러 안난다
		System.out.println(i + s[0]);
	}
	
	public static void main(String[] args) {
		System.out.println("--메소드 호출해보자---");
		
		variableArgsExam ve= new variableArgsExam();
		ve.aa(5);
		
		//ve.aa(5,3,1);
		//ve.aa();
		//ve.aa(5,12,3,5,6,42);
		
		variableArgsExam veBB= new variableArgsExam();
		veBB.bb(1000, "점이야");
		// ve.aa("안녕"); 
		
	}
}