package com.test03;

public class MTest {

	public static void main(String[] args) {
		int mysum = MyCalc.sum(10, 2);
		System.out.println(mysum);
		
		MyCalc.sub(20, 6);
		
		// mul 메소드 호출하는데
		// 아큐먼트는 10, 3
		// 호출해서 리턴된 결과 값을
		// console에 출력하자.
		
		double mymul = MyCalc.mul(10, 3);
		System.out.println(mymul);
		
		//MyCalc.div(10, 4);
		MyCalc calc = new MyCalc();
		calc.div(10, 3);
		
		

	}
}
