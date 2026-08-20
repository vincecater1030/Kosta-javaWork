package ex0807.superKeyword;

class Parent {

//	Parent() {
//		System.out.println(1);
//	}

	Parent(int i) {
		System.out.println(2);
	}

	Parent(String s) {
		System.out.println(3);
	}
}

////////////////////////////////////////////
class Child extends Parent {
	Child() {
		// super(); 생략되어있다.그래서 안보인다
		this(2);
		System.out.println(4);
	}

	Child(int i) {
		// super(); 생략되어있다.그래서 안보인다
		super(i); // 부모호출
		System.out.println(5);
	}

	Child(boolean b) {
		// super(); 생략되어있다.그래서 안보인다
		super("하이");
		System.out.println(6);
	}
}

public class SuperConstructorExam {
	public static void main(String[] args) {
		// new Child(); // 1 - 4
		// new Child(10); // 1 - 5
		// 결론 : 자식생성자 구현부 첫번째 줄에 super() 생략되어있다.

		//////////////////////////////////////////////////
		// 만약 부모의 생성자가 한개도 없다면(위의 부모생성자 모두 주석처리해보면..)
//		new Child();
//		new Child(10);
//		new Child(true);
		// 결론 : 생성자를 한개도 작성하지 않으면
		// 기본 생성자가 자동으로 삽입되어진다.
		//////////////////////////////////////////////////
		// 부모의 기본 생성자는 없고, 인수 있는 생성자가 있는경우(=부모 의 기본생성자 Parent();가 없다면
		// =>이런경우 자식생서자 구현부 첫번째 줄에서 모두 에러가 발생한다
		// =>반드시 자식생성자 구현부 첫번째 줄에서 super() 아닌 다른생성자를 인위적으로 호출해야한다.

		new Child(); // 4-> 5-> 2

	}

}
