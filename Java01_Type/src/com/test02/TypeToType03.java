package com.test02;

public class TypeToType03 {

	public static void main(String[] args) {
		
		// boxing 
		Integer i = new Integer(100);
		System.out.println(i);
		System.out.println(i.doubleValue());
		
		// unboxing
		// 명시적
		double j = i.doubleValue();
		System.out.println(j);
		// 묵시적
		double k = i;
		System.out.println(k);
		
		
	}
}
