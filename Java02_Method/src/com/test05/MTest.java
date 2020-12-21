package com.test05;

public class MTest {
	
	public static void main(String[] args) {
		
		// School class에 만들어 놓은 1번 2번 3번 메소드를 호출하여 console에 출력하자.
		
		School.namePrn("이용준");
		
		int age = School.getAge();
		System.out.println("제 나이는 " + age + "세 입니다.");
		School address = new School();
		
		address.addrPrn("동방아파트");
		
		int money = address.getMoney();
		System.out.println("저는 " + money + "억 원을 가지고 싶습니다.");
	
		
	}

}
