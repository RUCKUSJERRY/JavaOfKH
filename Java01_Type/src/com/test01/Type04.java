package com.test01;

public class Type04 {
	
	// 문자형 char (문자를 1개만 담을 수 있다.), 문자열 String, 논리형 boolean
	public static void main(String[] args) {
		// 문자형
		char c1 = 'a';
		System.out.println(c1);
		char c2 = 'z';
		int i1 = c2;
		System.out.println(i1);
		char sumCC1 = (char) (c1 + c2);
		System.out.println(sumCC1);// ascii code!!!!! 아스키코드 이해하자. + 유니코드
		
		// 문자열
		String s1 = "aa";
		System.out.println(s1);
		String s2 = "bb";
		System.out.println(s2);	
		String sumS = s1 + s2;
		System.out.println(sumS);
		
		String s3 = "1";
		String s4 = "2";
		String sumS2 = s3 + s4;
		System.out.println(sumS2);
		
		//논리형
		boolean b1 = true;
		boolean b2 = false;
		System.out.println(b1);
		System.out.println(b2);
		
		// unicode
		
		
	}

}
