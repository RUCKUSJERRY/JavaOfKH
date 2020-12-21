package com.score;

public class Score {

	//field
	private String name;
	private int kor;
	private int eng;
	private int math;
	
	// constructor
	public Score() {
		
	}
	
	public Score(String name, int kor, int eng, int math) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		
	}
	
	// getter & setter
	/*
	public int getName(int name) {	
		return name;
	}
	public void setName(String name) {
		this.name = name;	
	}
	public int getKor(int kor) {	
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getEng(int eng) {	
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getMath(int math) {	
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}
	*/
	
	// getSum, getAvg, getGrade
	
	public int getSum() {
		return kor + eng + math;
	}
	public double getAvg() {
		return (double)(kor + eng + math) / 3;
	}
	public String getGrade() {
		String grade = null;
		
		if ((int)getAvg() / 10 >= 9) {
			grade = "A";
		} else if ((int)getAvg() / 10 == 8) {
			grade = "B";
		} else if ((int)getAvg() / 10 == 7) {
			grade = "C";
		} else if ((int)getAvg() / 10 == 6) {
			grade = "D";
		} else {
			grade = "F";
		}
		
		return grade;
	}
	
	
	@Override
	public String toString() {
		
		return "이름 : " + name + " 국어 : " + kor + " 영어 : " + eng + " 수학 : " + math +
				"\n총점 : " + getSum() + " 평균 : " + getAvg() + " 등급 : "	 + getGrade();
		
	}
	
}
