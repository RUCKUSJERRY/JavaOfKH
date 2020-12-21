package com.test01;

public class WhileTest {

	public static void main(String[] args) {
		// 1. 1 ~ 100까지의 숫자를 역순으로 출력하자.
		//Test01();
		int i = 1;
		//while (i >= 1) {
		//	System.out.println(i);
		//	i--;
		//}

		// 2. 1 ~ 100까지의 숫자 중, 2의 배수만 출력하자.
		//Test02();
		//while (i < 101) {
		//	if (i % 2 == 0) {
		//		System.out.println(i);
		//	}
		//	i++;
		//}

		// 3. 1 ~ 100 까지의 숫자 중, 7의 배수의 갯수와, 7의 배수의 총 합을 출력하자.
		int count = 0;
		int sum = 0;
		//Test03();
		while (i < 101) {
			if (i % 7 == 0) {
				count++;
				sum += i;
			}
			i++;
		}
		System.out.print("7의 배수의 개수 : " + count + "\n7의 배수의 총합 : " + sum);
	}

	public static void Test01() {
		// 초기값
		int i = 100;
		// 조건식
		while (i >= 1) {
			System.out.println(i);
			i--;

		}

		System.out.println("While이 끝난 후의 i : " + i);
		System.out.println("___________________________");
	}

	public static void Test02() {
		// 초기값
		int i = 1;

		// 조건식
		while (i < 101) {
			// 만일, i가 2의 배수라면, i를 출력하자.
			if (i % 2 == 0) {
				System.out.println(i);
			}
			// 증감식
			i++;

		}
		/*
		 * int i = 2; while (true) { System.out.println(i); i = i + 2;
		 * 
		 * if (i > 100) { break; }
		 */
		System.out.println("___________________________");
	}

	public static void Test03() {
		// 3. 1 ~ 100 까지의 숫자 중, 7의 배수의 갯수와, 7의 배수의 총 합을 출력하자.

		// 초기값
		int i = 1;
		int count = 0;
		int sum = 0;

		// 조건식
		// 만일, i 가 7의 배수라면 그 숫자를 카운트 해라.
		// 만일, i 가 7의 배수라면 그 숫자를 sum 해라.
		while (i < 101) {
			if (i % 7 == 0) {
				System.out.printf("%d ", i);

				// 7의 배수의 갯수
				count++;
				sum += i;
				System.out.printf("%d ", count);
				System.out.printf("%d\n", sum);
			}
			// 증감식
			i++;
		}
		System.out.printf("\n7의 배수의 개수는 : %d\n7의 배수의 총합은 : %d", count, sum);

	}

}
