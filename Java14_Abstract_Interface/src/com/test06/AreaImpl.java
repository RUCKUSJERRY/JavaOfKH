package com.test06;

public abstract class AreaImpl implements Area {

	private String result;
	
	@Override
	public void print() {
		// super.PRINT X -> super : 부모 "객체"
		// area.PRINT = "abcd" X -> static final 상수라서 값을 바꿔주지 못한다.
		// 상수는 스네이크 표기법으로 한다. 대문자_대문자_대문자
		System.out.println(Area.PRINT + result);
	}
	
	@Override
	public abstract void make();

	public void setResult(String result) {
		this.result = result;
	}
	
}
