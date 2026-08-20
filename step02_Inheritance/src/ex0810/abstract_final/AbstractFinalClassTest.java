package ex0810.abstract_final;

final class FinalClassExam {// 상속불가,생성가능
	final int i = -999999;// 값변경불가

}

abstract class AbstractClassExam {// 상속가능,생성불가
	abstract String abstractMethodExam(int i, String s);// body 없다.재정의를 위해서 만든다.

	final int finalMethodExam(int i, int j) {// 재정의불가
		return i + j;
	}
}

/////////////////////////////////////////////////
class Sample01 extends AbstractClassExam {
	String abstractMethodExam(int i, String s) {
		System.out.println("return " + s + i);
		return s + i;
	}

	/*
	 * int finalMethodExam(int i, int j) {// 파이널메소드 abstract클래스
	 * 
	 * return i * j; }
	 */ // 재정의 불가

}

class Sample02 /* extends FinalClassExam */
{// final 클래스는 상속 불가

}

abstract class Sample03 extends AbstractClassExam {
	String abstractMethodExam(String s, int i) {
		return s + i;
	}

	abstract String abstractMethodExam(int i, String s);

	void sampleMethod03() {
		System.out.println("void sampleMethod03() 호출 됨");
	}
}

class AbstractFinalClassTest {
	public static void main(String args[]) {
		AbstractClassExam ace; /* = new AbstractClassExam() */ // 상속불가
		FinalClassExam fce = new FinalClassExam();
		// fce.i = 100000;
		Sample01 s01 = new Sample01();
		AbstractClassExam aceS01 = new Sample01();
		aceS01.abstractMethodExam(700, "_999");
	}
}
