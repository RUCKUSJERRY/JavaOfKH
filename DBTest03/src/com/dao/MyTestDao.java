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


public class MyTestDao {
	private static Scanner sc = new Scanner(System.in);
	// 전체출력
	public List<MyTestDto> selectList(){
		// 1. 2.
		// Connection con = JDBCTemplate.getConnection(); // -> import static com.common.JDBCTemplate.*;
		Connection con = getConnection();
		String sql = " SELECT MNO, MNAME, NICKNAME "
				   + " FROM MYTEST ";
		Statement stmt = null;
		ResultSet rs = null;
		
		List<MyTestDto> list = new ArrayList<MyTestDto>();
		
		try {
			// 3.
			stmt = con.createStatement();
			
			//4.
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
	
	public List<MyTestDto> selectOne(){
		
		//1. 2.
		
		System.out.println("번호를 입력해주세요.");
		int mno = sc.nextInt();
		
		Connection con = getConnection();
		String sql = " SELECT * FROM MYTEST "
				   + " WHERE mno = " + mno;
		
		Statement stmt = null;
		ResultSet rs = null;
		
		List<MyTestDto> list = new ArrayList<MyTestDto>();
		
		try {
			stmt = con.createStatement();
			rs = stmt.executeQuery(sql);
			
			while (rs.next()) {
				MyTestDto temp = new MyTestDto();
				temp.setMno(rs.getInt(1));
				temp.setMname(rs.getString(2));
				temp.setNickname(rs.getString(3));
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
	
	public String insert() {
		System.out.println("번호 입력 : ");
		int mno = sc.nextInt();
		System.out.println("이름 입력 : ");
		String mname = sc.next();
		System.out.println("별명 입력 : ");
		String nickname = sc.next();
		
		Connection con = getConnection();
		String sql = " INSERT INTO MYTEST "
				   + " VALUES (?, ?, ?) ";
		String rs = null;
		PreparedStatement pstm = null;
		try {
			// 3.
			
			pstm = con.prepareStatement(sql);
			pstm.setInt(1, mno);
			pstm.setString(2, mname);
			pstm.setString(3, nickname);
			
			int res = pstm.executeUpdate();
			
			if (res > 0) {
				rs = "입력 완료";
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(pstm);
			close(con);
		}

		return rs;

	}
	
	public String update() {
		System.out.println("수정할 번호 입력 : ");
		int mno = sc.nextInt();
		System.out.println("수정할 컬럼 입력 : (이름 or 별명)");
		String culumn = sc.next();
		System.out.println("수정할 이름 or 별명 입력 : ");
		String change = sc.next();
		
		Connection con = getConnection();
		String sql = null;
		if (culumn == "이름") {
			 sql = " UPDATE MYTEST "
					   + " SET MNAME = ? "
					   + " WHERE MNO = ? ";
		} else {
			sql = " UPDATE MYTEST "
					   + " SET NICKNAME = ? "
					   + " WHERE MNO = ? ";
		}
		String rs = null;
		PreparedStatement pstm = null;
		
		try {
			pstm = con.prepareStatement(sql);
			pstm.setString(1, change);
			pstm.setInt(2, mno);
			
			int res = pstm.executeUpdate();
			
			if (res > 0) {
				rs = "수정완료";
			}
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		} finally {
			close(pstm);
			close(con);
		}
		
		return rs;
	}
	
	public String delete() {
		System.out.println("삭제할 번호 입력 : ");
		int mno = sc.nextInt();
		
		Connection con = getConnection();
		
		String sql = " DELETE FROM MYTEST "
				   + " WHERE MNO = " + mno;
		
		Statement stmt = null;
		String rs = null;
		try {
			stmt = con.createStatement();
			
			int res = stmt.executeUpdate(sql);
			
			if (res > 0) {
				rs = "삭제성공";
			}
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		
		return rs;
	}
}
