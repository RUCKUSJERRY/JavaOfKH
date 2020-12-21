package com.test03;

import java.util.HashSet;
import java.util.Set;

public class MTest01 {

	// set : 순서 없고, 중복 안된다.
	public static void main(String[] args) {
		Set<String> set = new HashSet<String>();
		// 정렬한건 아니고, 자기 맘대로 가지고 있는 거다.
		set.add("1");
		set.add("1");
		set.add("1");
		set.add("1");
		set.add("1");
		set.add("3");
		set.add("5");
		set.add("2");
		set.add("4");
		set.add("6");
		set.add("7");
		//set.add(null);  // 저장은 가능하나, 사용하면 NullPointerException 발생
		set.add("3");
		// set.add 의 타입은 boolean이어서 중복값일때는 false를 반환하기 때문에 중복값이 제거된다.
		for (String s : set) {
			System.out.print(s + " ");
		}
		System.out.println();
		
		findElement(set, "3");
		deleteElement(set, "3");
	}

	public static void deleteElement(Set<String> set, String delete) {
		for (String s : set) {
			if (s.equals(delete)) {
				set.remove(s);
				System.out.println(delete + " 지웠다.");
				break;
			}
		}
		System.out.println(set);
	}

	public static void findElement(Set<String> set, String find) {
		/*
		 * for (int i = 0; i < set.size(); i++) { set.get(i); }
		 */

		for (String s : set) {
			if (s.equals(find)) {
				System.out.println(find + " 찾았다.");
			}
		}

	}
}
