package com.test03;

import java.util.StringTokenizer;

public class MTest02 {

	public static void main(String[] args) {
		// [String 사용]
		String colors = "red/yellow#green blue,orange";
		
		String [] temp = colors.split("/|#| |,");
	
		for (int i = 0; i < temp.length; i++) {
			System.out.println(temp[i]);
		}
		System.out.println();
		// [StringTokenizer 사용]
		StringTokenizer st = new StringTokenizer(colors, "/# ,");

		while (st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}

	}
}
