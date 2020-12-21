package com.test02;

/*
 * A B C D E
 * F G H I J
 * K L M N O 
 * P Q R S T
 * U V W X Y
 * Z
 * 형태로 출력하자!
 */
public class BreakTest {

	public static void main(String[] args) {
		
		int count = 0;
		for (char i = 'A'; true; i++) {
			System.out.print(i + " ");
			count++;
			if (count % 5 == 0) {
				System.out.println();
			} else if (count > 25) {
				break;
			}
		}
		
		//Prn();

	}

	public static void Prn() {

		int count = 0;
		char c = 'A';
		boolean stop = false;

		while (!stop) {
			while (true) {
				System.out.print(c + "\t");
				c++;
				count++;

				if (count % 5 == 0) {
					break;
				}
				if (count == 26) {
					stop = true;
					break;

				}
			}
			
			System.out.println();
		}
	}
}
