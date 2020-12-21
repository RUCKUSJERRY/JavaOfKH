package com.test05;

public class MTest {

	public static void main(String[] args) {
		TV ig = new IgTV();						// ig tv 구매
		System.out.println(ig.volumeup());  	// 1
		System.out.println(ig.volumeup());		// 2
		System.out.println(ig.volumeup());		// 3
		System.out.println(ig.volumeup());		// 4
		
		System.out.println(ig.volumedown());	// 3
		System.out.println(ig.volumedown());	// 2
		System.out.println(ig.volumedown());	// 1
		System.out.println(ig.volumedown());	// 0
		
		TV samsong = new SamsongTV();				// samsong tv 구매
		System.out.println(samsong.volumeup());  	// 3
		System.out.println(samsong.volumeup());		// 6
		
		System.out.println(samsong.volumedown());	// 3
		System.out.println(samsong.volumedown());	// 0

		
	}
}
