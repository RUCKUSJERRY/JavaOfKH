package com.test01;

import java.util.Date;
import java.util.Random;
import java.util.Scanner;

public class MTest {

	public static void main(String[] args) {
		// Scanner sc = new Scanner(System.in);

		Object[] array = new Object[5];

		array[0] = null;
		array[1] = new Date();
		array[2] = "apple";
		array[3] = "banana";
		array[4] = new Integer(1);

		for (int i = 0; i < array.length; i++) {
			Object tmp = array[i];
			char c = ((String) tmp).charAt(0);
			System.out.println(c);
		}

	}

}
