package com.cal01;

import java.util.Scanner;

public class MTest {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("년도를 입력해주세요.");
		int year = sc.nextInt();
		System.out.println("월을 입력해주세요.");
		int month = sc.nextInt();
		
		DayOfCalendar.prn(year, month);
		
	}
	
}
