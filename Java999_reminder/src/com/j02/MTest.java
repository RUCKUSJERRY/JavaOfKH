package com.j02;

public class MTest {

	public static void main(String[] args) {

		MyMethod.MyPublic();
		MyMethod.MyProtected();
		MyMethod.MyDefault();
		// MyMethod.MyPrivate();
		
		
		MyMethod my = new MyMethod();		
		my.MyNonStatic();

	}

}
