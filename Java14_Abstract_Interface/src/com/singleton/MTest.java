package com.singleton;

public class MTest {

	public static void main(String[] args) {
		//Singleton singleton = new Singleton();
		//여러개의 변수가 1개의 주소를 가져다 쓰고 있다.
		Singleton s1 = Singleton.getInstace();
		System.out.println(s1);
		System.out.println(s1.hashCode());
		
		Singleton s2 = Singleton.getInstace();
		System.out.println(s2);
		System.out.println(s2.hashCode());
		
	}
	
	
}
