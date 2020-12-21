package com.test02;

public class Gugudan {

	public static void main(String[] args) {
		// for 문을 사용하여 출력!!!!
		// while문 사용 금지!

		// 1. 2단 부터 9단 까지 전체 출력
		// gugu01();
		//guguwhile01();

		// 2. 아규먼트로 들어온 값의 단만 출력
		// gugu02(5);
		//guguwhile02(5);
		
		
		
		for (int a = 2; a < 10; a++) {
			System.out.println("<" + a + "단>");
			for (int b = 1; b < 10; b++) {
				System.out.print(a + " x " + b + " = " + (a * b) + "\n"); 
			}
			System.out.println();
		}
			
			int d = 5;
			System.out.println("<" + d + "단>");
		for (int c = 1; c < 10; c++) {
			System.out.printf("%d x %d = %d\n",d, c, (d * c));
		}
//
	}

	public static void guguwhile01() {
		int i = 2;
	

		while (i < 10) {
			
			System.out.println("\n<" + i + "단>");
			
			int j = 1;
			
			while (j < 10) {
				
				System.out.printf("%d * %d = %d\n",i,j,(i*j));
				j++;
			}
			
			
			i++;
			
			
					
		}
		
		
		}

	public static void guguwhile02(int dan) {
		//초기값
		System.out.println("\n<" + dan + "단>");
		int j = 1;
		//조건식
		
		while (j < 10) {
		
			System.out.printf("%d * %d = %d\n", dan, j, (dan * j));
			j++;	
		}
		
		//증감식
	}

	public static void gugu01() {

		for (int i = 2; i < 10; i++) {
			System.out.printf("\n<%d단>\n", i);

			for (int j = 1; j < 10; j++) {

				System.out.printf("%d * %d = %d\n", i, j, (i * j));
			}

		}

	}

	public static void gugu02(int dan) {
		System.out.println("\n<" + dan + "단>");

		for (int j = 1; j < 10; j++) {

			System.out.printf("%d * %d = %d\n", dan, j, (dan * j));

		}
	}

}
