package com.test01;

public class Cat extends Animal {

	@Override
	public void bark() {
		System.out.println("야옹");
		
	}
	
	public void eat(String feed) {
		System.out.print("고양이가 ");
		super.eat(feed);
	}
}
