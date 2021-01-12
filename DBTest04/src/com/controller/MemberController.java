package com.controller;

import java.util.List;
import java.util.Scanner;

import com.biz.MemberBiz;
import com.biz.MemberBizImpl;
import com.dto.MemberDto;

public class MemberController {

	private static Scanner sc = new Scanner(System.in);
	
	public static int getMenu() {
		int select = 0;
		StringBuffer sb = new StringBuffer();
		sb.append("**********\n").append("*1.전체출력*\n").append("*2.선택출력*\n").append("*3.추   가*\n").append("*4.수   정*\n")
				.append("*5.삭   제*\n").append("*6.종   료*\n").append("**********\n").append("input select : ");
		System.out.println(sb);
		select = sc.nextInt();

		return select;
	}

	public static void main(String[] args) {
		int select = 0;
		MemberBiz biz = new MemberBizImpl();

		while (select != 6) {
			select = getMenu();

			switch (select) {
			case 1:
				List<MemberDto> list = biz.selectList();

				for (MemberDto dto : list) {
					System.out.println(dto);
					// System.out.printf("%2d | %10s | %3d | %2s | %10s | %10s | %20s | %20s\n",
					// dto.getM_no(), dto.getM_name(), dto.getM_age(), dto.getM_gender(),
					// dto.getM_location(), dto.getM_job(), dto.getM_tel(), dto.getM_email());
				}

				break;
			case 2:

				System.out.println("출력할 번호 : ");
				int selectOneNo = sc.nextInt();

				MemberDto dto = biz.selectOne(selectOneNo);
				System.out.println(dto);
				// System.out.printf("%2d | %10s | %3d | %2s | %10s | %10s | %20s | %20s\n",
				// dto.getM_no(), dto.getM_name(), dto.getM_age(), dto.getM_gender(),
				// dto.getM_location(), dto.getM_job(), dto.getM_tel(), dto.getM_email());
				break;
			case 3:
				System.out.println("번호 입력 : ");
				int insertNo = sc.nextInt();
				System.out.println("이름 입력 : ");
				String insertName = sc.next();
				System.out.println("나이 입력 : ");
				int insertAge = sc.nextInt();
				System.out.println("성별 입력 : M or F ");
				String insertGender = sc.next();
				System.out.println("주소 입력 : ");
				String insertLocation = sc.next();
				System.out.println("직업 입력 : ");
				String insertJob = sc.next();
				System.out.println("전화번호 입력 : ");
				String insertTel = sc.next();
				System.out.println("이메일주소 입력 : ");
				String insertEmail = sc.next();

				MemberDto insertDto = new MemberDto();

				insertDto.setM_no(insertNo);
				insertDto.setM_name(insertName);
				insertDto.setM_age(insertAge);
				insertDto.setM_gender(insertGender);
				insertDto.setM_location(insertLocation);
				insertDto.setM_job(insertJob);
				insertDto.setM_tel(insertTel);
				insertDto.setM_email(insertEmail);

				int insertRes = biz.insert(insertDto);

				if (insertRes > 0) {
					System.out.println("추가 성공");
				} else {
					System.out.println("추가 실패");
				}

				break;
			case 4:
				System.out.println("수정할 번호 입력 : ");
				int updateNo = sc.nextInt();
				System.out.println("수정할 컬럼 입력 : (이름, 나이, 성별, 주소, 직업, 전화번호, 이메일)");
				String updateCulumn = sc.next();
				System.out.println("변경할 내용 입력 : ");
				String changeText = sc.next();

				
				int updateRes = biz.update(updateNo, updateCulumn, changeText);

				if (updateRes > 0) {
					System.out.println("수정 성공");
				} else {
					System.out.println("수정 실패");
				}

				break;
			case 5:
				
				System.out.println("삭제할 번호 입력 : ");
				int deleteNo = sc.nextInt();
				
				int deleteRes = biz.delete(deleteNo);
				
				if(deleteRes > 0) {
					System.out.println("삭제 성공");
				} else {
					System.out.println("삭제 실패");
				}
				
				break;
			case 6:
				break;
			}

		}
	}

}
