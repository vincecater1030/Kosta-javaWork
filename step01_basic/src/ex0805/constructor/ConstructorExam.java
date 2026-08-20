package ex0805.constructor;

//ConstructorExam.java
class Puppy{
		//String,int  타입 전역 변수 선언(멤버변수선언)(=전역변수선언,=필드선언)
		String name ; //널 ->메리
		int age;      //0->-98998
		/*	메소드 printPuppyName작성
			인수없음, 리턴안함
			"public void printPuppyName() 호출되었습니다!"출력
			전역변수를 출력
		*/	
		public void printPuppyName() {
			System.out.println("public void printPuppyName() 호출되었습니다!");
			System.out.println(this.name);
			System.out.println(age);
		}
		/*인수가 없는 생성자 작성
			"생성자 public Puppy() 호출되었습니다!"출력
			printPuppyName메소드 호출
				전역변수 String에"메리" 할당
			전역변수 int에 -98998 할당
		*/
		public Puppy() {
				
				System.out.println("생성자 public Puppy() 호출되었습니다!");
				
				this.printPuppyName(); //printPuppyName메소드 호출
				
				this.name= "메리";
				this.age=-98998;
		}
	
}
public class ConstructorExam{
	//메인메소드에서
	public static void main(String [] agrs){
		//Puppy객체 생성
		 Puppy dog = new Puppy(); //객체가 생성되면서 멤버필드 초기화
		//Puppy객체의 printPuppyName메소드 호출
		dog.printPuppyName();
		
	}
}
			
