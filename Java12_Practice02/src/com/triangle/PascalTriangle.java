package com.triangle;

import java.util.Scanner;

/*
 *          1
 *        1   1
 *      1   2   1
 *    1   3   3   1
 *  1   4   6   4   1
 *1   5   10  10  5   1
 *     ...  
 *          
 */

public class PascalTriangle {
	
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		System.out.println("Jerry's 파스칼의 삼각형");
		System.out.println("원하는 단계를 입력해주세요.");
		int level = sc.nextInt();
		makeTriangle(level+1);
		//makePascal(level);

	}

	private static void makeTriangle(int level) {

		int[][] inPutpascal = new int[level][level];
		int[][] pascalnum = makePascal(level);
		for (int i = 0; i < level; i++) {
			for (int j = level; j > i; j--) {
				System.out.print("  ");
			}
			for (int k = 0; k < i; k++) {	
					inPutpascal[i][k] = pascalnum [i][k];
					System.out.printf("%4d", inPutpascal[i][k]);
			}
			System.out.println();	
		}
	}
	private static int[][] makePascal(int level) {

		int[][] pascal = new int[level][];

		for (int i = 0; i < pascal.length; i++) {
			pascal[i] = new int [i+1];
			for (int j = 0; j < i; j++) {
				if (i - 1 < 0 || j - 1 < 0) {
					pascal[i][j] = 1;
				} else
					pascal[i][j] = pascal[i - 1][j - 1] + pascal[i - 1][j];		
			}				
			
		}

		/*
		 * A1 (1) 
		 * B1 (1) B2 (A1 + 1) 
		 * C1 (1) C2 (B1 + B2) C3 (B2 + 1) 
		 * D1 (1) D2 (C1 + C2) D3 (C2 + C3) D4 (C3 + 1) 
		 * E1 (1) E2 (D1 + D2) E3 (D2 + D3) E4 (D3 + D4) E5 (D4 + 1)
		 * 
		 * 
		 */

		return pascal;	
	}

}

/* 
 * 1 0.0 1 1.0 1.1 1 2.0 2.1 2.2 1 3.0 3.1 3.2 3.3 1 4.0 4.1 4.2 4.4
 * 
 * 1+0.0 1+1.0 1+1.0+1.1
 * 
 */
