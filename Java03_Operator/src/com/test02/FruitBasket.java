package com.test02;

public class FruitBasket {
	//class 변수
	static int weightgrade = 80;
	//instance 변수
	int count = 10;
	String peopleName;
	
	public void weightSetting(String name, int weight) {
		peopleName = name;
		// 1. count라는 전역변수에, 파라미터 fruit를 통해 전달된 값을 "추가"하자.
		count += weight;
		gradePrn();
		
	}
	
	private void gradePrn() {
		System.out.println("사람 이름 : " + peopleName);
		String res = (weightgrade >= count) ? String.format("%s 의 몸무게는 %d 입니다.", peopleName, count): "비만입니다.";
		System.out.println(res);
		//peopleName + "의 몸무게는 " + count + "Kg 입니다." 
		
		// 2. basketSize가 count보다 크거나 같으면, fruitName + "의 갯수는" + count + "입니다."
		// 그렇지 않으면 "바구니가 넘쳤습니다." 를 출력!!
		// 삼한연산자 사용하자.
		
	}
	
}
