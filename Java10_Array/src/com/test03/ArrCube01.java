package com.test03;

import java.util.Arrays;

public class ArrCube01 {
	/*
	 * 1 4 7 
	 * 2 5 8 
	 * 3 6 9
	 * 
	 * 모양의 이차원 배열을 만들어서 출력하자.
	 */

	public static void main(String[] args) {
		/*
		 * [0,0] [0,1] [0,2] 
		 * [1,0] [1,1] [1,2] 
		 * [2,0] [2,1] [2,2]
		 */

		int[][] a = new int[3][3];
		//cube(a);
		cubeT(a);

	}

	public static void cube(int[][] arr) {

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				//System.out.printf("%d " ,i + ((i + j) * 2 + 1));
				//System.out.print(i);
				System.out.printf("%2d", j + i + (j * 2 + 1));
				//0 1 2 -> 1 4 7
				//1 2 3 -> 2 5 8
				//2 3 4 -> 3 6 9			
			} 
			System.out.println();
		}
		System.out.println();
	}

	public static void cubeT(int[][] arr2) {
		
		//만들기
		int cnt = 1;
		for (int i = 0; i < arr2.length; i++) {
			for (int j = 0; j < arr2[i].length; j++) {			
				arr2[j][i] = cnt++;
				
			}
			System.out.println();
			System.out.print(Arrays.deepToString(arr2));
		}	
		System.out.println();
		//출력하기
		for (int i = 0; i < arr2.length; i++) {
			for (int j = 0; j < arr2[i].length; j++) {
				System.out.printf("%2d", arr2[i][j]);
			}
			
			System.out.println();
		}
	}
}
