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
				System.out.println("선택할 번호 입력 : ");
				int selectNo = sc.nextInt();
				
				MyTestDto selectOne = biz.selectOne(selectNo);
				System.out.printf("%3d %10s %10s \n", selectOne.getMno(), selectOne.getMname(), selectOne.getNickname() );
				break;
			// 선책출력
			case 3:
				System.out.println("번호 입력 : ");
				int insertNo = sc.nextInt();
				System.out.println("이름 입력 : ");
				String insertName = sc.next();
				System.out.println("별명 입력 : ");
				String insertNickname = sc.next();
				
				MyTestDto insertDto = new MyTestDto();
				insertDto.setMno(insertNo);
				insertDto.setMname(insertName);
				insertDto.setNickname(insertNickname);
				
				int insertRes = biz.insert(insertDto);
				
				if(insertRes > 0) {
					System.out.println("추가 성공");
					
				} else {
					System.out.println("추가 실패");
				}
				
				//System.out.println(biz.insert());

				break;
			// 추가
			case 4:
				System.out.println("수정할 번호 입력 : ");
				int updateNo = sc.nextInt();
				System.out.println("수정할 컬럼 입력 : (이름 or 별명) ");
				String updateCulumn = sc.next();
				System.out.println("수정할 이름 or 별명 입력 : ");
				String updateChange = sc.next();
				
				MyTestDto updateDto = new MyTestDto();
				
				updateDto.setMno(updateNo);
				updateDto.setMname(updateCulumn);
				updateDto.setNickname(updateChange);
				
				int updateRes = biz.update(updateDto);
				
				if(updateRes > 0) {
					System.out.println("수정 성공");
				} else {
					System.out.println("수정 실패");
				}
				
				//System.out.println(biz.update());

				break;
			// 수정
			case 5:
				System.out.println("삭제할 번호 입력 : ");
				int deleteNo = sc.nextInt();
				
				int deleteRes = biz.delete(deleteNo);
				
				if(deleteRes > 0) {
					System.out.println("삭제 성공");
				} else {
					System.out.println("삭제 실패");
				}
				
				//System.out.println(biz.delete());

				break;
			// 삭제
			case 6:
				System.out.println("프로그램이 종료 되었습니다...");

			}

		} while (select != 6);

	}

}
