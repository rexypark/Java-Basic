package com.mystudy.ex04_printf;

import java.util.Calendar;

public class Printf_Exam {
	
	
	public static void main(String[] args) {
		//printf() �޼ҵ�
		int a = 20;
		long b = 300000000000L;
		float c = 34.95f;
		double d = 4.4927;
		char e = 'A';
		String f = "Hello~~~";
		boolean g = false;
		
		Calendar today = Calendar.getInstance();
		System.out.println(today);
		System.out.printf("%tF", today);
		System.out.println();
		System.out.println(">>" + a + " " + b + " " + c + " " + d + 
				 		   " " + e +  " " + f + " " + g);
		
		/* []�� ��������
		 
		 %[�ε���]$[-][ũ��] : %, ���Ĺ��� �ʼ� �ۼ�
		 - ������ �⺻������ ���� ����
		 - �������� ����� ���̳ʽ� ��ȣ
		d > int, long
		f > float, double
		c > char
		s > String
		g > boolean
		 */
		
		System.out.println("???");
		System.out.printf("%n");
		System.out.println("???");
		System.out.printf("\\ %% %n \n");
		System.out.printf("%d %d %f %f \n", a, b, c, d);
		System.out.printf("%c %s %b %n", e, f, g);
		
		
		// %[�ε���]$[-][ũ��] : %, ���Ĺ��� �ʼ� �ۼ�
		System.out.println("=== �ε��� ��뿹 ===");
		
		//[����] �ε��� �����ϸ� ������ ��Ī���� ���ܵ�
		System.out.println("int 66" + "\t" + "int 66" + "\t" +"char 66" + "\t" + "indexing String rexypark" +"");
		System.out.printf("%1$d \t %1$d \t %c \t %4$s \n", 66, 'Z', "Hellow~~~", "rexypark");
		
		System.out.println();
		System.out.println("=== �Ǽ��� ������ ǥ�� ===");
		System.out.printf("%f %1$a  %1$e %1$e %1$g \n", 65.43445345);
		System.out.println(1231234123);
		System.out.printf("%1$-10.1f \n", 65.8475685);
		
		System.out.println();
		System.out.println("=== ��¥ ���� ===");
		System.out.printf("%1$ty/%1$tm/%1$td \n", today);
		System.out.printf("%1$tF \n", today);
		System.out.printf("%1$tI/%1$tM/%1$tS \n", today); // �ú���
		
		System.out.println("=== ��(width) ���� ===");
		System.out.printf("%1$-20f \n", 5678.123456789);
		System.out.printf("%10s %10d %10d %10d \n","ȫ�浿", 100,90,81);
		
		
	}
}
