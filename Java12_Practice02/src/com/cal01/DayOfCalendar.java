package com.cal01;

// 달력만들기
// 요일계산 -> year년 month월을 주면, year년 month월 1일의 요일 -> 요일만큼 공백 -> 7개씩 새로운 줄

public class DayOfCalendar {

	public static void prn(int year, int month) {

		// 달력 윗부분 출력
			System.out.printf("\t\t%d년 %d월\n", year, month);
			System.out.println("일\t월\t화\t수\t목\t금\t토");

		prnCal(year, month);	

	}

	public static void prnCal(int year, int month) {

		int start = startOfDay(year, month);
		// 시작 요일 만큼 빈공간
		for (int j = 0; j < startOfDay(year, month); j++) {
			System.out.printf("\t");
		}
		
		// 달력 출력
		for (int i = 1; i <= dayOfMonth(year, month); i++) {
			System.out.printf("%d\t", i);
			start++;
			if (start % 7 == 0) {
				System.out.println();
				
			}

		}
	}

	public static int startOfDay(int year, int month) {
		// 시작 요일
		// 365*year중에 평년 + 366*year중에 윤년 + 해당 year의 month * 일수
		int dayOfWeek = 0;
		int sum = 0;

		// 1.1.1 ~ year-1.12.31
		for (int i = 1; i < year; i++) {
			for (int j = 1; j <= 12; j++) {
				sum += dayOfMonth(i, j);
			}
		}
		for (int i = 1; i < month; i++) {
			sum += dayOfMonth(year, i);
		}
		
		sum += 1;
		
		dayOfWeek = sum % 7;
	
		return dayOfWeek;


	}

	public static int dayOfMonth(int year, int month) {
		// 마지막 날짜

		if (month == 4 || month == 6 || month == 9 || month == 11) {
			return 30;
		} else if (month == 2 && isLeapDay(year) == true) {
			return 29;
		} else if (month == 2 && isLeapDay(year) == false) {
			return 28;
		} else {
			return 31;
		}

	}

	public static boolean isLeapDay(int year) {
		boolean leap = false;
		if ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0)) {
			leap = true;
		} 
		return leap;
	}
}
