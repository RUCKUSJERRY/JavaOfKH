package com.biz;

import java.util.List;

import com.dto.ScoreDto;

public interface Scorebiz {

	public List<ScoreDto> selectList();
	public ScoreDto selectOne(int s_no);
	public int insert(ScoreDto dto);
	public int update(int s_no, String cul, String chg);
	public int delete(int s_no);
	
}
