package com.controller;

import java.util.List;
import java.util.Scanner;

import com.biz.MyTestBiz;
import com.dto.MyTestDto;

public class MyController {

	private static Scanner sc = new Scanner(System.in);

	// view
	public static int getMenu() {
		StringBuffer sb = new StringBuffer();
		sb.append("1.전체출력\n").append("2.선택출력\n").append("3.추   가\n").append("4.수   정\n").append("5.삭   제\n")
				.append("6.종   료\n").append("input select : ");
		System.out.println(sb);
		int select = sc.nextInt();

		return select;
	}

	public static void main(String[] args) {

		int select = 0;
		MyTestBiz biz = new MyTestBiz();

		do {
			select = getMenu();

			switch (select) {
			case 1:
				List<MyTestDto> list = biz.selectList();

				for (MyTestDto dto : list) {
					System.out.printf("%3d %10s %10s\n", dto.getMno(), dto.getMname(), dto.getNickname());
				}

				break;

			case 2:

				List<MyTestDto> list2 = biz.selectOne();

				for (MyTestDto dto : list2) {
					System.out.printf("%3d %10s %10s\n", dto.getMno(), dto.getMname(), dto.getNickname());
				}

				break;
			// 선책출력
			case 3:
				System.out.println(biz.insert());

				break;
			// 추가
			case 4:
				
				System.out.println(biz.update());

				break;
			// 수정
			case 5:
				
				System.out.println(biz.delete());

				break;
			// 삭제
			case 6:
				System.out.println("프로그램이 종료 되었습니다...");

			}

		} while (select != 6);

	}

}
