package com.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.biz.Scorebiz;
import com.biz.ScorebizImpl;
import com.dto.ScoreDto;

public class scoreController {

	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		int select = 0;
		Scorebiz biz = new ScorebizImpl();
		while (select != 6) {

			select = getMenu();

			switch (select) {
			case 1:

				List<ScoreDto> list = biz.selectList();
				System.out.println("| NO |  NAME   | KOR | ENG | MATH | SUM | AVG    | GRADE |");
				for (ScoreDto dto : list) {
					System.out.println(dto);
				}
				break;

			case 2:
				System.out.println("출력할 번호 : ");
				int selectOneNo = sc.nextInt();
				ScoreDto dto = biz.selectOne(selectOneNo);
				System.out.println("| NO |  NAME   | KOR | ENG | MATH | SUM | AVG    | GRADE |");
				System.out.println(dto);
				break;

			case 3:
				System.out.println("추가할 이름 : ");
				String insertName = sc.next();
				System.out.println("추가할 국어점수 : ");
				int insertKor = sc.nextInt();
				System.out.println("추가할 영어점수 : ");
				int insertEng = sc.nextInt();
				System.out.println("추가할 수학점수 : ");
				int insertMath = sc.nextInt();

				ScoreDto insert = new ScoreDto();

				insert.setS_name(insertName);
				insert.setS_kor(insertKor);
				insert.setS_eng(insertEng);
				insert.setS_math(insertMath);

				int insertRes = biz.insert(insert);

				if (insertRes > 0) {
					System.out.println("추가 성공");
				} else {
					System.out.println("추가 실패");
				}

				break;
			case 4:
				System.out.println("수정할 번호 ");
				int updateNo = sc.nextInt();
				System.out.println("수정할 컬럼 ");
				String cul = sc.next();
				System.out.println("수정할 내용 ");
				String chg = sc.next();

				int updateRes = biz.update(updateNo, cul, chg);

				if (updateRes > 0) {
					System.out.println("수정 성공");
				} else {
					System.out.println("수정 실패");
				}

				break;
			case 5:

				System.out.println("삭제할 번호");
				int deleteNo = sc.nextInt();

				int deleteRes = biz.delete(deleteNo);

				if (deleteRes > 0) {
					System.out.println("삭제 성공");
				} else {
					System.out.println("삭제 실패");
				}
				break;
			case 6:
				System.out.println("종료 되었습니다.");
				break;
			}
		}

	}

	private static int getMenu() {

		StringBuffer sb = new StringBuffer();

		sb.append("**********\n").append("*1.전체출력*\n").append("*2.선택출력*\n").append("*3.추   가*\n").append("*4.수   정*\n")
				.append("*5.삭   제*\n").append("*6.종   료*\n").append("**********\n").append("input select : ");
		System.out.println(sb);
		int select = sc.nextInt();

		return select;
	}

}
