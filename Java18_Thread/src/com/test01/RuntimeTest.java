package com.test01;

import java.io.IOException;

public class RuntimeTest {

	public static void main(String[] args) {
		Runtime rt = Runtime.getRuntime();
		// 싱글톤
		
		try {
			
			// mac : String[] path = {"/usr/bin/open", "-a", "/Applications/fileName.app"}
			// Process prc = rt.exec(path);
			Process prc = rt.exec("C:\\Program Files (x86)\\Google\\Chrome\\Application\\chrome.exe");
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
}
