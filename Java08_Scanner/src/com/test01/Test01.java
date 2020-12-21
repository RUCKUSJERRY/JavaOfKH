package com.test01;

import java.util.Scanner;

public class Test01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("이름을 입력해주세요.");
		String name = sc.nextLine();
		System.out.println("아이디를 입력해주세요.");
		String id = sc.nextLine();
		System.out.println("[입력]\n아이디 : " + id + "\n이름: " + name);
		System.out.println("[출력]\n" + name + "님의 아이디는 " + id + "입니다");
		
	}
}
