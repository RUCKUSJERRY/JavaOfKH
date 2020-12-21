package com.cal;

import java.util.Scanner;

// 달력 만들어 주세요.
// java.util.Calendar 금지! (다른 package도 모두 금지)

public class DayOfCalendar1 {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// 01년 1월 1일부터 계산
		// 윤년이면 2월 29일
		// 윤년이 아니면 2월 28일
		// 일(6) 월(0) 화(1) 수(2) 목(3) 금(4) 토(5)
		// 월은 12월 까지
		// 30일인 월은 4, 6, 9, 11
		// 31일인 월은 1, 3, 5, 7, 8, 10, 12
		// 28일인 월은 2

		System.out.println("연도를 입력해주세요.");
		int a = sc.nextInt();
		System.out.println("월을 입력해주세요.");
		int b = sc.nextInt();

		titleOfCalender(a, b);
	}

	public static void titleOfCalender(int year, int month) {

		System.out.println("\t" + year + "년\t\t\t\t\t\t" + getMonth(month));
		System.out.println("\t====================================================");
		System.out.println("\t일\t월\t화\t수\t목\t금\t토");
		prnday(year, month);
		//System.out.println(isLeapYear(year));
		//System.out.println(startOfDay(year, month));
		
	}
	// 1년은 365일, 년도가 올라갈때마다 일에 365씩 더해준다. 그런데 윤년은 366일을 더해준다.
	// 연도 * 365 + 윤년의 수 + 출력하는 월의 날짜 % 7
	// 출력하는 월의 날짜 = 해당 월의 날짜가 될때까지 for문으로 증감시켜준다.
	public static int startOfDay(int year, int month) {
		int totalDay = 0;
		int leapYear = 0;
		int otherDay = 0;
		
		for (int a = 1; a <= year; a++) {
			totalDay += 365;
			if (isLeapYear(a) == true) {
				leapYear += 1;
			}
		}
		
		for (int b = 1; b < month; b++) {
			otherDay += dayOfMonth(year, b);
		}
		System.out.println("totalDay : " + totalDay);
		System.out.println("leapYear : " + leapYear);
		System.out.println("otherDay : " + otherDay);
		return (totalDay + leapYear + otherDay) % 7;
	}
		/*
		int totalDay = 0;
		int plusLeapYear = 0;
		int day = 0;
	
		for (int a = 0; a < year; a++) {
			totalDay += 365;
			if ()
		}
		
		//System.out.println("totalDay : " + totalDay);
		System.out.println("plusLeapYear : " + plusLeapYear);
		//System.out.println("day : " + day);
		System.out.println("나누기 7의 나머지 : " + (totalDay + plusLeapYear + day) % 7);
		
		
		return (totalDay + plusLeapYear + day) % 7;
		*/
	
	
	// 달력의 일자들 출력
	public static void prnday(int year, int month) {
		
		int count = 0;
		
		for (int c = 1; c <= dayOfMonth(year, month); c++) {
			if (c < 2) {
				for (int d = 1; d < startOfDay(year, month); d++) {
					System.out.print("\t ");
					count++;
				}			
			}
			count++;
			System.out.printf("\t%1d", c);
			
			if (count % 7 == 0) {
				System.out.println();
			}
		}
		
	}
		/*
		int count = 0;
		
		for (int c = 1; c <= dayOfMonth(year, month); c++) {
			
			if (c < 2) {
				for (int d = 1; d < startOfDay(year, month); d++) {
					System.out.print("\t ");
					count ++;
				}
				
			} 
			count ++;
			System.out.printf("\t %2d", c);
			
			if (count % 7 == 0) {
				System.out.println();
				count = 0;
			}
		}
		 */
	
	// 해당 월의 마지막 일을 구하는 메소드
	static int dayOfMonth(int year, int month) {

		if (month == 4 || month == 6 || month == 9 || month == 11) {
			return 30;
		} else if (month == 2 && isLeapYear(year) == true) {
			return 29;
		} else if (month == 2 && isLeapYear(year) == false) {
			return 28;
		} else {
			return 31;
		}

	}

	// 윤년인지 아닌지를 판가름 해주는 메소드
	// 4년 마다 1번씩 윤년인데, 100년마다 1번은 평년으로 하고, 400년 마다 한번은 윤년으로 한다.
	public static boolean isLeapYear(int year) {
		return ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0));
	}

	public static String getMonth(int month) {
		String monthName = null;
		switch (month) {
		case 1:
			monthName = "1월";
			break;
		case 2:
			monthName = "2월";
			break;
		case 3:
			monthName = "3월";
			break;
		case 4:
			monthName = "4월";
			break;
		case 5:
			monthName = "5월";
			break;
		case 6:
			monthName = "6월";
			break;
		case 7:
			monthName = "7월";
			break;
		case 8:
			monthName = "8월";
			break;
		case 9:
			monthName = "9월";
			break;
		case 10:
			monthName = "10월";
			break;
		case 11:
			monthName = "11월";
			break;
		case 12:
			monthName = "12월";
			break;

		}
		return monthName;

	}
}
