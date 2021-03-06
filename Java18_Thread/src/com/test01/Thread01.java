package com.test01;


class MyThread01 implements Runnable {
	
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("i : " + i);
		}
	}
	
}

public class Thread01 {

	
	//main 메소드도 thread이다. -> 우선순위가 높다.
	public static void main(String[] args) {
		System.out.println("main start -------------");
		
		// Thread가 아니다. 싱글 쓰레드
		/*
		MyThread01 my01 = new MyThread01();
		MyThread01 my02 = new MyThread01();
		
		my01.run();
		my02.run();		
		*/
		
		// Thread 이다.
		Thread my01 = new Thread(new MyThread01());
		Thread my02 = new Thread(new MyThread01());
		
		// start();는 run()을 자동으로 호출한다.
		my01.start();
		my02.start();
		
		System.out.println("main stop --------------");
		
	}
	
}
