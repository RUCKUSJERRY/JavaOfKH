package com.test01;

import java.io.File;
import java.io.IOException;

public class MTest01 {

	public static void main(String[] args) {
		// IO = input output
		// mac -> /Users/계정/test_io
		File fi = new File("C:/test_io");
		
		if (fi.exists()) {
			System.out.println("exists");
		} else {
			// folder = directory
			System.out.println("make directorys");
			fi.mkdirs();
		}
		
		// fi 안에(밑에) AA라는 folder (directory) 생성
		
		File fiAA = new File(fi, "AA");
		fiAA.mkdir();
		
		File fiBB = new File("C:\\test_io", "BB");
		fiBB.mkdir();
		
		// AA 밑에 a.txt 파일 생성
		File aTxt = new File(fiAA, "a.txt");
		try {
			// checked exception
			aTxt.createNewFile();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
