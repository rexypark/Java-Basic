/*
	pakage���� : �����׸������� �⺻������ ���
	��Ű�� ���� : java ������ �� ����(����)�� ��ġ�Ͽ� �ѹ��� �ۼ�
	�ڹ�(class) ������ ��ġ�� ��Ÿ��
	�Ϲ����� �ۼ� ��Ģ : ȸ���� �����θ��� �ݴ�� ���
	�ۼ��� ) com.bitcamp
 */
package com.mystudy;

//import ���� : �����׸������� �Ϲ������� ���
//Ŭ������ ��ġ�� ��������� �����ϴ� ����
//(java.lang ��Ű�� �̿��� ��Ű���� �ִ� Ÿ�� ����)
import java.util.Scanner;

//Ŭ���� ���� : �ʼ� �׸�
public class Ex_01_pakage_import {
	
	public static void main(String[] args) {
		System.out.println("Hello World~");
		java.util.Scanner scan = new Scanner(System.in);
		System.out.println(">> �λ縻 : ");
		String hello = scan.nextLine();
		System.out.println(">> �λ縻 : " + hello);
		
		
	}
}

