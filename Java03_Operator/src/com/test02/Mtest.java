package com.test02;

public class Mtest {

	public static void main(String[] args) {
		// static -> instance : 호출 안된다.
		// instance -> static : 호출 가능하다. 다만, 되도록 하지 말자. 왜? 해당 클래스 전체가 바뀌니까.
		// static -> static : 으로 호출하는게 이상적이다.
		// instance -> instance : 가능하다.
		
		FruitBasket bananaBasket = new FruitBasket();
		bananaBasket.weightSetting("이용준", 80);
		System.out.println(bananaBasket.count);
		//bananaBasket.basketSize = 15;
		System.out.println(bananaBasket.weightgrade);
		System.out.println(bananaBasket.peopleName);
		
		FruitBasket appleBasket = new FruitBasket();
		appleBasket.weightSetting("사과", 21);
		System.out.println(appleBasket.weightgrade);
		System.out.println(appleBasket.peopleName);
		
		FruitBasket pearBasket = new FruitBasket();
		pearBasket.weightSetting("배", 1);
		System.out.println(pearBasket.weightgrade);
		System.out.println(pearBasket.peopleName);
		
	}
}
