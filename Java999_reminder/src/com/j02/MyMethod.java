package com.j02;

public class MyMethod {

	public static void MyPublic() {
		System.out.println("public");
		System.out.println("어디서나 접근 가능");
	}
	
	protected static void MyProtected() {
		System.out.println("protected");
		System.out.println("상속 : 상속된 곳에서");
		System.out.println("상속 아닌 경우 : 같은 패키지");
	}
	
	static void MyDefault() {
		System.out.println("default");
		System.out.println("같은 패키지 내에서");
	}
	
	private static void MyPrivate() {
		System.out.println("private");
		System.out.println("같은 클래스 내에서");
		
	}
	
	public void MyNonStatic() {
		System.out.println("(non-static)");
		System.out.println("객체 생성 해야!");
		
	}
	
}
