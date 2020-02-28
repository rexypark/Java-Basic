package com.mystudy.split;

import java.util.StringTokenizer;

public class Ex_01_StringTokenizer {

	public static void main(String[] args) { 
	//	StringTokenizer st = new StringTokenizer("this is a test");
	//    while (st.hasMoreTokens()) {
	//        System.out.println(st.nextToken());
	//    }
	//hasMoreTokens ��ū�� ���ִ��� ����
	
	//String.split() vs StringTokenizer
	// split �ϰ� �Ǹ� �迭 Ÿ���� ��ȯ�Ѵ�.
	System.out.println("==== split() ====");
	String str = new String("���,��,������,,����");
	String[] strSplit = str.split(",");
	System.out.println("strSplit�� ũ�� : " + strSplit.length);
	System.out.println();
	for (int i = 0; i < strSplit.length; i++) {
		System.out.println("-"+strSplit[i]+"-");
		}
	System.out.println();
	
	// ������ for��(�ٸ���� : forEach��)
	// for(������Ÿ�� ������ : ���հ�ü) {}
	// 
	System.out.println("==== ������ for�� ====");
	String str3 = "";
	
	
	for(String str2 : strSplit) {
		str3 += str2;
		System.out.println(str2);
	}
	System.out.println(str3);
	
	
	int idx = 0;
	for (String str2 : strSplit) {
		
		System.out.println(idx + " " + str2);
		idx++;
	}
	
	
	
	// str : ���,��,������,,����
	// split���� �����̽� ���� ���� �����̽��� ���� �����Ϳ��� 
	// �߶� �����͸� ī���� ������ 
	// StringTokenizer������ �����̽��� �ƴ� �ƹ������Ͱ� ���� ���
	// �ش� �����ʹ� ��� ���� �ʴ´�.
	System.out.println("==== StringTokenizer ��� ====");
	System.out.println("str : " + str);
	StringTokenizer stn = new StringTokenizer(str,",");
	
	System.out.println("stn.countTokens() : " + stn.countTokens());
	System.out.println("stn.countTokens() : " + stn.countTokens());
	System.out.println();
	System.out.println(stn.hasMoreTokens());
	
	while(stn.hasMoreTokens()) {
		String token = stn.nextToken();
		System.out.println("-" + token + "-");
		
	}
	System.out.println("==== for�� ��� ��ū�� ��ȸ ====");
	stn = new StringTokenizer(str,",");
	
	
	int tokenNo = stn.countTokens();
	System.out.println("����� ��ū ���� : " + stn.countTokens());
	for(int i = 0; i < stn.countTokens(); i++) {
		
		String token = stn.nextToken();
		System.out.println((i+1) + " : " + token);
		
	}
	
	System.out.println(stn.nextToken());
	System.out.println(stn.nextToken());
	System.out.println(stn);
	
	// ���ǻ��� : 2�� �̻��� ��ū�� �ѹ��� ������� ����
	// 
	
	}
}
