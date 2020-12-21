package com.test01;

public class Hello {

	public static void main(String[] args) {
	
		System.out.println("Hello, World!");

		int a=1;

		  a++;
		  // a + 1 = 2;

		  System.out.println(a); //a = 2

		  --a;
		  // -1 + a
		  
		  System.out.println(a); // a = 1;

		  int a1=a++;
		  // a1 = a(1);
		  // a1 + 1;

		  System.out.println(a1); //a1 = 1;

		  int a2=a--;
		  // a2 = a(2);
		  // a2 - 1

		  System.out.println(a2); // a2 = 2;

		  int a3=++a; 
		  // a3 = a(2);
		  // +1 + a3

		  System.out.println(a3); // a3 = 2;

		  int a4=--a;

		  System.out.println(a4); // a4 = 1;
		
	}
}
