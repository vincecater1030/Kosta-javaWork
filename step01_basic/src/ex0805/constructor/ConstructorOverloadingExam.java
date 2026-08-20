package ex0805.constructor;
class Puppy3{
	/*String 타입 전역 변수 선언
	  int 타입 전역 변수 선언*/
	String name ; //널
	int age;   	  //0
	
	/*인수가 없는 생성자 작성
		String 타입 전역변수에 "메리" 할당
		"puplic Puppy3()호출되었습니다"출력
		전역변수 출력
	*/		
	public Puppy3() {   //클래스 이름과 같고, 첫글자 반드시 대문자 체크
		this.name = "메리";
		System.out.println("puplic Puppy3()호출되었습니다");
		System.out.println(this.name+age);
	}
	
	/*String 타입의 인수 1개를 받는 생성자작성
		String 타입 전역변수에 인수 할당
		"puplic Puppy3()호출되었습니다"출력
		전역변수 출력
	*/		
	public Puppy3(String name) { //"java"
		this.name = name; //"true 쫑"
		System.out.println("puplic Puppy3(String name)호출되었습니다");
		System.out.println( this.name + age);
	}
	
	/*String 타입의 인수 2개를 받는 생성자작성
		인수2개를 하나의 String으로 만들어
		String 타입의 인수 1개를 받는 생성자에게 인수로 주며 호출
		"puplic Puppy3()호출되었습니다"출력
	*/		
	public Puppy3(String s, String s2) {//"java","Hi"
		this( s+s2 );
	System.out.println("puplic Puppy3(String s, String s2)호출되었습니다");
	} 
	
	/*boolean 타입의 인수 1개를 받는 생성자작성
		인수를 "쫑"과 붙여 하나의 String으로 만들어
		String 타입의 인수 1개를 받는 생성자에게 인수로 주며 호출
		"puplic Puppy3()호출되었습니다"  출력
	*/					
	public Puppy3(boolean b) {//true
		this(b+"쫑");	//String 한개 받는 생성자 호출
	System.out.println("puplic Puppy3(boolean b)호출되었습니다");
		
	}
	
	
	/*char 타입의 인수 1개를 받는 생성자작성
			인수가 없는 생성자를 호출하고
			인수로 받은 data를 int타입 전역변수에 할당	
			"puplic Puppy3()호출되었습니다"출력
			int형 전역변수출력
	*/			
	public Puppy3(char ch) {
			this(); //인수 없는 생성자 호출(기본 생성자)
			this.age = ch;
			System.out.println("puplic Puppy3(char ch)호출되었습니다");	
			
	}
	
	
	/*메소드 printMemberVariable
	리턴 없슴
	전역변수를 출력
	*/	
	public void printMemberVariable() {
		System.out.println(name);
		System.out.println(age);
	}	

}

	public class ConstructorOverloadingExam{
		//메인메소드에서
		public static void main(String [] args){
			//Puppy3 클래스의 각 생성자를 한번씩 이용해 객체 5개 생성
			Puppy3 p1 = new Puppy3();//인수없는 
			Puppy3 p2 = new Puppy3("java");//String 타입
			Puppy3 p3 = new Puppy3("java", "Hi");//String 타입2개 받는 생성자 호출
			Puppy3 p4 = new Puppy3(true);//boolean 받는 생성자 호출됨
			Puppy3 p5 = new Puppy3('A');//char 받는 생성자 호출됨
		//각 객체의 printMemberVariable메소드를 한번씩 호출
			p1.printMemberVariable();
			p2.printMemberVariable();
			p3.printMemberVariable();
			p4.printMemberVariable();
			p5.printMemberVariable();
	}
}