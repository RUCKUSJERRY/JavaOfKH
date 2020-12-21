package com.test01;

/**
 * javadoc TEST <br>
 * Hello, World! 를 출력하는 class <br><br>
 * 
 * javadoc 만드는 방법 <br>
 * project 우클릭 - export - javadoc - %JAVA_HOME%\bin\javadoc.exe<br>
 * VM 옵션에
 * -locale ko_KR -encoding UTF-8 -charset UTF-8 -docencoding UTF-8
 * 추가!
 * 
 * @author yongj
 *
 */
public class Type01 {

	public static void main(String[] args) {
		
		// 주석 = 설명
		System.out.println("Hello, World!");
		/*
		 * 여러 줄 주석
		 * compile 시, 주석은 제거됨
		 */
	}
}
