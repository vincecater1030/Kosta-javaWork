package ex0810.abstract_final;

abstract class Animal {
	int legs;

	public abstract void sound();

	public abstract void run();

	public void eat() {
		System.out.println("잘 먹는다!");
	}
}

//////////////////////////
/* abstract */ class Dog extends Animal {
	@Override
	public void sound() {
		System.out.println("멍멍");
	}

	@Override
	public void run() {
		System.out.println("잘 뛴다!");
	}
}

//////////////////////////
class Cat extends Animal {

	@Override
	public void sound() {
		System.out.println("야옹");
	}

	@Override
	public void run() {
		System.out.println("잘뛰고 잘올라간다");
	}
}

/////////////////////////
class Pig extends Animal {

	@Override
	public void sound() {
		System.out.println("꿀꿀");
	}

	@Override
	public void run() {
		System.out.println("못뛴다");
	}

	@Override
	public void eat() {
		// super.eat();
		System.out.println("다 잘먹는다");
	}

}

public class AbstractExam {
	// 아래의 메소드는 매개변수를 이용한 다형성을 보여주는 예이다
	public static void test(Animal animal) {// ()안에는 Cat이나 Dog이나 Pig가 오면 된다.
		// 각 동물의 메소드 호출 -부모타입이지만 재정의된 메소드는 자식부분이 호출
		animal.sound();
		animal.eat();
		animal.run();
		System.out.println("----------------");

	}

	public static void main(String[] args) {
		Animal an = null;
		an = new Dog();// 필드를 이용한 다형성
		test(an);
//////////////////////////////
		an = new Cat();
		test(an);
//////////////////////////////

		an = new Pig();
		test(an);

	}

}
