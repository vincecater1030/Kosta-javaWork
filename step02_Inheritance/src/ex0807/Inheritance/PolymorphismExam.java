package ex0807.Inheritance;

class CarCenter { // 부모는 오브젝트
	public void engineer(Car cd) { // Car 를 전달 한다 가능한 이유는 클래스 Car 가 있으므로
		// engineer라는 이름의 메소드: Car 타입 객체 하나를 매개변수(cd)로 받고, 반환값은 없음(void)
		// 부모타입에 변수 선언한 느낌 Car cd
		System.out.println("cd=" + cd);
		// System.out.println(cd.i);// 부모타입으로는 접근 불가한다것을 보여준다

		// 부모타입을 자식타입 변수에 담는다
		// EfSonata e = cd;
		// 에러난다(개념적으로 부모>자식) 그래서 부모타입을 자식타입으로 ObjectDownCasting 한다
		// EfSonata e = (EfSonata) cd; //만약에 다른 엑셀이나 카니발이 들어오게 설정되면 에러난다
		if (cd instanceof EfSonata) {

			EfSonata e = (EfSonata) cd;
			System.out.println("e=" + e);
			System.out.println(e.i);

		}

		EfSonata e = (EfSonata) cd;

		System.out.println("e=" + e);
		System.out.println(e.i);

		System.out.print(cd.carname + " 수리완료!\t");
		System.out.println("청구비용" + cd.cost + " 원");

		System.out.println();
	}
}

public class PolymorphismExam {
	public static void main(String[] args) {

		CarCenter cc = new CarCenter();

		EfSonata ef = new EfSonata();
		Carnival cn = new Carnival();
		Excel ex = new Excel();
		Car c = new Car();

		System.out.println("c=" + c);
		System.out.println("ef=" + ef);
		System.out.println("cn=" + cn);
		System.out.println("ex=" + ex);

		System.out.println("ef.i=" + ef.i);

		cc.engineer(c);//
		cc.engineer(ef);//
		cc.engineer(cn);//
		cc.engineer(ex);//

	}
}
