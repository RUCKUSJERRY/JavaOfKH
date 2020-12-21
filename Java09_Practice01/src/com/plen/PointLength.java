package com.plen;

import java.util.Scanner;

public class PointLength {

	
	static Scanner sc = new Scanner(System.in);
	// hint : java.lang.Math
	
	public static void main(String[] args) {
		
		//원점부터 입력한 (x, y) 좌표까지의 거리를 구하자.
		
		System.out.println("x 좌표 : ");
		int x = sc.nextInt();
		System.out.println("y 좌표 : ");
		int y = sc.nextInt();
		double res = pLength(x, y);
		System.out.printf("(0, 0) 부터 (%d, %d) 까지의 거리는 %.2f 입니다", x, y, res);
		
	}

	public static double pLength(int a, int b) {
		//return Math.hypot(a, b);
		return Math.sqrt((Math.pow(a, 2)) + (Math.pow(b, 2)));
		
		//Math.pow(a, b) : a^b
		//Math.sqrt(a) : root(a)
		//Math.hypot(a, b) : root(a^2 + b^2)
	}
	
}
