package com.test04;

public class StarPrn {

	/* Prn01
	 * ★
	 * ★★
	 * ★★★
	 * ★★★★
	 * ★★★★★
	 */
	public void Prn01() {
		
		// i는 줄 (0, 1, 2, 3, 4)
		for(int i = 0; i < 5; i++) {
			// j는 ★ 개수 (0+1, 1+1, 2+1, 3+1, 4+1)
			for(int j = 0; j <= i; j++) {
				System.out.print("★");
			}
			System.out.println();
		}
		System.out.println();
	}
			
	/* Prn02
	 * ★★★★★
	 * ★★★★
	 * ★★★
	 * ★★
	 * ★
	 */
	public void Prn02() {
		for(int i = 5; i > 0; i--) {
			for(int j = 0; j < i; j++) {
				System.out.print("★");
			}
			System.out.println();
		}
		System.out.println();
	}
	
	
	/* Prn03
	 *     ★
	 *    ★★
	 *   ★★★
	 *  ★★★★
	 * ★★★★★
	 */

	public void Prn03() {
		for(int i = 1; i < 6; i++) {
			for(int j = 5; j > 0; j--) {
			if(i < j) {
				System.out.print(" ");
			} else {
				System.out.print("★");
			}
		}
			System.out.println();
		}
		System.out.println();

	}
	/* Prn04
	 * ★★★★★
	 *  ★★★★
	 *   ★★★
	 *    ★★
	 *     ★
	 */

	public void Prn04() {
		for(int i = 5; i > 0; i--) {
			for(int j = 0; j < i; j++) {
				if(i < j) {
					System.out.print(" ");
				} else {
					System.out.print("★");
				}
			}
				System.out.println();
				
			}
		System.out.println();
		}

	/* Prn05
	 *    ★
	 *   ★★★
	 *  ★★★★★
	 * ★★★★★★★
	 *★★★★★★★★★
	 */

	public void Prn05() {
			//초기값;  조건식;   증감식; -> 명령문
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < 4 - i; j++) {
				System.out.print(" ");
			}
			
		for(int s = 0; s < 2 * i + 1; s++) {
			System.out.print("★");
		    }

				System.out.println();
				
			}
		System.out.println();
	}

}
