package kosta.db.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

//JDBC 를 위한 로드, 연결, 닫기 를 만들자

public class DbManager {
	// !!로드!!
	static {
		try {
			Class.forName(DbProperties.DRIVER_NAME); // 1!! 자료 불러으기 2!!인터페이스 만들어서 상수관리
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	// !!연결!!
	public static Connection getConnection() throws SQLException {
		Connection con = DriverManager.getConnection(DbProperties.URL, DbProperties.USER_ID, DbProperties.USER_PASS);
		return con;
	}

	// !!닫기(DDL or DML)!!
	public static void dbClose(Connection con, Statement st) {
		// 사용된 객체 닫기(가장 마지막인것부터 닫는다)
		try {
			if (st != null)
				st.close();
			if (con != null)
				con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	// !!닫기(select 인경우)!!
	public static void dbClose(Connection con, Statement st, ResultSet rs) {
		// 사용된 객체 닫기(가장 마지막인것부터 닫는다)
		try {
			if (rs != null)
				rs.close();

			// 사용된 객체 닫기
			dbClose(con, st);

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}
}
