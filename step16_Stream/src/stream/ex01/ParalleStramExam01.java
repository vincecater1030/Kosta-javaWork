package stream.ex01;

import java.util.Arrays;
import java.util.List;

public class ParalleStramExam01 {

	public static void main(String[] args) {
		List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David", "Charlie", "Charlie", "Charlie");

		// 기존방식
		for (String name : names) {
			if (name.startsWith("C")) {
				System.out.println(Thread.currentThread().getName() + " - " + name);
				// Thread.currentThread().getName()==> 현재 쓰레드의 이름을 얻어오는것
			}
		}

		System.out.println("--Stream을 이용한 처리 -----------");
		// names.stream() =>스트림을 얻어왔는데 일반 처리방식
		names.parallelStream() // =>스트림을 얻어왔는데 병렬처리 방식
				.filter(name -> name.startsWith("C"))
				.forEach(name -> System.out.println(Thread.currentThread().getName() + " - " + name));

	}

}
