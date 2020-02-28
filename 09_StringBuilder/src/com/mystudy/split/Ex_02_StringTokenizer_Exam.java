package com.mystudy.split;

import java.util.StringTokenizer;

public class Ex_02_StringTokenizer_Exam {
	public static void main(String[] args) {
		/* ���ڿ� �ٷ��
		0.���ڿ� ������
		  String str1 = "ȫ�浿 �̼���   �̼��� Tom ȫ�浿";
		  String str2 = "    TOM    �������� ������ �����ҹ�";
		1. ���� ���ڿ��� StringBuilder ���� sb�� �̿��ؼ� �ϳ��� ���ڿ��� �����,
		2-1. sb�� ���ڿ��� ��ĭ(" ")�� �����ڷ� �߶�(�̸��� ����) ȭ�� ���(����ŸȮ��)
		     (String.split() �Ǵ� StringTokenizer Ŭ���� ���)
		      ��) ȫ�浿 �̼��� �̼��� Tom ȫ�浿 TOM...
		2-2. ���ڿ��� ������ �� �ִ� �迭����(names)�� ����
		3. �迭�� �ִ� ���� ������ �޸�(,)�� �����Ͽ� �Ѷ��ο� ���(StringBuilder ���)
		      ��) ȫ�浿,�̼���,�̼���,Tom,ȫ�浿,TOM...   
		    append > stringbuilder�� ������ ���
		    
		4. �������� ù���ڸ� �����ؼ� �޸�(,)�� �����Ͽ� �Ѷ��ο� ���(StringBuilder ���)
		      ��) ȫ,��,��,T,ȫ,T,��... 
		      
		5. �迭�� ���ڿ��� �̸��� ���ڼ��� 4 �̻��� ���� "�ε�����ȣ:�̸�" ���
		      ��) �ε�����ȣ:��������
		********************************/
		String str1 = "ȫ�浿 �̼���   �̼��� Tom ȫ�浿";
		String str2 = "    TOM    �������� ������ �����ҹ�";
		
		//1. ���� ���ڿ��� StringBuilder ���� sb�� �̿��ؼ� �ϳ��� ���ڿ��� �����,
		StringBuilder sb = new StringBuilder("");
		sb.append(str1).append(str2);
		
		System.out.println("== str1 + str2 ==");
		System.out.println(sb);
		
		
		// strToken�� sb(StringBuilder)�� " "�� split�Ͽ� StringTokenizerŸ������ ��ȯ�Ͽ� �����Ѵ�.
		StringTokenizer strToken = new StringTokenizer(sb.toString()," ");
		
		
		int strToken_len = strToken.countTokens();
		// names�� strToken�� ũ�⸸ŭ�� �迭�� ����
		String [] names = new String[strToken_len];
		System.out.println();
		
		System.out.println("== StringTokeniser ==");
		// split�� �����Ͱ� ��µǰ� names�迭�� ����ȴ�.
//		
//		while(strToken.hasMoreTokens()) {
//			System.out.print(strToken.nextToken() + " ");
//		}
//		System.out.println();
//		
		for (int i = 0; i < strToken_len; i++) { 
			String tempString = "";
			
			tempString = strToken.nextToken();
			System.out.print(tempString + " ");
			names[i] = tempString;
			
		}

	
		
		System.out.println();
		System.out.println();
		
		
		// sb, sb_FNam > �� StringBuilder ���� (Ǯ����, ��)
		sb = new StringBuilder("");
		StringBuilder sb_FName = new StringBuilder("");
		System.out.println("== names Array ==");
		int idx = 0;
		for(String a : names) {
			//if (idx == 0) {System.out.print(", " + output)}
			
			if (idx == strToken_len-1) { 
				sb.append(a);
				sb_FName.append(names[idx].substring(0,1));
				break;
			}
			sb.append(a+", ");
			sb_FName.append(names[idx].substring(0,1) + ", ");
			idx++;
		}
		
		System.out.println("sb : " + sb);
		System.out.println("sb_FName : " + sb_FName);
		System.out.println();
		
		
		System.out.println("== �̸� 4���� �̻� ==");
		idx = 0;
		for (String b : names) {
			
			if (b.length() == 4) {
				
				System.out.println(idx + " : " + b);
				
			}
			idx++;
			
		}
		
		System.out.println();
		
		System.out.println("=== split() ===");
		System.out.println();
		String str3 = "";
		str3 = str1 + str2;
		System.out.println(str3);
		System.out.println();
		String[] strArray = str3.split(" ");

		System.out.println();

		String[] strArrayPre = new String[strArray.length];
		
		idx = 0;
		for (String st1 : strArray) {
			if(!st1.equals("")) {
				strArrayPre[idx] = st1;
				idx++;
			}
		}
	
		
		for (String st2 : strArrayPre) {
			if (st2 != null) { 
			System.out.print(st2 + " ");
			}
		}
		
		
		
		
	}
}
