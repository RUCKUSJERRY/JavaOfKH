package com.lotto;

import java.util.Arrays;

//{0, 0, 0, 0, 0, 0}
// {0, 0, 0, 0, 0, 0}
// {0, 0, 0, 0, 0, 0}
// {0, 0, 0, 0, 0, 0}
// {0, 1, 2, 3, 4, 5}
// hint [ a < b < c < d < e ]
// 양쪽 수 중에 작은 값이 출력되게

public class Lotto {

	// 로또 "배열"
	private int[] make() {
		int[] arr = new int[6];
		// 왜 0이 출력되는지 연구.

		for (int index = 0; index < 6; index++) {
			int insert = (int) (Math.random() * 45) + 1;
			if (!isSame(arr, insert)) { // 9
				arr[index] = insert;
			} 
			
		}

		/*
		 * int index = 0; 
		 * while (index < 6) {
		 * int insert = (int) (Math.random() * 45) + 1; 
		 * if (!isSame(arr, insert)) {
		 * arr[index] = insert;
		 * index++;
		 * } 
		 * 
		 * }
		 */
		return arr;

	}

	// 1 ~ 45 사이의 "중복 없는" 랜덤한 숫자 6개
	private boolean isSame(int[] arr, int insert) {
		boolean same = false;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == insert) { // 18
				same = true;
				break;
			}
		}

		return same;
	}

	// 정렬 되게
	private void sort(int[] arr) {
		// Arrays.sort(arr);

		for (int i = 0; i < arr.length; i++) {
			for (int j = 1; j < arr.length; j++) {
				if (arr[j] < arr[j - 1]) {
					int tmp = arr[j];
					arr[j] = arr[j - 1];
					arr[j - 1] = tmp;
				}
			}
		}

	}

	public void prn() {
		int[] arr = make();
		sort(arr);
		System.out.print("{");
		for (int i = 0; i < arr.length; i++) {
			System.out.printf("%3d", arr[i]);
		}
		System.out.println("}");

	}

	/*
	 * for (int i = 0; i < 5; i++) { for (int j = 0; j < 6; j++) { a [i][j] =
	 * rd.nextInt(44); System.out.printf("%3d", a [i][j] + 1 ); }
	 * System.out.println(); }
	 */

}
