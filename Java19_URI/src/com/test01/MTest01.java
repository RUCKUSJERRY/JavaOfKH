package com.test01;

import java.net.URI;
import java.net.URISyntaxException;

public class MTest01 {
	
	
	public static void main(String[] args) throws URISyntaxException {
		URI u = new URI("http://localhost:8787/Java19_URI_Web/res.jsp?name=%EC%9D%B4%EC%9A%A9%EC%A4%80&addr=%EB%8F%99%EB%B0%A9%EC%95%84%ED%8C%8C%ED%8A%B8");

		System.out.println(u.getScheme());
		System.out.println(u.getHost());
		System.out.println(u.getPort());
		System.out.println(u.getPath());
		System.out.println(u.getQuery());
		
		
	}
		
	
}
