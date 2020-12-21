package com.test01;

import java.util.Arrays;

public class MTest03 {

	/*
	 * 1번 문제. a b c d e f g h i j k l m n o p q r s t u v w x y z 출력! 단, 일차원 배열에,
	 * 반복문을 사용하여 알파벳을 저장한 후에 출력하자.
	 * 
	 * 
	 */

	public static void main(String[] args) {
		char[] ch = new char[26];
		int enter = 1;
		for (int i = 0; i < ch.length; i++) {
			ch[i] = (char) ('a' + i);
			System.out.printf("%s ", ch[i]);
			if (enter % 6 == 0) {
				
				System.out.println();	
		}     
			enter++;
			
		}
		System.out.println();
		System.out.println();
		// 2번문제. 1번에서 만든 배열을 거꾸로 출력하자.
		int count = 1;
		for (int i = ch.length; i > 0; --i) {
			System.out.printf("%s ", ch[i - 1]);

			if (count % 6 == 0) {
				System.out.println();
			}
			count++;
			
		}
		System.out.println();
		System.out.println();
		
	
		int cnt = 1;
		for (int i = 0; i < ch.length; i++) {
			ch[i] = Character.toUpperCase(ch[i]);
			System.out.printf("%s ", ch[i]);
			
			if (cnt % 6 == 0) {
				System.out.println();
			} 
			cnt++;
		}

}
	
}



