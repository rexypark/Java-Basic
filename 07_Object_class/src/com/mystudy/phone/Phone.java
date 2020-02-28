package com.mystudy.phone;


//������
//��. �⺻������(default Constructor)
public class Phone extends Object{
	
	String name;  //�𵨸�
	String phoneNo;  //��ȣ
	int hsize = 138;    //LCD����
	int vsize = 67;    //
	boolean hasLCD = true;
	
	
	Phone(){};
	
	Phone(String name, String phoneNo) {
		this.name = name;
		this.phoneNo = phoneNo;
	}
	
	
	//��. �Ķ���Ͱ� : �𵨸�, Ÿ��
//	Phone(String n, String pN) {
//			
//			name = n;
//			phoneNo = pN;
//			
//		}
//	
	//��. �Ķ���Ͱ� : �𵨸�, Ÿ��, LCD����
	Phone(String n, String pN, boolean lcd) {
		
		name = n;
		phoneNo = pN;
		hasLCD = true;
	}
	
	

	// ��. ��ȭ�ɱ� : call
	// 1) ȭ�����: "��ȭ�ɱ�" 
	void call() {
		System.out.println("��ȭ�ɱ�");
	}
	
	// ��. ��ȭ�ޱ� : receiveCall
	// 1) ȭ�����: "��ȭ�ޱ�" 
	void receiveCall() {
		System.out.println("��ȭ�ޱ�");
	}
	
	// ��. �޽��� ������ : sendSms
	// 1) �޽����� String Ÿ������ �޾Ƽ� �����ϴ�
	// 2) ȭ�����: "[�޽�������]" + �޽�������(���޹����޽���) 
	void sendSms(String txt) {
		System.out.println("[�޼�������]");
		System.out.println(txt);
	}
	// ��. �޽��� �ޱ� : receiveSms
	// 1) ���� �޽����� String Ÿ������ �����ݴϴ�.(return)
	// 2) ȭ�����: "[�޽�������]" + �����޽���

	void receiveSms(String txt) {
		System.out.println("[�޼�������]");
		System.out.println(txt);
	}
	
	
	@Override
	public String toString() {
		return "Phone [name=" + name + ", phoneNo=" + phoneNo + ", hsize=" + hsize + ", vsize=" + vsize + ", hasLCD="
				+ hasLCD + "]";
	}


	String receiveSMS(String msg) {
		return msg;
	}
	
	//��. ��ȭ�� ���� Ȯ�� : viewInfo
	void viewInfo() {
		if (hasLCD == true) {
			
		}
		System.out.println("�𵨸� : " + name);
		System.out.println("��ȭ��ȣ : " + phoneNo);
		System.out.println("����ũ�� : " + hsize);
		System.out.println("����ũ�� : " + vsize);
		if (hasLCD == true) {
			System.out.println("LCD���� : " + "����");	
		}else {
			System.out.println("LCD���� : " + "����");
		}
		
	}
	
	
	
}
