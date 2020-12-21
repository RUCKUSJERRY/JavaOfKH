package com.compare;

import java.util.Arrays;

public class MTest {

	public static void main(String[] args) {
		Score[] kh = new Score[3];
		kh[0] = new Score("이용준", 90, 89, 100);
		kh[1] = new Score("홍길동", 55, 100, 68);
		kh[2] = new Score("이순신", 100, 40, 80);
		
		for (Score student : kh) {
			System.out.println(student);
		}
		// sort는 () 안에 있는 애들을 비교해주는 건데 얘내들은 Comparable 해야된다.
		// 그래서 interface Comparable을 implements 해서 compareTo 메소드를 통해 정렬해준다.
		Arrays.sort(kh);
		System.out.println("-------------------------");
		for (Score student : kh) {
			System.out.println(student);
		}
		
	}
	
}
