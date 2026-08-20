package ex0803.staticex;

class Test{
	
	int a;
	static int b; //b는 다른곳에에도 변화를 준다
	 
//non-static 메소드 안에서든 non-static,static,this 모두 가능
	public void aa() {
		 System.out.println(a); //0
		 System.out.println(this.a);//0
		 
		 System.out.println(b);//0
		 System.out.println(this.b);//0 
		 System.out.println(Test.b);//0
		 
		 //메소드 호출
		 this.bb();
		 bb();
		 
		 dd();
		 this.dd();
		 Test.dd();
		 
	 }
	 public void bb() {
		 
	 }
	
//static 메소드 안에서는 static만 접근가능 this 사용불가
	 public static void cc() {
		// System.out.println(a); //0
		// System.out.println(this.a);//0
		 
		 System.out.println(b);//0
		// System.out.println(this.b);//0 
		 System.out.println(Test.b);//0
		 
		//메소드 호출
		// this.bb();
		// bb();
		 
		 dd();
		// this.dd();
		 Test.dd();
		 
		 
	 }
	 public static void dd() {
	 
	 
	 }
	
}// Test end
public class staticVariableExam {
	    String s;
	    static String t;
	public static void main(String[] args) {
		System.out.println("**static 변수 알아보자***");
		
		//System.out.println("s="+s);
		System.out.println("t"+t);
		
		
		Test t1 = new Test();        //객체생성
		Test t2 = new Test();
		Test t3 = new Test();
		
		System.out.println("t1="+t1);
		System.out.println("t1="+t2);
		System.out.println("t1="+t3);

		System.out.println("**non-static 변수 ***");
		System.out.println("t1.a=" +t1.a);
		System.out.println("t2.a=" +t2.a);
		System.out.println("t3.a=" +t3.a);
		
		//값 변경
		t2.a=100;
		System.out.println("**non-static 변수(후) ***");
		System.out.println("t1.a=" +t1.a);
		System.out.println("t2.a=" +t2.a);
		System.out.println("t3.a=" +t3.a);
		
		System.out.println("**static 변수 ***");
		System.out.println("t1.b=" +t1.b);
		System.out.println("t2.b=" +t2.b);
		System.out.println("t3.b=" +t3.b);
		System.out.println("Test.b=" +Test.b);
		
		//값변경
		//t2.b=50;
		Test.b=70;
		
		System.out.println("**non-static 변수(후) ***");
		System.out.println("t1.b=" +t1.b);
		System.out.println("t2.b=" +t2.b);
		System.out.println("t3.b=" +t3.b);
		System.out.println("Test.b=" +Test.b);
		
	}//..메인메소드 끝
/**
 * 프로젝트가 배포될떄 메인 메소드보다 먼저 실행되는 영역으로
 * 주로,DB연결,네트워크점검,초기치데이터 로딩등..
 * 프로젝트 전반에 해당하는 configuration 세팅하는 과정
 */
	static {
		System.out.println("난 메인메소드보다 먼저 실행 됩니다.");
		
	}
	
}//클래스 끝
