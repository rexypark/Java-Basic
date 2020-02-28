package com.mystudy.ex02_vo;
/* �ڹٺ�(JavaBean) ������ Ŭ����
   V0(Value Object) : ���� �����ϱ� ���� Ŭ����
   DTO(Data transfer Object) : ���� �����ؼ� �����ϱ� ���� Ŭ����(��ü)
 	-> XxxxVo, XxxxVo, XxxxDTO, XxxxDto
 */
public class StudentV0 {
	private String name;
	private int kor;
	private int eng;
	private int math;
	
	private int tot;
	private double avg;
	
	// ������ ���� -----------------
	// ������ : ����, ����, ����, ���� ������ �Է¹޴� ������
	// ����, ��� �� �ڵ� ��� ó��
	
	public StudentV0(String name, int kor, int eng, int math) {
		
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		
		computeTotAvg();
	}
	
	// �޼ҵ� ���� -----------------
	// sctter/getter �ۼ�
	// ����, ����, ���������� ����Ǹ� ����, ��� ���� ó��
	// ����, ����, ���� ������ 0-100���� ���� �Է�ó��
	
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
		if(kor >= 0 && kor < 101) {
			this.kor = kor;
		} else {
			System.out.println("���� �߸� �Է�[���� : 1~100]");
		}
		
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		
		if(eng >= 0 && eng < 101) {
			this.eng = eng;
		} else {
			System.out.println("���� �߸� �Է�[���� : 1~100]");
		}
		
	}
	public int getMath() {
		return math;
	}
	
	public void setMath(int math) {
		if(math >= 0 && math < 101) {
			this.math = math;
		} else {
			System.out.println("���� �߸� �Է�[���� : 1~100]");
		}
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
	
	//computeTotAvg() �߰� : tot, avg �� ���ó��
	//printData() : �ѻ���� ������ ȭ�����
	
	public double computeTotAvg() {
		this.tot = kor + eng + math;
		this.avg = tot * 100 / 3 / 100.0;
		
		return this.avg; 
	}
	
	
	
	
	
	@Override
	public String toString() {
	
		return "StudentV0 [name = " + name + ", kor = " + kor + ", eng = " + eng + ", math = " + math + "]";
	}



	public String printData(){
		String info = name + "\t" + kor +  "\t" +  eng +  "\t" +  math +  "\t"+ tot +  "\t" +  avg;	
		
//		System.out.println(info);
		return info;
	}
	
	
}

