package com.cal;

import java.util.Scanner;

/*
 * ① 서력 기원 연수가 4로 나누어 떨어지는 해는 우선 윤년으로 하고,
 * ② 그 중에서 100으로 나누어 떨어지는 해는 평년으로 하며,
 * ③ 다만 400으로 나누어 떨어지는 해는 다시 윤년으로 정하였다.
 */
public class LeapYear {
	
	static Scanner sc = new Scanner(System.in);
	
		
	public static boolean isLeapYear(int year) {
		int a = 4;
		int b = 100;
		int c = 400;
		if (year % a == 0 && year % b == 0 && year % c == 0) {
			System.out.println("윤년이 맞습니다.");	
		} else if (year % a == 0 && year % b == 0) {
			System.out.println("윤년이 아닙니다.");
		} else if (year % a == 0){
			System.out.println("윤년이 맞습니다.");
		} else {
			System.out.println("윤년이 아닙니다.");
		}
		return false;
			
	}
	
	public static void main(String[] args) {
		
		System.out.println("연도를 입력해주세요.");
		int a = sc.nextInt();
		isLeapYear(a);
		
		
		
		
		
		// 입력한 연도가 윤년이면 "윤년이 맞습니다."
		// 아니면 "윤년이 아닙니다." 출력
	}


}
