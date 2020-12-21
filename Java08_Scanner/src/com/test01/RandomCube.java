package com.test01;

import java.util.Random;

public class RandomCube {

	public static void main(String[] args) {
		/*
		 * 1 ~ 9 사이의 난수로 이루어진
		 * 5 * 5 형태의 숫자들을 출력하고,
		 * 전체 난수의 합,
		 * 전체 난수의 평균,
		 * X의 합
		 * 을 구하자.
		 */
		
		prnCube();
	}
	
	public static void prnCube() {
		
		Random rd = new Random();
		int getSum = 0;
		int getXsum = 0;
		int count = 0;
		int getAvg = 0;
		
		// int random = (int)(Math.random()*(9)) + 1;
		// System.out.printf(%2d", random);
		for (int a = 0; a < 5; a++) {
			for (int b = 0; b < 5; b++) {
				int num = rd.nextInt(8) + 1;
				System.out.print(num + " ");
				++count;
				getSum += num;
				if (a == b || a + b == 4) {
					getXsum += num;
				}
			}
			System.out.println();
			
		}
		getAvg = getSum / count;
		System.out.println("난수의 총합 : " + getSum);
		System.out.println("난수의 평균 : " + getAvg);
		System.out.println("난수의 X 총합 : " + getXsum);
		
	}
}
