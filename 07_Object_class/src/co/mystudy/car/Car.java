package co.mystudy.car;
/*
 �ڵ��� Ŭ����
 - �Ӽ�(����) : ������, �𵨸�, ������, ��������, ������(�ʺ�)
 - ���(�޼ҵ�) : ������ �̵�, ���� , �ڷ��̵�, ��������Ȯ��
 */


public class Car {
	//�ʵ庯��(�Ӽ�) : �������, �ν��Ͻ�����
	String name = "����ī";
	String model;
	String color;
	
	final int CAR_LENGTH = 400;
	final int CAR_WIDTH = 200;
	
	boolean existAirbag; //��� ���� ����
	// ������ : ����Ÿ�� ����
	// Ŭ������ () {} - �⺻������
	// Ŭ������ (�Ű�����, ....) {}
	// �ʵ� �۾��� �ʱ�ȭ
	
	Car () {
		model = "�帲ī";
		color = "��������";
		
	}
	
	
	Car(String n, String m, String c) {
		
		name = n;
		model = m;
		color = c;
		
		
	}
	
	
	void run(int speed) {
		System.out.println(">>������ �̵� " + speed + "�ӵ��� �̵�");
	}
	void stop() {
		System.out.println("����(stop)");
	}
	void back() {
		System.out.println(">>�ڷ� �̵�");
	}
	void dispData() {
		System.out.println("=== �ڵ��� ���� ==");
		System.out.println("�ڵ��� �̸� : " + name);
		System.out.println("�𵨸� : " + model);
		System.out.println("����� : " + color);
		System.out.println("���� ����: " + CAR_LENGTH);
		System.out.println("���� ��: " + CAR_WIDTH);
		System.out.println("����� ���� : " + existAirbag);
	}
	
}
