package com.test01;

import java.util.Arrays;

public class MTest01 {

	public static void main(String[] args) {
		// 배열 : 여러개의 같은 타입의 값을 효과적으로 관리하기 위한 객체.
		// 배열은 대가로로 사용을 한다. 대가로의 위치는 변수 앞 뒤 상관없다.
		// 방법 1
		int[] a; // 선언 << 인트형값을 여러개 담을수 있다. []
		a = new int[5]; // 정의
		a[0] = 1; // 초기화
		a[1] = 2; // 배열의 방은 0번부터 시작한다.
		a[2] = 3;
		a[3] = 4;
		a[4] = 5;

		// 방법 2
		int[] b = new int[] { 5, 4, 3, 2, 1 }; // 선언 정의 초기화

		// 방법 3
		int[] c = { 6, 7, 8, 9, 10 }; // 선언 초기화 (스태틱한 형태로 배열을 만든다.)

		System.out.println(a[0] + b[1] + c[2]);

		System.out.println(c); // 출력 -> [I@41a4555e << 주소값이다.
		System.out.println(Arrays.toString(c)); // java.util.Arrays;

		String[] s = new String[] { "Have", "a", "nice", "day" };
		modi(s);
		prn(s);
		
	}

	public static void modi(String[] arr) {
		// nice -> good 변경 후 전체 출력
		// [Have, a, good, day] (Arrays.toString 사용 금지!)
		System.out.print("[");
		arr[2] = "good";
		for (int i = 0; i < arr.length; i++) {
			if (i == arr.length - 1) {
				System.out.printf("%s", arr[i]);
			} else {
				System.out.printf("%s, ", arr[i]);
			}

		}
		System.out.println("]");
	}

	public static void prn(String[] arr) {
		// {Hava a nice day}
		// hint! 배열은 0부터 length-1까지!
		// System.out.printf("{%s %s %s %s }", arr[0], arr[1], arr[2], arr[3]);
		System.out.print("{");
		for (int i = 0; i < arr.length; i++) {
			System.out.printf("%s ", arr[i]);
		}
		System.out.println("}");
	}

}
