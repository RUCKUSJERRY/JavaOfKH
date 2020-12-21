package com.test02;

public class Dog extends Animal {

	public Dog() {
		System.out.println("강아지");
	}
	@Override
	public void start() {
		System.out.println("강아지가 헥헥거리며 뛴다.");

	}

	@Override
	public void stop() {
		System.out.println("강아지가 멈췄다.");

	}

}
