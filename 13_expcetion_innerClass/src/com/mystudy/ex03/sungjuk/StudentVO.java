package com.mystudy.ex03.sungjuk;

public class StudentVO {
	

	// �ʵ�(�Ӽ�)
	private String name;
	private int kor;
	private int eng;
	private int math;
	private int tot;
	private double avg;
	
	
	/*
	 ������ �����(�ǽ�)
	 �⺻������
	 name, kor, eng, math ���� ���޹޴� ������
	 ��ü �ʵ尪�� �޴� ������ 
	  
	  
	 
	 �޼ҵ� �����(getter/setter)
	 
	 
	 toString() �ۼ� : �������̵�
	 
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
			System.out.println("[���ܹ߻�] ���� (0~100) ���.");
		}
	}


	public int getEng() {
		return eng;
	}


	public void setEng(int eng) throws SungJukProcessException {
		if (eng>=0 && eng <= 100) {
			this.eng = eng;			
		}else {
			throw new ScoreOutOfValueException(); //���� �߻� ��Ű��
			
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
