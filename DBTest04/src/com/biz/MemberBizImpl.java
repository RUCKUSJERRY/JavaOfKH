package com.biz;

import java.util.List;

import com.dao.MemberDao;
import com.dao.MemberDaoImpl;
import com.dto.MemberDto;

public class MemberBizImpl implements MemberBiz {

	private MemberDao dao = new MemberDaoImpl();
	
	@Override
	public List<MemberDto> selectList() {
		return dao.selectList();
	}

	@Override
	public MemberDto selectOne(int m_no) {
		return dao.selectOne(m_no);
	}

	@Override
	public int insert(MemberDto dto) {
		// M_GENDER에 들어있는 값을 대문자로 바꾸자.
		dto.setM_gender((dto.getM_gender().toUpperCase()));
		return dao.insert(dto);
	}

	@Override
	public int update(int m_no, String cul, String chg) {
		return dao.update(m_no, cul, chg);
	}

	@Override
	public int delete(int m_no) {
		return dao.delete(m_no);
	}

}
