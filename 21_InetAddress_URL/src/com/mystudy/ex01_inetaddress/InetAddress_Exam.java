package com.mystudy.ex01_inetaddress;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddress_Exam {
										   //예외 발생 시 그냥 발생시킴
	public static void main(String[] args) throws UnknownHostException {
		// InetAddress : IP주소 관련 ㅋ틀래스
		
		InetAddress iaddr = InetAddress.getLocalHost();
		System.out.println("호스트이름 : " + iaddr);
		System.out.printf("호스트이름 : %s",iaddr.getHostAddress());
		
		System.out.println("=== 네이버 주소 검색 ===");
		
		iaddr = InetAddress.getByName("www.naver.com");
		System.out.println("호스트이름 : " + iaddr);
		System.out.printf("호스트이름 : %s",iaddr.getHostAddress());
		System.out.println();
		System.out.println();
		
		
		System.out.println("=== 네이버 IP 주소들 검색 ===");
		InetAddress[] iaddrAll = InetAddress.getAllByName("www.naver.com");
		
		for (InetAddress adr : iaddrAll) {
			System.out.printf("%s \n",adr.getHostAddress());
		}
		
		
	}
}
