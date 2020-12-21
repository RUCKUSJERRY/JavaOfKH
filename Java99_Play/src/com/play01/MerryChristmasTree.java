package com.play01;

public class MerryChristmasTree {

	public static void main(String[] args) {

		tree01();
		tree02();
		tree03();

	}

	public static void tree01() {
		for (int a = 3; a > 0; a--) {

			for (int i = 0; i < 5; i++) {
				for (int j = 5; j > i; j--) {
					System.out.print(" ");
				}
				for (int k = 0; k < (i * 2 + 1); k++) {
					System.out.print("★");
				}
				System.out.println();
			} if (a == 1) {
				for (int b = 0; b < 5; b++) {
					System.out.print("    ");
					for (int c = 0; c < 5; c++) {
						System.out.print("■");	
					}
				  System.out.println();
				}
			}
		}
		// 1 2*0+1
		// 3 2*1+1
		// 5 2*2+1
		// 7 2*3+1
		// 9 2*4+1

		System.out.println();
	}

	public static void tree02() {

	}

	public static void tree03() {

	}

}
