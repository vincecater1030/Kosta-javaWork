package ex0813.list;

import java.util.ArrayList;
import java.util.Collections;

public class ListExam01 extends ArrayList<Integer> {

	public ListExam01() {
		super(5);// 5개 공간을 만든다.숫자는 큰 의미 없다

		// 데이터를 추가 하고싶다,5개 이상도 들어간다
		super.add(5);
		this.add(10);
		add(3);
		add(4);
		add(6);
		add(2);
		// 몇개 저장했는지 알고 싶다
		System.out.println("저장된 객체의 개수=" + super.size());

		// 요소 꺼내기
		for (int i = 0; i < super.size(); i++) {
			int value = super.get(i);
			System.out.println(value);
		}
		System.out.println("---개선된 for문---");
		// 개선된 for 문
		for (int i : this) {// = for( integer i : this )
			System.out.println(i);
		}

		System.out.println("this=" + this); // this 뒤에 .toString() 생략되어있다.
											// 오버라이딩 되어있어서 주소값이 나오지 않는다.

		// 제거
		super.remove(2);
		System.out.println("후 this=" + this);
		// 정렬 - 올림차순(기본설정)
		Collections.sort(this);
		System.out.println("정렬 후 =" + this);
		// 정렬 - 내림차순
		Collections.sort(this, Collections.reverseOrder());
		System.out.println("정렬 후 =" + this);
	}

	public static void main(String[] args) {
		new ListExam01();

	}

}
