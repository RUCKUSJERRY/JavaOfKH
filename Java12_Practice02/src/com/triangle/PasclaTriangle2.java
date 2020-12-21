package com.triangle;

import java.util.Arrays;
import java.util.Scanner;

public class PasclaTriangle2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("level : ");
		int n = sc.nextInt();
		// 단계 입력
		
		
		int [][] arr = new int[n][];
		
		arr[0] = new int[] {1};
		System.out.println(Arrays.deepToString(arr));
		for (int i = 1; i < arr.length; i++) {
			arr[i] = new int [i+1]; // 작은 배열의 크기를 만들어줌
			System.out.println(Arrays.deepToString(arr));
			// 파스칼 숫자 계산해서 배열에 집어넣는 거
			// i는 큰배열, j는 작은배열
			for (int j = 0; j < arr[i].length; j++) {
				if (j == 0 || j == arr[i].length-1) {
					arr[i][j] = 1;
					//작은 배열의 첫번째와 마지막은 1이 들어가야된다.
				} else {
					arr[i][j] = arr[i-1][j-1] + arr[i-1][j];
					//첫번째와 마지막 사이의 값을 더해준다.
					//else부분은 
					//3, 0 = 1
					//3, 1 = (3-1)(1-1) + (3-1)(1) = 2, 0 + 2, 1
					//3, 2 = (3-1)(2-1) + (3-1)(2) = 2, 1 + 2, 2
					//3, 3 = 1
					
				}
				
			}
		}
		
		prn(arr);
	}
	
	private static void prn(int[][] arr) {
		//집어넣은 숫자를 호출하는 것
		for (int i = 0; i < arr.length; i++) {
			for (int j = arr.length; j > i; j--) {
				System.out.print("  ");
			}
			for (int j = 0; j < arr[i].length; j++) {
				System.out.printf("%4d", arr[i][j]);
			}
			System.out.println();
		}
	}
	
}
