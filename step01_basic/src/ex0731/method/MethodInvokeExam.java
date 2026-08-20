package ex0731.method;

class Methodinvoke01{
	//다음과 같이 메소드를 작성하세요.
	/*method 이름 : method01
	어디서나 누구나 접근가능
	정수 리턴
	인수로 정수2개 받음
	인수로 들어온 정수 2개를 곱해서 출력하고 리턴*/
	public int method01(int a , int b ) {
		System.out.println(a*b);
		return a*b;
	}
	
}
/////////////////////////////////////////
class Methodinvoke02{
	
	//method 이름 : method02
	//어디서나 누구나 접근가능,객체를 생성하지 않고도 접근가능 static
	//정수 리턴
	//인수로 정수2개 받음
	//인수로 들어온 정수 2개를 더해서 출력하고 더한수 리턴
	public static int method02(int a , int b ) {
		int v = a+b ;
		System.out.println(v);
		return v;
	}
}
/////////////////////////////////////////////////////
public class MethodInvokeExam{
	public static void main(String []args){
		
		//MethodInvoke01의 method01 호출 static X
		Methodinvoke01 xxx = new Methodinvoke01();	//새로운 객체 생성??
		xxx.method01(1, 2);							//매소드에 전달
		//MethodInvoke02의 method02 호출 static O
		Methodinvoke02.method02(3,4);               //클래스에 static이 있는것 확인하고 있으니 객체 선언 할 필요없다?
		

	}
	
}

