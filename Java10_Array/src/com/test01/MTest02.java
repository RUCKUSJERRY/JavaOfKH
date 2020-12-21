package com.test01;

import java.util.Arrays;

public class MTest02 {

	public static void main(String[] args) {
		// ★ 배열은 처음 만들때 이미 크기가 고정이 된다.
		// 방법 1.
		// 큰 배열(왼쪽) 안에 작은 배열(오른쪽)이 들어간다
		int[][] a = new int[3][2];
		a[0][0] = 1;
		a[0][1] = 2;
		a[1][0] = 3;
		a[1][1] = 4;
		a[2][0] = 5;
		a[2][1] = 6;
		
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.deepToString(a));

		// 방법 2. 비정형 배열 (큰 배열(왼쪽)만 만들었다.)
		int[][] b = new int[3][];
		b[0] = new int[3];
		b[1] = new int[5];
		b[2] = new int[1];

		// int [][] b = new int[][] {{7,8}, {9,10}, {11,12}};
		System.out.println(Arrays.toString(b));
		System.out.println(Arrays.deepToString(b));

		// 방법 3.
		int[][] c = new int[][] { { 1, 2 }, { 3, 4, 5 }, { 6, 7, 8, 9 }, { 10 } };
		// int [][] c = {{13,14}, {15,16}, {17,18}};
		System.out.println(Arrays.toString(c));
		System.out.println(Arrays.deepToString(c));

		// 방법 4.
		int[][] d = { { 1, 2, 3, 4 }, { 5 }, { 6, 7 }, { 8, 9 }, { 10 } };

		// c가 가진 8 + d가 가진 9 출력
		System.out.println(c[2][2] + d[3][1]);
		// c의 length
		System.out.println(c.length);
		System.out.println(c[0].length);
		System.out.println(c[1].length);

		//prn(a);
		//prn(b);
		//prn(c);
		//prn(d);

		String[][] s = {{"Have", "a", "nice", "day"}, {"너무", "어려워"},{"일차원", "배열", "이차원", "배열"}};
		modi(s);		
	}
	public static void modi(String[][] arr) {
		// nice -> good
		// 어려워 -> 쉬워
		
		// 출력 예)
		// Hava a good day
		// 너무 쉬워
		// 일차원 배열 이차원 배열
		
		arr [0][2] = "good";
		arr [1][1] = "쉬워";
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if (j == arr[i].length-1) {	
					System.out.printf("%s", arr[i][j]);
				} else {
					System.out.printf("%s ", arr[i][j]);	
				}
				
			}
			System.out.println();
		}
		
	}

	public static void prn(int[][] arr) {
		// [
		// {1, 2, 3, 4},
		// {5},
		// {6, 7, 8},
		// {9, 10}
		// ]
		// hint! arr.length, arr[i].length
		System.out.println("[");
		for (int i = 0; i < arr.length; i++) {
			System.out.print("{");
			for (int j = 0; j < arr[i].length; j++) {
				if (j == arr[i].length - 1) {
					System.out.printf("%d", arr[i][j]);
				} else {
					System.out.printf("%d, ", arr[i][j]);
				}

			}
			if (i == arr.length - 1) {
				System.out.println("}");
			} else {
				System.out.println("},");
			}
		}
		System.out.println("]");

	}

}
