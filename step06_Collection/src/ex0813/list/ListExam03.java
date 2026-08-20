package ex0813.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListExam03 extends ArrayList<Emp> {
	public ListExam03() {
		// 사원저장
		super.add(new Emp(20, "희정", 20, "서울"));
		super.add(new Emp(10, "나영", 25, "대전"));
		super.add(new Emp(40, "미미", 22, "대구"));
		super.add(new Emp(50, "삼순", 28, "서울"));
		super.add(new Emp(30, "순동", 26, "부산"));

	}

	/**
	 * 저장된 모든 사원의 정보 검색
	 **/
	public List<Emp> selectAll() {
		return this;
	}

	/**
	 * 사원의 사원번호에 해당하는 사원정보 검색. 리턴타입 : 있으면 Emp객체, 없으면 null
	 **/
	public Emp selectByEmpno(int empno) {
		for (Emp e : this) {
			if (e.getEmpno() == empno) {
				// 찾았다
				return e;
			}
		}
		return null;
	}

	/**
	 * 주소를 인수로 전달받아 동일한 주소에 해당하는 사원정보 검색
	 **/
	public List<Emp> selectByAddr(String addr) {
		List<Emp> findList = new ArrayList<Emp>();

		for (Emp e : this) {
			if (e.getAddr().equals(addr)) {
				// 있다
				findList.add(e);
			}
		}
		/**
		 * for (int i = 0; i < this.size(); i++){ Emp e = this.get(i); }
		 */
		return findList;
	}

	/**
	 * 사원번호를 기준으로 사원정보 정렬하기
	 **/
	public List<Emp> sortByEmpno() {
		/**
		 * All elemints in the list must Implements the Comparable interface
		 * 
		 * =>Integer 은 이미 Comparable 구현한 객체이다
		 * 
		 * sort를 하기위한 객체는 반드시 Comparable
		 */

		// 원본이 정렬이 되어서 등록된순서를 이후로 알수가 없다
		// Collections.sort(this);//Emp클래스에 Comparable 구현해야한다.
		// 그래서 위와 같은 방법 보다는
		// 정렬을 해줄 새로운 List 를 만들고 그 list 를 정렬해서 리턴한다.
		List<Emp> shallowCopy = new ArrayList<Emp>(this);// 카피본
		Collections.sort(shallowCopy);
		return shallowCopy;
	}

	/**
	 * 나이를 기준으로 사원정보 정렬하기
	 **/

	public static void main(String[] args) {
		ListExam03 ex = new ListExam03();
		List<Emp> list = ex.selectAll();
		for (Emp e : list) {
			System.out.println(e);
		}
		for (int i = 0; i < list.size(); i++) {
			Emp e = list.get(i);
			System.out.println(e);
		}
		System.out.println("2.사원번호에 해당하는 사원정보 검색--");
		Emp e = ex.selectByEmpno(40);
		System.out.println(e);

		System.out.println("\n3.주소에 해당하는 사원정보 검색--");
		List<Emp> findList = ex.selectByAddr("서울");
		System.out.println(findList);

		System.out.println("\n4.사원번호를 기준으로 사원정보 정렬하기--");
		List<Emp> sortedList = ex.sortByEmpno();
		for (Emp emp : sortedList) {
			System.out.println(emp);
		}

//---------------------------------------------------
	}// 메인끝

}
