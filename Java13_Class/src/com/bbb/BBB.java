package com.bbb;

import com.aaa.AAA;

// super : 부모 (상속) 
// this ---(extends)---> super
public class BBB extends AAA {
	
	private int bcd;
	
	public BBB() {
		// super(); 써주지 않아도 기본생성자 호출
		System.out.println("BBB 생성");
	}
	
	public BBB(int abc) {
		// 부모생성자(param) 호출
		super(abc);
		bcd = 10;
		System.out.println("BBB 생성 -> abc : " + abc);
	}
	
	public BBB(int abc, int bcd) {
		// 부모로 전달
		super(abc);
		// 필드 초기화
		this.bcd = bcd;
		System.out.printf("BBB 생성 -> abc : %d, bcd : %d\n", abc, bcd);
	}
	
	public int getBcd() {
		return bcd;
	}
	
	public void setBcd(int bcd) {
		this.bcd = bcd;
	}
	
	public int getSum() {
		//int sum = super.getAbc() + this.getBcd();
		int sum = getAbc() + getBcd();
		
		return sum;
	}
	
	@Override  //(재정의)
	public void prn() {
		System.out.println("BBB.prn()");
	}
	
	
	
}
