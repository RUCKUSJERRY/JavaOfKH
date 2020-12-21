package com.vehicle;

public class MTest {

	public static void main(String[] args) {
		Car myCar = new Truck("파란색"); // 출력 : 파란색 트럭 생성
		myCar.accelPedal();			   // 속도가 15 올라갑니다.
		myCar.accelPedal();			   // 속도가 15 올라갑니다.
		System.out.println(myCar);     // 현재 속도는 30 입니다.
		myCar.breakPedal();			   // 속도가 15 줄어듭니다.
		myCar.breakPedal();			   // 멈췄습니다.
		myCar.breakPedal();			   // 멈췄습니다.
		System.out.println(myCar);     // 현재 속도는 0 입니다.
		
		myCar = new SportsCar("빨간색"); // 출력 : 빨간색 스포츠가 생성
		myCar.accelPedal();			   // 속도가 15 올라갑니다.
		myCar.accelPedal();			   // 속도가 15 올라갑니다.
		System.out.println(myCar);     // 현재 속도는 30 입니다.
		myCar.breakPedal();			   // 속도가 15 줄어듭니다.
		myCar.breakPedal();			   // 멈췄습니다.
		myCar.breakPedal();			   // 멈췄습니다.
		System.out.println(myCar);     // 현재 속도는 0 입니다.
		
		// SportsCar와 Truck에는 field 작성 불가!
		
	}
}
