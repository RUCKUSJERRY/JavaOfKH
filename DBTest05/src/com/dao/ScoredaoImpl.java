package com.dao;

import static com.common.JDBCTemplate.*;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import com.dto.ScoreDto;

public class ScoredaoImpl implements Scoredao {

	@Override
	public List<ScoreDto> selectList() {

		Connection con = getConnection();
		PreparedStatement pstm = null;
		ResultSet rs = null;

		List<ScoreDto> list = new ArrayList<ScoreDto>();

		try {

			pstm = con.prepareStatement(SELECT_LIST_SQL);
			rs = pstm.executeQuery();

			while (rs.next()) {
				ScoreDto dto = new ScoreDto();
				dto.setS_no(rs.getInt(1));
				dto.setS_name(rs.getString(2));
				dto.setS_kor(rs.getInt(3));
				dto.setS_eng(rs.getInt(4));
				dto.setS_math(rs.getInt(5));

				list.add(dto);

			}

		} catch (SQLException e) {

			e.printStackTrace();
		} finally {
			close(rs);
			close(pstm);
			close(con);
		}
		System.out.println(list.iterator());
		return list;
	}

	@Override
	public ScoreDto selectOne(int s_no) {

		Connection con = getConnection();
		PreparedStatement pstm = null;
		ResultSet rs = null;
		ScoreDto dto = new ScoreDto();

		try {

			pstm = con.prepareStatement(SELECT_ONE_SQL);
			pstm.setInt(1, s_no);

			rs = pstm.executeQuery();

			while (rs.next()) {

				dto.setS_no(rs.getInt(1));
				dto.setS_name(rs.getString(2));
				dto.setS_kor(rs.getInt(3));
				dto.setS_eng(rs.getInt(4));
				dto.setS_math(rs.getInt(5));

			}

		} catch (SQLException e) {

			e.printStackTrace();

		} finally {
			close(rs);
			close(pstm);
			close(con);
		}

		return dto;
	}

	@Override
	public int insert(ScoreDto dto) {

		Connection con = getConnection();
		PreparedStatement stmt = null;
		int res = 0;

		try {
			stmt = con.prepareStatement(INSERT_SQL);
			stmt.setString(1, dto.getS_name());
			stmt.setInt(2, dto.getS_kor());
			stmt.setInt(3, dto.getS_eng());
			stmt.setInt(4, dto.getS_math());
			// stmt.setInt(5, dto.getSum());
			// stmt.setDouble(6, dto.getAvg());
			// stmt.setString(7, dto.getGrade());

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
	public int update(int s_no, String cul, String chg) {

		Connection con = getConnection();
		Statement stmt = null;
		int res = 0;

		try {
			stmt = con.createStatement();

			switch (cul) {
			case "이름":
				res = stmt.executeUpdate(UPDATE_SQL + " S_NAME = '" + chg + "' WHERE S_NO = " + s_no);
				break;
			case "국어":
				res = stmt.executeUpdate(UPDATE_SQL + " S_KOR = " + chg + " WHERE S_NO = " + s_no);
				break;
			case "영어":
				res = stmt.executeUpdate(UPDATE_SQL + " S_ENG = " + chg + " WHERE S_NO = " + s_no);
				break;
			case "수학":
				res = stmt.executeUpdate(UPDATE_SQL + " S_MATH = " + chg + " WHERE S_NO = " + s_no);
				break;

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
	public int delete(int s_no) {

		Connection con = getConnection();
		PreparedStatement pstm = null;
		int res = 0;

		try {
			pstm = con.prepareStatement(DELETE_SQL);
			pstm.setInt(1, s_no);

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

}
