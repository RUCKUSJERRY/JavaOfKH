package com.bbb;

import com.aaa.AAA;

public class MTest {

	public static void main(String[] args) {
		// 참조타입의 값은 instance (객체)
		// type 변수 = 값;
		// type 변수 = new 생성자();
		AAA myA = new AAA();
		myA.prn();
		System.out.println("myA.getter : " + myA.getAbc());
		
		AAA paramA = new AAA(10);
		paramA.prn();
		System.out.println("abc : " + paramA.getAbc());
		paramA.setAbc(100);
		System.out.println("abc : " + paramA.getAbc());
		System.out.println("==========================");
		
		BBB b1 = new BBB();
		b1.setAbc(10);
		b1.setBcd(20);
		System.out.println(b1.getSum());
		
		BBB b2 = new BBB(15);
		System.out.println(b2.getSum());
		
		BBB b3 = new BBB(20, 50);
		System.out.println(b3.getSum());
		
		AAA a1 = new AAA();
		AAA a2 = new BBB();
		// BBB a3 = (BBB) new AAA(); 자식 타입으로 부모 타입 못받음
		
		a1.prn();
		a2.prn(); // 부모의 prn메소드를 통해서 자식의 prn메소드를 호출한 것이다. -> Override
		a2.getAbc();
		//a2.getBcd();
		((BBB)a2).getBcd();
		// 여기서 b1 은 BBB의 부모(AAA)의 주소값을 가진다.
	}
	
}

