package com.biz;

import java.util.List;

import com.dao.Scoredao;
import com.dao.ScoredaoImpl;
import com.dto.ScoreDto;

public class ScorebizImpl implements Scorebiz {

	private Scoredao dao = new ScoredaoImpl();
	
	@Override
	public List<ScoreDto> selectList() {
		return dao.selectList();
	}

	@Override
	public ScoreDto selectOne(int s_no) {
		return dao.selectOne(s_no);
	}

	@Override
	public int insert(ScoreDto dto) {
		return dao.insert(dto);
	}

	@Override
	public int update(int s_no, String cul, String chg) {
		return dao.update(s_no, cul, chg);
	}

	@Override
	public int delete(int s_no) {
		return dao.delete(s_no);
	}

}
