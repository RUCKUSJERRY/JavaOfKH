package com.biz;

import java.util.List;

import com.dao.MyTestDao;
import com.dto.MyTestDto;

// Biz : Business Logic -> 연산/처리
// 여기가 연산 처리라고 하는데 사실 이해 잘 못하겠고
// 그냥 여기에 메소드가 있으니까 여기를 통해서 한번 타고 들어가는구나 라고 나는 이해했어 그 다음에
public class MyTestBiz {

	private MyTestDao dao = new MyTestDao();

	public List<MyTestDto> selectList() {
		return dao.selectList();
	}

	public MyTestDto selectOne(int mno) {
		return dao.selectOne(mno);
	}

	public int insert(MyTestDto dto) {
		return dao.insert(dto);
	}

	public int update(MyTestDto dto) {
		return dao.update(dto);
	}

	public int delete(int mno) {
		return dao.delete(mno);
	}

	/*
	 * public List<MyTestDto> selectOne() { return dao.selectOne(); }
	 * 
	 * public String update() { return dao.update(); }
	 * 
	 * public String delete() { return dao.delete(); }
	 */

}
