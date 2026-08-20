package step05_Lamda;

public class MainApp {

	public static void main(String[] args) {
//1.기존방식이라면
		/*
		 * AInterface ai = new Test(); ai.aa();
		 */

		// 2.익명의 이너클래스(Anonymuse Innerclass) 타입으로 작성
		/*
		 * AInterface ai = new AInterface() {
		 * 
		 * @Override public void aa() {
		 * System.out.println("익명의 이너클래스(Anonymuse Innerclass) aa호출"); } };// AInterface
		 * end ai.aa();
		 */

		/**
		 * 3.람다식 : 반드시 interface 안에 메소드 한개 있을경우세 사용할수있다. FunctionInterface 라고 한다
		 * 
		 * 문법 1) 인수가 없는 경우 ()->{}
		 * 
		 * 2)인수가 있는경우 (변수이름,...)->{}
		 * 
		 * 3)기능이 한문장인 경우 ( )-> 기능
		 * 
		 */

		/*
		 * AInterface ai = () -> { System.out.println("인수 없는 람다식.."); };
		 */
		// 호출되는 클래스에 abstract 외에 디폴트나 {바디}가 있는경우는 가능하다

		AInterface ai = () -> System.out.println("인수 없는 람다식");
		ai.aa();

		// ---------------------------------
		BInterface bi = (a) -> System.out.println(a + "가 전달된 람다식");
		bi.bb(7);

		// ---------------------------------
		/*
		 * CInterface ci = (a, b) -> { return a + b; };
		 */
		CInterface ci = (a, b) -> a + b; // 리턴타입이 앞에 있어서 return을 생략한다

		int re = ci.cc(5, 8);
		System.out.println("re=" + re);

	}// main End

}

//-----------------------------
class Test implements AInterface {
	@Override
	public void aa() {
		System.out.println("Test의 aa메소드입니다");

	}

}