package com.dto;

public class ScoreDto {

	private int s_no;
	private String s_name;
	private int s_kor;
	private int s_eng;
	private int s_math;

	public ScoreDto() {

	}

	public ScoreDto(int s_no, String s_name, int s_kor, int s_eng, int s_math) {
		super();
		this.s_no = s_no;
		this.s_name = s_name;
		this.s_kor = s_kor;
		this.s_eng = s_eng;
		this.s_math = s_math;

	}

	public int getS_no() {
		return s_no;
	}

	public void setS_no(int s_no) {
		this.s_no = s_no;
	}

	public String getS_name() {
		return s_name;
	}

	public void setS_name(String s_name) {
		this.s_name = s_name;
	}

	public int getS_kor() {
		return s_kor;
	}

	public void setS_kor(int s_kor) {
		this.s_kor = s_kor;
	}

	public int getS_eng() {
		return s_eng;
	}

	public void setS_eng(int s_eng) {
		this.s_eng = s_eng;
	}

	public int getS_math() {
		return s_math;
	}

	public void setS_math(int s_math) {
		this.s_math = s_math;
	}

	public int getSum() {
		
		return s_kor + s_eng + s_math;
	}

	public double getAvg() {

		
		return getSum() / 3;
		
		// Double.parseDouble(String.format("%.2f", )
	}
	
	public String getGrade() {
		
		String grade = "";  
		
		switch ((int) getAvg() / 10) {
		
		case 10: case 9:
			grade = "A";
			break;
		case 8:
			grade = "B";
			break;
		case 7:
			grade = "C";
			break;
		case 6:
			grade = "D";
			break;
		default:
			grade = "F";
			break;
			
		}
		
		return grade;
	}

	@Override
	public String toString() {
		
		String res = String.format
				("| %2d | %5s | %3d | %3d | %4d | %3d | %5.2f | %5s |", s_no, s_name, s_kor, s_eng, s_math, getSum(), getAvg(), getGrade());
		
		return res;
	}

}
