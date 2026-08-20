package ex0810.superkeyword;

public class InteritanceFieldMethodExam {
	class Animal {
		int age = 5;
		String bodyColor;

		public void sound() {
			System.out.println("super의 sound call");
		}

		public void eat() {
			System.out.println("super의 eat call");
		}
	}

/////////////////////////////////////
	class Cat extends Animal { // Cat is a Animal 성립
		int age = 10;
		int weight;

		@Override
		public void sound() {
			System.out.println("Cat의 sound call");
		}

		public void run() {
			System.out.println("Cat의 run call");
		}

		public void test() {
			System.out.println(age);
			System.out.println(this.age);
			System.out.println(super.age);

			System.out.println(bodyColor);
			System.out.println(this.bodyColor);
			System.out.println(super.bodyColor);

			System.out.println(weight);
			System.out.println(this.weight);
			// System.out.println(super.weight);

			sound();
			this.sound();
			super.sound();
			System.out.println("------------------");

			eat();
			this.eat();
			super.eat();

			System.out.println("------------------");

			run();
			this.run();
			// super.run();
			System.out.println("------------------");

		}
	}

	// public class InteritanceFieldMethodExam {
	// public static void main(String[] args) {
	// Cat cat = new Cat();
	// cat.test();
	// Cat cat = new Cat();

	// }
}
