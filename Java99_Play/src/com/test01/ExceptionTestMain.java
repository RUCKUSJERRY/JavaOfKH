package com.test01;

import java.util.Arrays;

public class ExceptionTestMain {

	public static void main(String[] args) {
		Object[] sarr = new String[3];
		
		
		sarr[0] = new String("123");
		
		sarr[1] = String.valueOf(new Integer(456));

		sarr[2] = String.valueOf(789);
		
		for(Object obj : sarr) {
			System.out.println(obj);
		}
		
	}
}
