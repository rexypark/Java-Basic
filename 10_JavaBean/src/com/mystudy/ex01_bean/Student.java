package com.mystudy.ex01_bean;
/*	�ڹٺ�(Java Bean)
 	- �������(property)�� ����������(������) private ����
 	- �������(property) ���� get/set �޼ҵ带 ����
 	- get/set �޼ҵ�� public���� ����
 	- get �޼ҵ�� �Ķ���Ͱ� ����, set�޼ҵ�� �ϳ��̻��� �Ķ���� ����
 	- �ʵ���� ù���ڸ� �빮�ڷ� ����
 	- �ܺο��� �������(property)���ٽÿ��� get/set �޼ҵ带 ���� ����(���)
 	
 	
 	set�޼ҵ�
 	public void setName(������Ÿ�� �Ķ���͸�) {
 		this.name = name
 	}
 	
 	get�޼ҵ�
 	public ������Ÿ�� getName() {
		return this.name;
	}
 	
 	
 */


public class Student {
	//private�� �����ϸ� StudentŬ�������� �ۿ� ��� �ȵ�
	private String name; //�̸�
	private String num;
	private int kor;
	private int eng;
	private int math;
	private int tot;
	private double avg;
	
	
	//������ ���� ----------------------------
	public Student() {
		//super : �θ�Ŭ����(super Ŭ����)�� �ǹ�
		//super() : �θ�Ŭ������ �⺻ ������ ȣ��
		super(); //�����ϸ� �����Ϸ��� �ڵ����� �����ؼ� ó��
	}
	
	public Student(String name) {
	  //super(); �� ù�ٿ� ������ - �θ� Ŭ������ ������ ȣ�� 
		this.name = name;
	}
	
	public Student(String name, int kor, int eng, int math) {
		
		// ���� ��ü�� ������ ȣ��(String ������ �ϳ� ����)
		// ������ ����
		this(name);
//		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		computeAvg();
		
	}
	
	
	
	//�޼ҵ念��-----------------------------

	//this >> ���� ����� ������ ����Ŵ
	//set������ this�� �ʼ��� ���� �� / get������ �ʼ��� �ƴ�
	//��Ī : set�޼ҵ�. setter, set property
	public void setName(String name) {
		this.name = name;
	}
	
	//��Ī : get�޼ҵ�, getter, get property
	public String getName() {
		return this.name;
	}
	
	
	
	
	public void num(String num) {
		this.num = num;
	}
	
	public String num2() {
		return this.num;
	}
	
	
	
	public void setKor(int kor) {
		if (kor >= 0 && kor <= 100) {
		
			this.kor = kor;
		
		}else {
			System.out.println("�߸��� �����Դϴ�.");
		}
	}
	
	public int getKor() {
		return this.kor;
	}
	
	
	public void setEng(int eng) {
		if (eng >= 0 && eng <= 100) {
		
			this.eng = eng;
		
		}else {
			System.out.println("�߸��� �����Դϴ�.");
		}
	}
	
	public int getEng() {
		return this.eng;
	}
	
	
	
	public void setMath(int math) {
		if (math >= 0 && math <= 100) {
		
			this.math = math;
		
		}else {
			System.out.println("�߸��� �����Դϴ�.");
		}
	}
	
	public int getMath() {
		return this.math;
	}
	
	
	
	
	public int getTot() {
		return this.tot;
	}

	
	
	// ���� ���� ���ٸ� �⺻������ �ش� ���� ȣ���ϴ� �⺻ get�޼��带 �Է��ϰ�
	// �ٸ� �޼��忡 ������� �����ϰ� �ش� ���� ������� �ִ´�
	// ���� �޼��� > ��¸޼��� �Է�
	
	
	
	public void setTot(int tot) {
		this.tot = tot;
	}
	
	public void computeTot() {
		this.tot = kor + eng + math; 
	}
	
	// ������ �ִ� ��� ������ ���� ������ ����
	// ���������� setter ���� ����
	public void setAvg(double avg) {
		
		this.avg =avg;
	}

//	public void setAvg(double avg) {
//		this.avg = avg / 3.0;
//	}
	
	public double getAvg() {
		
		return this.avg;
	}
	
	public void computeAvg() {
		computeTot();
		this.avg = tot/3;
		
	}
	
	
}
