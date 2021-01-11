package com.dao;

import static com.common.JDBCTemplate.*;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.dto.MyTestDto;

// Data Access Object : DB와 접근하는 객체.
// impory static : class.method 하고 호출 할 때, class 생략하게 해줌

// 여기에서 우리 엊그제 했던거처럼 실제 계산하는 메소드들 만들고
public class MyTestDao {
	private static Scanner sc = new Scanner(System.in);

	// 전체출력
	public List<MyTestDto> selectList() {
		// 1. 2.
		// Connection con = JDBCTemplate.getConnection(); // -> import static
		// com.common.JDBCTemplate.*;
		Connection con = getConnection();
		String sql = " SELECT MNO, MNAME, NICKNAME " + " FROM MYTEST ";
		Statement stmt = null;
		ResultSet rs = null;

		List<MyTestDto> list = new ArrayList<MyTestDto>();

		try {
			// 3.
			stmt = con.createStatement();

			// 4.
			rs = stmt.executeQuery(sql);
			while (rs.next()) {
				MyTestDto temp = new MyTestDto();
				temp.setMno(rs.getInt("MNO"));
				temp.setMname(rs.getString("MNAME"));
				temp.setNickname(rs.getString("NICKNAME"));

				list.add(temp);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(rs);
			close(stmt);
			close(con);
		}

		return list;
	}

	// 선택 출력
	public MyTestDto selectOne(int mno) {

		Connection con = getConnection();
		String sql = " SELECT * FROM MYTEST " + " WHERE mno = " + mno;

		Statement stmt = null;
		ResultSet rs = null;
		MyTestDto dto = new MyTestDto();
		try {
			stmt = con.createStatement();

			rs = stmt.executeQuery(sql);

			while (rs.next()) {
				System.out.printf("%2d %10s %10s \n", rs.getInt(1), rs.getString(2), rs.getString(3));
			}
		} catch (SQLException e) {

			e.printStackTrace();
		} finally {
			close(rs);
			close(stmt);
			close(con);
		}

		return dto;

	}

	/*
	 * public List<MyTestDto> selectOne() {
	 * 
	 * // 1. 2.
	 * 
	 * System.out.println("번호를 입력해주세요."); int mno = sc.nextInt();
	 * 
	 * Connection con = getConnection(); String sql = " SELECT * FROM MYTEST " +
	 * " WHERE mno = " + mno;
	 * 
	 * Statement stmt = null; ResultSet rs = null; // sql로 인해 실행된 결과테이블이 리절트셋으로 리턴됨
	 * List<MyTestDto> list = new ArrayList<MyTestDto>();
	 * 
	 * try { stmt = con.createStatement(); rs = stmt.executeQuery(sql);
	 * 
	 * while (rs.next()) { MyTestDto temp = new MyTestDto();
	 * temp.setMno(rs.getInt(1)); temp.setMname(rs.getString(2));
	 * temp.setNickname(rs.getString(3)); list.add(temp); }
	 * 
	 * } catch (SQLException e) {
	 * 
	 * e.printStackTrace(); } finally { close(rs); close(stmt); close(con); }
	 * 
	 * return list; }
	 */
	// 추가
	public int insert(MyTestDto dto) {

		Connection con = getConnection();
		String sql = " INSERT INTO MYTEST " + " VALUES (?, ?, ?) ";

		PreparedStatement pstm = null;
		int res = 0;
		try {
			// 3.

			pstm = con.prepareStatement(sql);
			pstm.setInt(1, dto.getMno());
			pstm.setString(2, dto.getMname());
			pstm.setString(3, dto.getNickname());

			res = pstm.executeUpdate();
			// 적용된 로우의 개수
			if (res > 0) {
				commit(con);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(pstm);
			close(con);
		}

		return res;

	}

	public int update(MyTestDto dto) {

		Connection con = getConnection();
		String sql = null;
		PreparedStatement pstm = null;
		int res = 0;
		if (dto.getMname().equals("이름")) {
			sql = " UPDATE MYTEST " + " SET MNAME = ? " + " WHERE MNO = ? ";
		} else {
			sql = " UPDATE MYTEST " + " SET NICKNAME = ? " + " WHERE MNO = ? ";
		}
		
		try {
			pstm = con.prepareStatement(sql);
			pstm.setString(1, dto.getNickname());
			pstm.setInt(2, dto.getMno());
			res = pstm.executeUpdate();

			if (res > 0) {
				commit(con);
			}

		} catch (SQLException e) {

			e.printStackTrace();
		} finally {
			close(pstm);
			close(con);
		}

		return res;
	}

	public int delete(int mno) {
		
		Connection con = getConnection();
		String sql = " DELETE FROM MYTEST " + " WHERE MNO = ? ";
		
		PreparedStatement pstm = null;
		int res = 0;
		try {
			pstm = con.prepareStatement(sql);
			pstm.setInt(1, mno);
			res = pstm.executeUpdate();
			
			if (res > 0) {
				commit(con);
			}
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		} finally {
			close(pstm);
			close(con);
		}
		
		return res;
	}

	/*
	 * public String update() { System.out.println("수정할 번호 입력 : "); int mno =
	 * sc.nextInt(); System.out.println("수정할 컬럼 입력 : (이름 or 별명)"); String culumn =
	 * sc.next(); System.out.println("수정할 이름 or 별명 입력 : "); String change =
	 * sc.next();
	 * 
	 * Connection con = getConnection(); String sql = null; if (culumn == "이름") {
	 * sql = " UPDATE MYTEST " + " SET MNAME = ? " + " WHERE MNO = ? "; } else { sql
	 * = " UPDATE MYTEST " + " SET NICKNAME = ? " + " WHERE MNO = ? "; } String rs =
	 * null; PreparedStatement pstm = null;
	 * 
	 * try { pstm = con.prepareStatement(sql); pstm.setString(1, change);
	 * pstm.setInt(2, mno);
	 * 
	 * int res = pstm.executeUpdate();
	 * 
	 * if (res > 0) { rs = "수정완료"; }
	 * 
	 * } catch (SQLException e) {
	 * 
	 * e.printStackTrace(); } finally { close(pstm); close(con); }
	 * 
	 * return rs; }
	 * 
	 * public String delete() { System.out.println("삭제할 번호 입력 : "); int mno =
	 * sc.nextInt();
	 * 
	 * Connection con = getConnection();
	 * 
	 * String sql = " DELETE FROM MYTEST " + " WHERE MNO = " + mno;
	 * 
	 * Statement stmt = null; String rs = null; try { stmt = con.createStatement();
	 * 
	 * int res = stmt.executeUpdate(sql);
	 * 
	 * if (res > 0) { rs = "삭제성공"; }
	 * 
	 * } catch (SQLException e) {
	 * 
	 * e.printStackTrace(); }
	 * 
	 * return rs; }
	 */
}
