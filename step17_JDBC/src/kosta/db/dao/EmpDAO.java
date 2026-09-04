package kosta.db.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import kosta.db.dto.EmpDTO;
import kosta.db.util.DbManager;

public class EmpDAO {
//emp 테이블에서 사원의 모든 이름 검색

	public void selectNames() {
		// 로드 연결 실행 닫기
		Connection con = null;
		Statement st = null;
		ResultSet rs = null;
		try {

			con = DbManager.getConnection();
			st = con.createStatement();
			rs = st.executeQuery("select ename from emp");
			while (rs.next()) {// 앞으로 커서가 이동한다면 이동할수 있을동안 반복
				// 열을 조회한다.
				String ename = rs.getString("ename");
				System.out.println(ename);
			}
			System.out.println("**완료***");

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DbManager.dbClose(con, st, rs);
		}
	}

//사원번호에 해당하는 레코드 삭제 방식 1 => Statement 방식(단점:공격에 취약하다)
	public void deleteByEmpno(int empno) {
		Connection con = null;
		Statement st = null;
		String sql = "delete from emp where empno=" + empno; // 여기서 공격당할 확률 높다
		try {
			con = DbManager.getConnection();
			st = con.createStatement();
			int re = st.executeUpdate(sql);

			if (re == 0)
				System.out.println(re + "삭제되지 않았습니다.");
			else
				System.out.println(re + "삭제되었습니다.");

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DbManager.dbClose(con, st);
		}

	}

//==========================================================================================
// 위 delete 를 PreparedStatement 방식으로 변경해보자!!!!!!!
// 사원번호에 해당하는 레코드 삭제 방식 2 => PreparedStatement 방식(단점:코드가길어진다)
	public void deleteByEmpno2(int empno) {
		Connection con = null;
		PreparedStatement ps = null;
		String sql = "delete from emp where empno=?"; // 두개면 ?,? 이런식으로
		try {
			con = DbManager.getConnection();
			ps = con.prepareStatement(sql);

			// 반드시 ?의 갯수만큼 순서대로 serXxx()설정 필수!!!!!!!!!!! (Xxx는 타입으로봐라)
			ps.setInt(1, empno);
			// 실행요청
			int re = ps.executeUpdate();
			if (re == 0)
				System.out.println(re + "삭제되지 않았습니다.");
			else
				System.out.println(re + "삭제되었습니다.");

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DbManager.dbClose(con, ps);
		}

	}

//모든사원의 정보 검색하기
//select empno,ename,job,sal,hiredate from emp  - 처럼 여러개를 list 타입으로 묶어서..

	public List<EmpDTO> selecetAll() {

		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		String sql = "select empno,ename,job,sal,hiredate from emp"; // 커리문
		List<EmpDTO> list = new ArrayList<EmpDTO>();

		try {
			con = DbManager.getConnection();
			ps = con.prepareStatement(sql);
			// ?의 개수만큼 순서대로 ps.setXxx() 필수. 커리문에 물음표 없어도 쓸수 있다.
			rs = ps.executeQuery();

			while (rs.next()) {// 열을 조회
				int empno = rs.getInt(1);
				String ename = rs.getString(2);
				String job = rs.getString("job");// 이것처럼 가독성 위해서 컬럼명쓰는거 추천
				int sal = rs.getInt("sal");
				String hiredate = rs.getString("hiredate");

				EmpDTO dto = new EmpDTO(empno, ename, job, sal, hiredate);
				list.add(dto); // 위에것도 길다...리스트에 add 한다

			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DbManager.dbClose(con, ps, rs);
		}

		return list;

	}

// 한 사원번호에 해당하는 사원정보 검색하기
// 커리문->select empno,ename,job,sal,hiredate from emp where empno
	public EmpDTO selectByEmpno(int empno) {
		// 로드 연결 실행 닫기
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		String sql = "select empno,ename,job,sal,hiredate from emp where empno=?"; // 커리문
		EmpDTO empDTO = null;// 리턴타입 만들기
		try {
			con = DbManager.getConnection();
			ps = con.prepareStatement(sql);
			// ?의 개수만큼 순서대로 ps.setXxx() 필수. 커리문에 물음표 없어도 쓸수 있다.
			ps.setInt(1, empno);

			rs = ps.executeQuery();

			if (rs.next()) {// 앞으로 커서가 이동한다면 이동할수 있을동안 반복.!!!
				// 열을 조회한다.
//				empno = rs.getInt(1);
//				String ename = rs.getString(2);
//				String job = rs.getString("job");// 이것처럼 가독성 위해서 컬럼명쓰는거 추천
//				int sal = rs.getInt("sal");
//				String hiredate = rs.getString("hiredate");

				// 위에처럼 지정할필요없이 아래처럼 할수 있다
				empDTO = new EmpDTO(rs.getInt(1), rs.getString(2), rs.getString("job"), rs.getInt("sal"),
						rs.getString("hiredate"));
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DbManager.dbClose(con, ps, rs);
		}
		return empDTO;
	}

//사원정보 추가하기
//커리문 -> insert into emp (empno,ename,job,sal,hiredate ) values(?,?,?,?,now())
	public int insert(EmpDTO empDTO) {

		Connection con = null;
		PreparedStatement ps = null;
		String sql = " insert into emp (empno,ename,job,sal,hiredate ) values(?,?,?,?,now())";

		int result = 0;

		try {
			con = DbManager.getConnection();
			ps = con.prepareStatement(sql);

			// 반드시 ?의 갯수만큼 순서대로 serXxx()설정 필수!!!!!!!!!!! (Xxx는 타입으로봐라)
			ps.setInt(1, empDTO.getEmpno());
			ps.setString(2, empDTO.getEname());
			ps.setString(3, empDTO.getJob());
			ps.setInt(4, empDTO.getSal());

			// 실행요청
			result = ps.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DbManager.dbClose(con, ps);
		}
		return result;
	}

}// EmpDAO 클래그 끝
