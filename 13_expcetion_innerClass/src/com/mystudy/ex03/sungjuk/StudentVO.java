package com.mystudy.ex03.sungjuk;

public class StudentVO {
	

	// 필드(속성)
	private String name;
	private int kor;
	private int eng;
	private int math;
	private int tot;
	private double avg;
	
	
	/*
	 생성자 만들기(실습)
	 기본생성자
	 name, kor, eng, math 값을 전달받는 생성자
	 전체 필드값을 받는 생성자 
	  
	  
	 
	 메소드 만들기(getter/setter)
	 
	 
	 toString() 작성 : 오버라이드
	 
	 */
	
	
	
	StudentVO() {}
	
	
	public StudentVO(String name, int kor, int eng, int math) {
		super();
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	
	}




	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public int getKor() {
		
		return kor;
		
	}


	public void setKor(int kor) {
		if (kor >= 0 && kor <= 100) {
			this.kor = kor;
		}else {
			System.out.println("[예외발생] 범위 (0~100) 벗어남.");
		}
	}


	public int getEng() {
		return eng;
	}


	public void setEng(int eng) throws SungJukProcessException {
		if (eng>=0 && eng <= 100) {
			this.eng = eng;			
		}else {
			throw new ScoreOutOfValueException(); //예외 발생 시키기
			
		}
		
	}

	public int getMath() {
		return math;
	}



	public void setMath(int math) {
		this.math = math;
	}



	public int getTot() {
		return tot;
	}



	public void setTot(int tot) {
		this.tot = tot;
	}



	public double getAvg() {
		return avg;
	}



	public void setAvg(double avg) {
		this.avg = avg;
	}
	
	@Override
	public String toString() {
		return "StudentVO [name=" + name + ", kor=" + kor + ", eng=" + eng + ", math=" + math + ", tot=" + tot
				+ ", avg=" + avg + "]";
	};
}
