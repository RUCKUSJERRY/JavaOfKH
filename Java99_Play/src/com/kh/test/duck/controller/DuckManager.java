package com.kh.test.duck.controller;

import java.util.Arrays;

import com.kh.test.duck.model.vo.Duck;
import com.kh.test.duck.model.vo.Mallard;
import com.kh.test.duck.model.vo.RubberDuck;

public class DuckManager {

	public static void main(String[] args) {
		
		Duck[] duck = new Duck[5];
		
		duck[0] = new RubberDuck("도날드", "러버덕", 100);
		duck[1] = new Mallard("꽥꽥이", "청동오리", "서울", "white");
		duck[2] = new RubberDuck("도날드", "러버덕", 100);
		duck[3] = new Mallard("청둥이", "청동오리", "부산", "blue");
		duck[4] = new Mallard("미세먼지","청동오리", "중국", "yellow");
		
		
		for (Duck d : duck) {
				d.quack();
		}
	}
	
}
