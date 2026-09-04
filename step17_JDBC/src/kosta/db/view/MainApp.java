package kosta.db.view;

import java.util.List;

import kosta.db.dao.EmpDAO;
import kosta.db.dto.EmpDTO;

public class MainApp {

	public static void main(String[] args) {
		System.out.println("**JDBC 시작하기***");
		EmpDAO dao = new EmpDAO();
//		dao.selectNames();

//		System.out.println("**Statement 방식으로 삭제하기***");
//		dao.deleteByEmpno(7369);

//		System.out.println("**PreparedStatement 방식으로삭제하기***");
//		dao.deleteByEmpno2(7698);

		System.out.println("******모든사원의 정보 검색하기*****");
		List<EmpDTO> list = dao.selecetAll();

		list.forEach(System.out::println);

		System.out.println("*******한 사원번호에 해당하는 사원정보*****");
		EmpDTO dto = dao.selectByEmpno(7499);
		if (dto == null) {
			System.out.println("검색된 정보 없습니다");
		} else {
			System.out.println(dto);
		}

		System.out.println("*******사원정보 추가하기*****");
		int re = dao.insert(new EmpDTO(8000, "희정", "강사", 2000, null));
		if (re == 0)
			System.out.println(re + "=>등록되지 않았습니다.");
		else
			System.out.println(re + "=>등록되었습니다.");
	}

}
