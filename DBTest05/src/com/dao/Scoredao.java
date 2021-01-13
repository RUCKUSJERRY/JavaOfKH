package com.dao;

import java.util.List;

import com.dto.ScoreDto;

public interface Scoredao {

	String SELECT_LIST_SQL = " SELECT S_NO, S_NAME, S_KOR, S_ENG, S_MATH, S_SUM, S_AVG, S_GRADE "
			               + " FROM SCOREBOARD "
			               + " ORDER BY S_NO DESC ";
	String SELECT_ONE_SQL = " SELECT S_NO, S_NAME, S_KOR, S_ENG, S_MATH, S_SUM, S_AVG, S_GRADE "
                          + " FROM SCOREBOARD "
                          + " WHERE S_NO = ? ";
	String INSERT_SQL = " INSERT INTO SCOREBOARD(S_NO, S_NAME, S_KOR, S_ENG, S_MATH) " 
			          + " VALUES (SCORESEQ.NEXTVAL, ?, ?, ?, ?) ";
	String UPDATE_SQL = " UPDATE SCOREBOARD SET ";
	String DELETE_SQL = " DELETE FROM SCOREBOARD "
			          + " WHERE S_NO = ? ";
	
	public List<ScoreDto> selectList();
	public ScoreDto selectOne(int s_no);
	public int insert(ScoreDto dto);
	public int update(int s_no, String cul, String chg);
	public int delete(int s_no);
	
}
