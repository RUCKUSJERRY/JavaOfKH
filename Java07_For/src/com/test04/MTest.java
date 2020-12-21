package com.test04;

public class MTest {
	/*
	 * 0.0 0.1 0.2 0.3 0.4 0.5 0.6 0.7 0.8 4
	 * 1.0 1.1 1.2 1.3 1.4 1.5 1.6 1.7 1.8 345
	 * 2.0 2.1 2.2 2.3 2.4 2.5 2.6 2.7 2.8 23456
	 * 3.0 3.1 3.2 3.3 3.4 3.5 3.6 3.7 3.8 1234567
	 * 4.0 4.1 4.2 4.3 4.4 4.5 4.6 4.7 4.8 012345678
	 */
	
	public static void main(String[] args) {
		
		for (int a = 0; a < 5; a++) {
			for (int b = 0; b < a; b++) {
				System.out.print(" ");
			}
			
			for (int k = 0; k < 5-a; k++) {
				System.out.print("★");
			}
			System.out.println();
		/*
		for (int a = 0; a < 5; a++) {
			for (int b = 0; b < 4 - a; b++) {
					System.out.print(" ");	
			} 
								
			for (int c = 0; c < a * 2 + 1;c++) {
				System.out.print("★");
			}
			System.out.println();
		*/
		}
		
		
	}
	
}
		//StarPrn Star = new StarPrn();
		
		//Star.Prn01();
		//Star.Prn02();
		//Star.Prn03();
		//Star.Prn04();
		//Star.Prn05();
			//2.1 2.2 2.3 2.4 2.5
		/* for (int a = 1; a < 6; a++) {
			for (int b = 1; b <= 6 - a;b++) {
				System.out.print("★");
			}
			System.out.println();
		}
		
		for (int c = 0; c < 5; c++) {
			for (int d = 0; d < c + 1;d++) {
				System.out.print("★");
			} 
			System.out.println();
		}
		*/
		
		/*
		0.4 0.3 0.2 0.1 0.0
		1.4 1.3 1.2 1.1 1.0
		2.4 2.3 2.2 2.1 2.0
		3.4 3.3 3.2 3.1 3.0
		4.4 4.3 4.2 4.1 4.0
		*/
		/*
		for (int e = 0; e < 5; e++) {
			for (int f = 0; f < 5; f++) {
				if (e > f) {
				System.out.print(" ");
			} else {
				System.out.print("★");	
			}
		
		}
			System.out.println();
		*/
		
		/*
		for (int c = 0; c < 5; c++) {
			for (int d = 0; d < c + 1;d++) {
				System.out.print("");
			}
			System.out.println();
		}
		*/


	

