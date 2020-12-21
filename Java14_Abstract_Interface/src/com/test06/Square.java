package com.test06;

import java.util.Scanner;

public class Square extends AreaImpl {
	Scanner sc = new Scanner(System.in);
	
	
	@Override
	public void make() {
		System.out.println("밑변을 입력해 주세요.");
		int length = sc.nextInt();
		System.out.println("높이을 입력해 주세요.");
		int height = sc.nextInt();
		double area = (length * height);
		setResult(area+"");
		
	}
	//Integer
	public void print() {
		
		
		System.out.print("사격형의 ");
		super.print();
		
	}
}
