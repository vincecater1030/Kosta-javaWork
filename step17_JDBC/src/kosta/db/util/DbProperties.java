package kosta.db.util;

/**
 * 2!! DB 설정 정보를 상수로 관리
 */
public interface DbProperties {
	public static final String DRIVER_NAME = "com.mysql.cj.jdbc.Driver";

	String URL = "jdbc:mysql://localhost:3306/mytest"; // mytest 는 MySQL의 테이블 이름
	String USER_ID = "jude";
	String USER_PASS = "jude";

}
