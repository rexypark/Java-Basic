package com.mystudy.stringbuilder;

public class Ex_02_String_exam2 {

	public static void main(String[] args) {
	/* String ��� �ǽ�
	���ڿ� : "ȫ�浿","�̼���","�̼���","��������","������","�����ҹ�","Tom","TOM"
	1. ���� ���ڿ� ���� ������ �� �ִ� ���ڿ� �迭(names) ������ �����ϰ� �Է�
	2. �迭�� �ִ� ���� ������ �޸�(,)�� �����Ͽ� �� ���ο� ���
	   ��� ��) ȫ�浿,�̼���,�̼���,��������....
	3. �迭�� �ִ� ����Ÿ�� ù ���ڸ� ���-������ �޸�(,) ��� �� ���ο� ���
	   ��� ��) ȫ,��,��,��,��,��,T,T...
	4. �̸��� ���ڼ��� 4���� �̻��� �̸��� �˻��ؼ� "�ε�����ȣ:�̸�" ���·� ���
	   ��) 3:��������
	5. �̸��� ���� �����͸� "�ε�����ȣ:�̸�=�ε�����ȣ:�̸�" ���·� ���
	   ��) 1:�̼���=2:�̼���
	(��Ÿ) �̸� �񱳽ÿ��� ��ҹ��� ���� ���� ��ó��(Tom, TOM �� ����)
	========================================================= */
	//"ȫ�浿","�̼���","�̼���","��������","������","�����ҹ�","Tom","TOM"
	String[] names = {"ȫ�浿","�̼���","�̼���","��������",
			"������","�����ҹ�","Tom","TOM"};
	
	//1 
	StringBuffer sb = new StringBuffer(""); 
	for (int i = 0; i < names.length; i++) {
		if (i == names.length - 1) {
			sb.append(names[i]);
			break;
		}
		sb.append(names[i] + ", ");
		
	}
	System.out.println(sb);
	System.out.println();
	
	//3 
	 
	for (int i = 0; i < names.length; i++) {
		if (i == names.length - 1) {
			System.out.print(names[i].substring(0,1));
			break;
		}
		System.out.print(names[i].substring(0,1) + ", ");
		
	}
	
	System.out.println();
	System.out.println();
	

	//4 	�ε�����ȣ:�̸�
	for (int i = 0; i < names.length; i++) {
		
		if (names[i].length() == 4) {
		 
			System.out.println(i + ":" + names[i]);
		}
		 
	}
	
	System.out.println();
	//5 �ε�����ȣ:�̸�=�ε�����ȣ:�̸�
		
	for (int i = 0; i < names.length; i++) {
		for (int j = i + 1; j < names.length; j++)	
			if (names[i].equalsIgnoreCase(names[j]) && i != j) {
			 
				System.out.println(i + " : " + names[i] + " = " + j + " : " + names[j]);
			}
			 
		}
		
	
	
	}
}
