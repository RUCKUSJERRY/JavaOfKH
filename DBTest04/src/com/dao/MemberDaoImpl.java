package com.dao;

import static com.common.JDBCTemplate.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.dto.MemberDto;

public class MemberDaoImpl implements MemberDao {

	@Override
	public List<MemberDto> selectList() {

		/*
		 * teacher
		 * 
		 * Connection con = getConnection(); Statement stmt = null;
		 * 
		 * ResultSet rs = null;
		 * 
		 * List<MemberDto> list = new ArrayList<MemberDto>();
		 * 
		 * try {
		 * 
		 * //3. stmt = con.createStatement();
		 * 
		 * // 4. rs = stmt.executeQuery(SELECT_LIST_SQL);
		 * 
		 * while (rs.next()) { 
		 * MemberDto dto = new MemberDto();
		 * dto.setM_no(rs.getInt(1)); 
		 * dto.setM_name(rs.getString(2));
		 * dto.setM_age(rs.getInt(3)); 
		 * dto.setM_gender(rs.getString(4));
		 * dto.setM_location(rs.getString(5)); 
		 * dto.setM_job(rs.getString(6));
		 * dto.setM_tel(rs.getString(7)); 
		 * dto.setM_email(rs.getString(8));
		 * 
		 * list.add(dto);
		 * 
		 * } 
		 * 
		 * } catch (SQLException e) {
		 * 
		 * e.printStackTrace(); 
		 * 
		 * } finally { 
		 * 
		 * close(rs); 
		 * close(pstm); 
		 * close(con); 
		 * 
		 * }
		 *
		 * 
		 * return list;
		 * 
		 * 
		 */

		Connection con = getConnection();

		PreparedStatement pstm = null;
		ResultSet rs = null;

		List<MemberDto> list = new ArrayList<MemberDto>();

		try {
			pstm = con.prepareStatement(SELECT_LIST_SQL);
			rs = pstm.executeQuery();

			while (rs.next()) {

				MemberDto temp = new MemberDto();
				temp.setM_no(rs.getInt(1));
				temp.setM_name(rs.getString(2));
				temp.setM_age(rs.getInt(3));
				temp.setM_gender(rs.getString(4));
				temp.setM_location(rs.getString(5));
				temp.setM_job(rs.getString(6));
				temp.setM_tel(rs.getString(7));
				temp.setM_email(rs.getString(8));

				list.add(temp);

			}

		} catch (SQLException e) {

			e.printStackTrace();
		} finally {
			close(rs);
			close(pstm);
			close(con);
		}

		return list;
	}

	@Override
	public MemberDto selectOne(int m_no) {

		Connection con = getConnection();

		Statement stmt = null;
		ResultSet rs = null;

		MemberDto dto = null;


		try {
			stmt = con.createStatement();

			rs = stmt.executeQuery(SELECT_ONE_SQL + m_no);

			while (rs.next()) {
				dto = new MemberDto();
				dto.setM_no(rs.getInt(1));
				dto.setM_name(rs.getString(2));
				dto.setM_age(rs.getInt(3));
				dto.setM_gender(rs.getString(4));
				dto.setM_location(rs.getString(5));
				dto.setM_job(rs.getString(6));
				dto.setM_tel(rs.getString(7));
				dto.setM_email(rs.getString(8));
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

	@Override
	public int insert(MemberDto dto) {
		Connection con = getConnection();

		PreparedStatement stmt = null;
		int res = 0;

		try {
			stmt = con.prepareStatement(INSERT_SQL);
			//stmt.setInt(1, dto.getM_no());
			stmt.setString(1, dto.getM_name());
			stmt.setInt(2, dto.getM_age());
			stmt.setString(3, dto.getM_gender());
			stmt.setString(4, dto.getM_location());
			stmt.setString(5, dto.getM_job());
			stmt.setString(6, dto.getM_tel());
			stmt.setString(7, dto.getM_email());

			res = stmt.executeUpdate();

			if (res > 0) {
				commit(con);
			}

		} catch (SQLException e) {

			e.printStackTrace();
		} finally {
			close(stmt);
			close(con);
		}

		return res;
	}

	@Override
	public int update(int m_no, String cul, String chg) {
		
		Connection con = getConnection();
		Statement stmt = null;
		int res = 0;

		try {
			
			stmt = con.createStatement();
			
			if (cul.equals("이름")) {
				res = stmt.executeUpdate(UPDATE_SQL + " M_NAME = '" + chg + "' WHERE M_NO = " + m_no);
				
			} else if (cul.equals("나이")) {
				res = stmt.executeUpdate(UPDATE_SQL + " M_AGE = " + Integer.parseInt(chg) + " WHERE M_NO = " + m_no);
				
			} else if (cul.equals("성별")) {
				res = stmt.executeUpdate(UPDATE_SQL + " M_GENDER = '" + chg + "' WHERE M_NO = " + m_no);
				
			} else if (cul.equals("주소")) {
				res = stmt.executeUpdate(UPDATE_SQL + " M_LOCATION = '" + chg + "' WHERE M_NO = " + m_no);
				
			} else if (cul.equals("직업")) {
				res = stmt.executeUpdate(UPDATE_SQL + " M_JOB = '" + chg + "' WHERE M_NO = " + m_no);
				
			} else if (cul.equals("전화번호")) {
				res = stmt.executeUpdate(UPDATE_SQL + " M_TEL = '" + chg + "' WHERE M_NO = " + m_no);
				
			} else if (cul.equals("이메일")) {
				res = stmt.executeUpdate(UPDATE_SQL + " M_EMAIL = '" + chg + "' WHERE M_NO = " + m_no);
				
			}
		
			if (res > 0) {
				commit(con);
			}

		} catch (SQLException e) {

			e.printStackTrace();
		} finally {
			close(stmt);
			close(con);
		}

		return res;
	}
	
	@Override
	public int delete(int m_no) {
		
		Connection con = getConnection();
		PreparedStatement pstm = null;
		int res = 0;
		
		try {
			pstm = con.prepareStatement(DELETE_SQL);
			pstm.setInt(1, m_no);
			res = pstm.executeUpdate();
			
			if(res > 0) {
				commit(con);
			}
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		return res;
	}

}
