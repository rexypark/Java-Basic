package com.mystudy.ex01_inetaddress;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddress_Exam {
										   //���� �߻� �� �׳� �߻���Ŵ
	public static void main(String[] args) throws UnknownHostException {
		// InetAddress : IP�ּ� ���� ��Ʋ����
		
		InetAddress iaddr = InetAddress.getLocalHost();
		System.out.println("ȣ��Ʈ�̸� : " + iaddr);
		System.out.printf("ȣ��Ʈ�̸� : %s",iaddr.getHostAddress());
		
		System.out.println("=== ���̹� �ּ� �˻� ===");
		
		iaddr = InetAddress.getByName("www.naver.com");
		System.out.println("ȣ��Ʈ�̸� : " + iaddr);
		System.out.printf("ȣ��Ʈ�̸� : %s",iaddr.getHostAddress());
		System.out.println();
		System.out.println();
		
		
		System.out.println("=== ���̹� IP �ּҵ� �˻� ===");
		InetAddress[] iaddrAll = InetAddress.getAllByName("www.naver.com");
		
		for (InetAddress adr : iaddrAll) {
			System.out.printf("%s \n",adr.getHostAddress());
		}
		
		
	}
}
