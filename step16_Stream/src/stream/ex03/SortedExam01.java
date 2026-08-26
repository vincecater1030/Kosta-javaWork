package stream.ex03;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SortedExam01 {
	public static void main(String[] args) {
		List<Student> list = Arrays.asList(new Student("희정", 22, 80, "컴퓨터"), new Student("나영", 25, 60, "과학"),
				new Student("미영", 21, 82, "컴퓨터"), new Student("삼순", 30, 95, "국어"), new Student("삼식", 22, 70, "수학"),
				new Student("효경", 28, 80, "국어"));

		System.out.println("---1.점수기준으로 오름차순-----------");
		list.stream()

				.sorted()// Student 클래스가 Comparable<Student> 구현해야 가능하다.

				.forEach(System.out::println);

		System.out.println("---2.점수기준으로 내림차순-----------");
		list.stream()

				.sorted((s1, s2) -> s2.getScore() - s1.getScore())// s1이든 s2든 그건 내가 정한다

				.forEach(System.out::println);

		System.out.println("--3.나이를 기준으로 정렬---------");
		List<Student> stList = list.stream()

				// .sorted((a,b)->a.getAge()-b.getAge())
				// 이렇게도 되지만 아래처럼..

				// .sorted((a, b) -> Integer.compare(a.getAge(), b.getAge()));
				// 이렇게도 되지만 아래처럼..

				// .sorted(Comparator.comparingInt((s) -> s.getAge()));
				// 이렇게도 되지만 아래처럼..

				.sorted(Comparator.comparingInt(Student::getAge))
				// 이렇게도 되지

				// .sorted(Comparator.comparingInt(Student::getAge).reversed())
				// 이건 내림차순
				// .sorted((a,b)->b.getAge()-a.getAge())
				// 이건 내림차순

				.toList();// 스트림을 리스트로 결과 받기 List<Student>

		stList.forEach(System.out::println);

		// .forEach(System.out::println);

	}

}
