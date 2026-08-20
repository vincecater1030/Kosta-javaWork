package ex0813.exam05;

public class MainApp {

	public static void main(String[] args) {
		Course course = new Course();

		System.out.println("--1. <?> 모든타입 허용 ----");
		/*
		 * Applicant<Person> ap = new Applicant<Person>(); ap.setKind(new Person());
		 */
		course.register01(new Applicant<Person>(new Person()));
		course.register01(new Applicant<Worker>(new Worker()));
		course.register01(new Applicant<Student>(new Student()));
		course.register01(new Applicant<HighStudent>(new HighStudent()));
		course.register01(new Applicant<MiddleStudent>(new MiddleStudent()));

		System.out.println("--1. <? super Worker> Worker 이상 허용 ----");
		course.register01(new Applicant<Person>(new Person()));
		course.register01(new Applicant<Worker>(new Worker()));
		course.register01(new Applicant<Student>(new Student()));
		course.register01(new Applicant<HighStudent>(new HighStudent()));
		course.register01(new Applicant<MiddleStudent>(new MiddleStudent()));

		System.out.println("--1. <? extends Student> Student 이하 허용 ----");
		course.register01(new Applicant<Person>(new Person()));
		course.register01(new Applicant<Worker>(new Worker()));
		course.register01(new Applicant<Student>(new Student()));
		course.register01(new Applicant<HighStudent>(new HighStudent()));
		course.register01(new Applicant<MiddleStudent>(new MiddleStudent()));
	}

}
