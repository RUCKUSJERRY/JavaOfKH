package com.biz;

import java.util.List;

import com.dao.MyTestDao;
import com.dto.MyTestDto;

// Biz : Business Logic -> 연산/처리
public class MyTestBiz {
	
	private MyTestDao dao = new MyTestDao();
	
	public List<MyTestDto> selectList(){
		return dao.selectList();		
	}
	
	public List<MyTestDto> selectOne(){
		return dao.selectOne();		
	}
	
	public String insert(){
		return dao.insert();		
	}
	
	public String update(){
		return dao.update();		
	}
	
	public String delete(){
		return dao.delete();		
	}
}
