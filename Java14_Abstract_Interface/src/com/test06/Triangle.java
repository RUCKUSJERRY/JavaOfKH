package com.test06;

import java.util.Scanner;

public class Triangle extends AreaImpl {
	Scanner sc = new Scanner(System.in);
	
	@Override
	public void make() {
		System.out.println("밑변을 입력해 주세요.");
		int length = sc.nextInt();
		System.out.println("높이을 입력해 주세요.");
		int height = sc.nextInt();
		
		double area = (double) (length * height) / 2;
		setResult(Double.toString(area));
	}

	public void print() {
		
		System.out.println("삼각형의 ");
		super.print();
	}
}
