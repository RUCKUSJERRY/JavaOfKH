package com.test01;

public class MethodTest02 {

	public static void main(String[] args) {
		// method 호출 방법
		// 1. static method : class명.method명();
		MethodTest01.publicMethod();
		MethodTest01.protectedMethod();
		MethodTest01.defaultMethod();
		//MethodTest01.privateMethod(); // private method는 해당 calss 내에서만 (not visible)
		//MethodTest01.abc(); // abc는 없다. 선언되지 않은 것. (undefined)
		
		// 2. non-static method : 
		// class(참조타입) 변수 = new class();
		// 변수.method();
		MethodTest01 method01 = new MethodTest01(); // 값(객체)
		method01.nonStaticMethod();
		
		// objectaid
		// UML : Unified Modeling Language
		
		

	}

}
