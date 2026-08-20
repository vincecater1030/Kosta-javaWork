package ex0807.overriding;

class ObjectExam {
	String str;

	public ObjectExam() {
	}

	public ObjectExam(String str) {
		this.str = str;
	}

	public String toString() {
		return str;

		// return super.toString() + "=" + str;
	}
}

class ReferenceExam {
	public static void main(String[] args) {
		char c = 'a';
		/**
		 * System.out.print(객체) or System.out.println(객체); 일때 인수 객체가 오면 객체 .toString()
		 * 호출됨
		 */

		String s01 = "장희정";
		String s02 = "Java";
		String s03 = new String("월요일");

		ObjectExam oe1 = new ObjectExam();
		ObjectExam oe2 = new ObjectExam("안녕");

		System.out.println(c);// a

		System.out.println(s01);// 장희정
		System.out.println(s02);// Java
		System.out.println(s03);// 월요일

		System.out.println(oe1);// oe1은 new ObjectExam();에서 괄호안에 주소값 toString()생략되어있다
		System.out.println(oe2);// "안녕"이 안나오고 주소값이 나오는 이유는?
								// oe2뒤에.주소가 toString()생략되어있다
								// 객체의 주소를 클래스@해시코드의 형태로 만들어서 문자열을 리턴한다.
		System.out.println("-------------------------------------------");
		System.out.println(oe1);// 집에가요~
		System.out.println(oe2); // 안녕

	}
}
