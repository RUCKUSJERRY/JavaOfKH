package com.test01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class MTest {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println("메뉴 선택");
		System.out.println("1:전체선택 2:특정 부서 선택 3: 부서 추가 4: 부서 수정 5: 부서 삭제 6: 종료");
		int select = sc.nextInt();

		switch (select) {
		case 1:
			selectList();
			break;
		case 2:
			selectOne();
			break;
		case 3:
			insert();
			break;
		case 4:
			update();
			break;
		case 5:
			delete();
			break;
		default:
			System.out.println("종료");
		}

	}

	public static void selectList() {

		// 1. Driver 연결
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

		// 2. 계정 연결
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "kh";
		String password = "kh";

		Connection con = null;
		try {
			con = DriverManager.getConnection(url, user, password);
		} catch (SQLException e) {

			e.printStackTrace();
		}

		// 3. query 준비
		String sql = " SELECT * FROM DEPT ";

		Statement stmt = null;
		ResultSet rs = null;
		try {
			stmt = con.createStatement();
			// 4. query 실행 및 리턴
			rs = stmt.executeQuery(sql);
			System.out.println("DEPTNO     DNAME \t LOC");
			System.out.println("-------------------------------");
			while (rs.next()) {
				System.out.printf("%2d %14s %13s \n", rs.getInt(1), rs.getString(2), rs.getString(3));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				// 5. db 종료
				rs.close();
				stmt.close();
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}

		}

	}

	public static void selectOne() {

		System.out.println("부서번호를 입력해주세요.");
		int deptno = sc.nextInt();

		// 1. driver 연결
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		// 2. 계정 연결
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "kh";
		String password = "kh";

		Connection con = null;
		try {
			con = DriverManager.getConnection(url, user, password);
		} catch (SQLException e) {

			e.printStackTrace();
		}
		// 3. query 준비
		String sql = " SELECT * FROM DEPT " + " WHERE DEPTNO = " + deptno;

		Statement stmt = null;
		ResultSet rs = null;
		try {
			// 4. query 실행 및 리턴
			stmt = con.createStatement();
			rs = stmt.executeQuery(sql);

			System.out.println("DEPTNO     DNAME \t LOC");
			System.out.println("-------------------------------");
			while (rs.next()) {
				System.out.printf("%2d %14s %13s \n", rs.getInt(1), rs.getString(2), rs.getString(3));
			}

		} catch (SQLException e) {

			e.printStackTrace();
		} finally {
			// 5. db 종료
			try {
				rs.close();
				stmt.close();
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

	}

	public static void insert() {
		System.out.println("부서번호 입력 : ");
		int deptno = sc.nextInt();
		System.out.println("부서이름 입력 : ");
		String dname = sc.next();
		System.out.println("지역 입력 : ");
		String loc = sc.next();

		// 1. driver 연결
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		// 2. 계정 연결
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "kh";
		String password = "kh";

		Connection con = null;
		try {
			con = DriverManager.getConnection(url, user, password);
		} catch (SQLException e) {

			e.printStackTrace();
		}
		// 3. query 준비
		String sql = " INSERT INTO DEPT " + " VALUES (?, ? ,?) ";
		PreparedStatement pstm = null;
		try {
			// 4. query 실행 및 리턴
			pstm = con.prepareStatement(sql);
			pstm.setInt(1, deptno);
			pstm.setString(2, dname);
			pstm.setString(3, loc);

			int res = pstm.executeUpdate();

			if (res > 0) {
				System.out.println("입력 완료");
			}

		} catch (SQLException e) {

			e.printStackTrace();
		} finally {
			// 5. db 종료
			try {
				pstm.close();
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	public static void update() {
		System.out.println("수정할 부서 번호 입력 : ");
		int deptno = sc.nextInt();
		System.out.println("변경할 부서명 입력 : ");
		String dname = sc.next();

		// 1. Driver 연결
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

		// 2. 계정 연결
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "kh";
		String password = "kh";

		Connection con = null;

		try {
			con = DriverManager.getConnection(url, user, password);
		} catch (SQLException e) {
			e.printStackTrace();
		}

		// 3.query 준비
		String sql = " UPDATE DEPT SET DNAME = '" + dname + "'" + " WHERE DEPTNO = " + deptno;

		Statement stmt = null;

		try {
			stmt = con.createStatement();

			int res = stmt.executeUpdate(sql);
			if (res > 0) {
				System.out.println("수정 성공");
			}

		} catch (SQLException e) {

			e.printStackTrace();
		} finally {
			try {
				stmt.close();
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

	}

	public static void delete() {
		System.out.println("삭제할 부서 번호 입력 : ");
		int deptno = sc.nextInt();

		// 1. Driver 연결
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

		// 2. 계정 연결
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "kh";
		String password = "kh";

		Connection con = null;

		try {
			con = DriverManager.getConnection(url, user, password);
		} catch (SQLException e) {
			e.printStackTrace();
		}

		// 3.query 준비
		String sql = " DELETE FROM DEPT "
				   + " WHERE DEPTNO = " + deptno;

		Statement stmt = null;

		try {
			stmt = con.createStatement();

			int res = stmt.executeUpdate(sql);
			if (res > 0) {
				System.out.println("삭제 성공");
			}

		} catch (SQLException e) {

			e.printStackTrace();
		} finally {
			try {
				stmt.close();
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

	}

}
