package stream.ex02;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ArrayStreamExam01 {

	public static void main(String[] args) {
		System.out.println("1.String Array Stream ------------");
		String[] strArr = { "희정", "현준", "정화", "민지", "경찬" };
		/*
		 * for(String s:strArr) { //자료구조의 Iterator를 이용한 방식 System.out.println(s); }
		 */

		System.out.println("-------Stream 이용----------");
		// Stream을 이용해서 출력해보자
		Stream<String> stream = Arrays.stream(strArr);

		// 1) 람다식
//		stream.forEach((t) -> System.out.println(t));
		System.out.println("-------메소드 참조----------");
		// 2) 메소드 참조
		stream// 스트림선언
				.forEach(System.out::println);

		// 3) 한번 사용한 Stream을 다시 사용해보자(사용불가x)

		System.out.println("2.int Array Stream ------------");
		int[] intArr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };

		// ---------------------------------------------
		Arrays.stream(intArr)

				.filter((i) -> i % 2 == 0) // i를 가져와서 2로 나눈값이 0인것들만 나가라
				.forEach(System.out::println);

		System.out.println("3.range()  vs rangeClosed() ------------");
		IntStream// 스트림선언
				.range(0, 10)// 1부터 10까지
				.forEach(System.out::println); // 출력을 원한다면..forEach

		System.out.println("-----------------------");
		int re = IntStream.rangeClosed(1, 10).sum();
		System.out.println("결과 =" + re);
	}

}
