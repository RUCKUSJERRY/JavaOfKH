package com.test06;

import java.util.Scanner;

public class Circle extends AreaImpl {
	
	Scanner sc = new Scanner(System.in);
	@Override
	public void make() {
		
		System.out.println("반지름을 입력해 주세요.");
		int cir = sc.nextInt();
		double area = cir*cir*Math.PI;
		//setResult(area+"");
		//문자열이랑 더해지면 문자열이 된다.
		//setResult(String.valueOf(area));
		//setResult(Double.toString(area));
		setResult(String.format("%.2f", area));
	}

	public void print() {
		
		
		System.out.print("원의 ");
		super.print();
		
	}
}
