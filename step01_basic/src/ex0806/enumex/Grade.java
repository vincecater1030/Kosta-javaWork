package ex0806.enumex;

/**
 * enum 은 열거형으로 안에 정의된 정보는 static final =상수 이다
 * 
 * 
 * 
 */

//public enum Grade {
//	BASIC, SILVER, GOLD;  //<-- 이 자체가 값이고 타입이다
//}

///////////////////enum 의 상수에 뭔가를 넣고 싶을때////
public enum Grade {
	BASIC("일반",100,5), 
	SILVER("우수",200,10), 
	GOLD("최우수",300,30);  //<-- 이 자체가 값이고 타입이다

////////필드에 넣을수 있는 거 줘야한다//////////
	private final String kind;
	private final int point;
	private final int role;
	
	
	//enum 타입안에 있는 생성자는 무조건 private 이다.
	Grade(String kind, int point, int role){
		this.kind=kind;
		this.point=point;
		this.role=role;
	
	}


	public String getKind() {
		return kind;
	}


	public int getPoint() {
		return point;
	}


	public int getRole() {
		return role;
	}

}
