package com.mystudy.ex05_hashset;

public class StudentVO {
	private int kor;
	private int eng;
	private int math;
	private int sum;
	private double avg;
	private String name;
	

	
	StudentVO(){};
	public StudentVO(String name, int kor, int eng, int math) {
		
		this.name= name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	
	}
	
	
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		if (kor < 101 && kor >= 0) {
		this.kor = kor;
		}
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		if (eng < 101 && eng >= 0) {
		this.eng = eng;
		}
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		if (math < 101 && math >= 0) {
		this.math = math;
		}
	}
	public int getSum() {
		return sum;
	}
	public void setSum(int sum) {
		this.sum = sum;
	}
	public double getAvg() {
		return avg;
	}
	public void setAvg(double avg) {
		this.avg = avg;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public void sum() {
		this.sum = kor + eng + math;
	}
	
	public void avg() {
		avg = sum * 100 / 3 /100.0;
	}
	
	
	public void printData() {
		sum();
		avg();
		System.out.println(name + "\t" + kor + "\t" + eng + "\t" + math + "\t" + sum + "\t" + avg);
		
	}
	
	
	
	
	@Override
	public String toString() {
		return "StudentVO [name = " + name + "kor = " + kor + ", eng = " + eng + ", math = " + math + "]";
	}
	public static void main(String[] args) {
		/*  List�� ����� ���� ó��
		1. 3���� �л�����Ÿ(����,����,����,����)�� 
		   StudentVO Ŭ������ �̿��ؼ� �����(�����ϰ�)
		   "ȫ�浿", 100, 90, 81
		   "�̼���", 95, 88, 92
		   "������", 90, 87, 77
		2. ArrayList Ÿ���� ����(list)�� �����ϰ�
		3. list�� �ִ� ����Ÿ�� ����ؼ� ȭ�����
		     ����   ����  ����    ����     ���
		   --------------------------
		   100  90  81  270  90.33
		   ...
		********************************

}****/
		
		
		
	}
}
