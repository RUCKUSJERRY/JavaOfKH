package com.dao;

import java.util.List;

import com.dto.MemberDto;

public interface MemberDao {

	String SELECT_LIST_SQL = " SELECT M_NO, M_NAME, M_AGE, M_GENDER, M_LOCATION, M_JOB, M_TEL, M_EMAIL "
	                       + " FROM TB_MEMBER ";
	String SELECT_ONE_SQL = " SELECT M_NO, M_NAME, M_AGE, M_GENDER, M_LOCATION, M_JOB, M_TEL, M_EMAIL " 
	                      + " FROM TB_MEMBER "
			              + " WHERE M_NO = ";
	
	String INSERT_SQL = " INSERT INTO TB_MEMBER VALUES ( MEMBERSEQ.NEXTVAL , ? , ? , ? , ? , ? , ? , ? ) ";
	String UPDATE_SQL = " UPDATE TB_MEMBER SET ";
	String DELETE_SQL = " DELETE FROM TB_MEMBER " + " WHERE M_NO = ? ";
	
	public List<MemberDto> selectList();
	public MemberDto selectOne(int m_no);
	public int insert(MemberDto dto);
	public int update(int m_no, String cul, String chg);
	public int delete(int m_no);
	
}
