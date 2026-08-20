package ex0812;

public class ThrowException {

	public void aa(int i) throws ArithmeticException {
		System.out.println("aa 시작");
		try {
			this.bb(i);
		} finally {
			System.out.println("aa 끝");
		}
	}

	public void bb(int i) throws ArithmeticException {
		// ArithmeticException 뒤에 ,찍으면 여러개 쓸수 있다
		// 대신 다른곳에 던지는것도 추가해야 하고 받을때는 크게 받아야 한다
		System.out.println("bb 시작");
		try {
// 		try {
			int result = 100 / i;// ArithmeticException 가능성 있다
			System.out.println("나눈결과=" + result);
//		} catch (ArithmeticException e) {
//			e.printStackTrace();
//		}
		} finally {
			System.out.println("bb 끝");
		}
	}

	public static void main(String[] args) /* throws ArithmeticException 할수 있지만... */ {
		System.out.println("***메인 시작***");
		ThrowException te = new ThrowException();
		try {
			te.aa(0);
		} catch (ArithmeticException e) {
			System.out.println("메인이 예외처리 했어요");
			e.printStackTrace();
		}
		System.out.println("***메인 끝***");

	}

}
