package com.j05;

public class MTest {
	
	// 생성자를 명시하지 않으면, jvm이 기본생성자를 제공한다.
	// 기본생성자에, 부모 생성자를 호출하지 않으면, 자동으로 부모의 기본생성자를 호출하게 된다.
	// 그래서, Animal의 기본생성자를 호출하게 되는데 -> 이 때, 부모의 기본 생성자가 없어서 에러 발생.
	
	public static void main(String[] args) {
		Animal ba = new Beaver("비버",10);
		Animal eg = new Eagle("독수리", 5);
		// 비버랑, 독수리랑 객체 만들어서
		// 비버의 울음소리 : ??
		// 독소리의 울름소리 : ??
		
		System.out.println(ba);
		System.out.println(eg);
		ba.bark("비어비어");
		eg.bark("피조오오오온투");
		
	}

}
