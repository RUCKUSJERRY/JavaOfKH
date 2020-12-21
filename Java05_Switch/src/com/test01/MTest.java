package com.test01;

public class MTest {

	public static void main(String[] args) {
		Prn01();
		Prn02();

	}

	public static void Prn02() {
		int i = 5;

		switch (i) {

		case 1:
		case 3:
		case 5:
		case 7:
		case 9:
			System.out.println("홀수입니다.");
			break;
		case 2:
		case 4:
		case 6:
		case 8:
		case 10:
			System.out.println("짝수입니다.");
			break;
			
			default:
				System.out.println("10보다 높은 숫자입니다.");

		}

	}

	public static void Prn01() {
		int i = 5;

		// if는 가장 위의 조건부터 순차적으로 모든 코드를 읽지만
		// switch는 해당 식/값에 맞는 case로 jumping 한다. => 컴파일러가 작업하기 수월하다.
		// fall through

		// switch (식 or 값이 들어간다)
		switch (i) {
		case 1:
			System.out.println("1 입니다.");
			break;
		case 2:
			System.out.println("2 입니다.");
			break;
		case 3:
			System.out.println("3 입니다.");
			break;
		default:
			System.out.println("1, 2, 3 아닙니다.");
		}
	}

}
