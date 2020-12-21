package com.test01;

import java.util.Random;

public class RandomTest01 {
	
	public static void main(String[] args) {
		useMathClass();
		useRandomClass();
	
	}
	// java.util.Random
	public static void useRandomClass() {
		Random rd = new Random();
		System.out.println(rd.nextInt(100));
		
		
	}
	
	// java.lang.Math
	public static void useMathClass() {
		
		// Math.random 은 0 <= ran < 1 실수값이 나온다.
		double ran = Math.random();
		System.out.println(ran);
		
		int min = 20;
		int max = 31;					//10 - 0 + 1 + 0
		int rd = (int)(Math.random() * (max - min)) + min;
		System.out.println("random : " + rd);
	}
}
