package com.test03;

public class SumX {
	/*
	 * 1(1.1) 2 3 4 5(1.5) 
	 * 6 7(2.2) 8 9(2.4) 10 
	 * 11 12 13(3.3) 14 15 
	 * 16 17(4.2) 18 19(4.4) 20 
	 * 21(5.1) 22 23 24 25(5.5)
	 * 
	 * 이렇게 출력하고, X의 합을 출력하자.
	 */
	public static void main(String[] args) {

		int count = 0;
		int sum = 0;

		for (int a = 1; a < 6; a++) {
			for (int b = 1; b < 6; b++) {

				++count;
				if (a == b || (a + b) == 6) {
					sum += count;
				}
				System.out.printf("%3d", count);
			}
			System.out.println();
		}
		System.out.println(sum);
	}

}

/*
 * int count = 1; int sum = 0; for (int i = 0; i < 5; i++) { for (int j = 0; j
 * <5; j++) { if (i == j || i + j == 4) { sum += count;
 * 
 * } System.out.printf("%3d", count++); } System.out.println(); }
 * System.out.println("X의 합은 : " + sum);
 * 
 * // Prn01();
 * 
 * }
 * 
 * public static void Prn01() {
 * 
 * int sum = 0;
 * 
 * for (int i = 1; i < 26; i++) {
 * 
 * System.out.printf("%d  ", i); if (i % 5 == 0) { System.out.println();
 * 
 * for (int j = 1; j < 6; j++) {
 * 
 * }
 * 
 * 
 * } } }
 */
