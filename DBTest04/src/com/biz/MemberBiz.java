package com.biz;

import java.util.List;

import com.dto.MemberDto;

public interface MemberBiz {

	public List<MemberDto> selectList();
	public MemberDto selectOne(int m_no);
	public int insert(MemberDto dto);
	public int update(int m_no, String cul, String chg);
	public int delete(int m_no);
	
}
