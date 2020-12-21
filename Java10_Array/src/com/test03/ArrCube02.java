package com.test03;

public class ArrCube02 {
	/*
	 * 1  2  3  4  5
	 *10  9  8  7  6  6  7  8  9 10
	 *11 12 13 14 15
	 *20 19 18 17 16 16 17 18 19 20
	 *21 22 23 24 25
	 *
	 *[0,0] [0,1] [0,2] [0,3] [0,4]
     *[1,0] [1,1] [1,2] [1,3] [1,4]
	 *[2,0] [2,1] [2,2] [2,3] [2,4]
	 *[3,0] [3,1] [3,2] [3,3] [3,4]
	 *[4,0] [4,1] [4,2] [4,3] [4,4]
	 *모양의 이차원 배열을 만들어서 출력하자.	 
	 */
	public static void main(String[] args) {
	
	int [][] a = new int [5][5];
	cube(a);
	cubeT(a);			
	}
	
	public static void cube(int[][] arr) {
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {	
				++count;
				if (i == 1 || (i == 3)) {
					System.out.printf("%3d", ((count - ((i * 10) + 6)) * -1));
				} else {
					System.out.printf("%3d", count);
				}
				
			}
			
			System.out.println();
		}
		
		
	}
	
	public static void cubeT(int[][] arr2) {
		// 만들기 = 각 배열의 위치에 숫자 넣기
		int cnt = 1;
		for (int i = 0; i < arr2.length; i++) {	
			// i = 0, 2, 4
			if (i % 2 == 0) {
			// 정방향	
				for (int j = 0; j < arr2[i].length; j++) {
					arr2[i][j] = cnt++;	
				}
			} else {
				for (int j = arr2[i].length-1; j >= 0; j--) {
					arr2[i][j] = cnt++;			
				}
			// 역방향	
			}
		}
		
		//출력 = 넣어져 있는 숫자 출력하기
		for (int i = 0; i < arr2.length; i++) {
			for (int j = 0; j < arr2[i].length; j++) {
				System.out.printf("%3d", arr2[i][j]);
			}
			
			System.out.println();
		}
	}
	
}
