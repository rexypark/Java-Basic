package com.mystudy.ex02_url;

import java.net.MalformedURLException;
import java.net.URL;


// pc���� ã�� �� �� ip�ּҸ� ã�ư� 
// pc�Ǵ� �������� ���񽺸� ã�� �� ���� port�� ã�ư���.
// pc�� �ϳ��� ������ �ϳ��� ip�� ���� �� ������
// port�� �ϳ� �̻��� ��Ʈ�� ���� �� �ִ�.

public class Url_Exam {
	public static void main(String[] args) throws MalformedURLException {
						//��������://ȣ��Ʈ(����):��Ʈ/���(�н�)?����(query)
		URL url = new URL("http", "com.mystudy.java", 8080,
				          "aaa/bbb/test.jsp?id=hong&pw=1234#content");
		// ���� ���� url
		//url = new URL("http://com.mystudy.java:8080/aaa/bbb/test.jsp?id=hong&pw=1234#content");
		
		//��������
		String protocol = url.getProtocol();
		//ȣ��Ʈ
		String host = url.getHost();
		int port = url.getPort(); 
		int defaultPort = url.getDefaultPort();
		String path = url.getPath();
		String query = url.getQuery();
		String ref = url.getRef();
		
		
		System.out.println("��������(protocol) : " + protocol);
		System.out.println("ȣ��Ʈ(host) : " + host);
		System.out.println("��Ʈ(port) : " + port);
		System.out.println("�⺻��Ʈ(defaultPort) : " + defaultPort);
		System.out.println("���(path) : " + path);
		System.out.println("����(query) : " + query);
		System.out.println("ref : " + ref);
		System.out.println();
		
		System.out.println("================================================");
		url = new URL("http://blog.eomdev.com/java/2016/03/31/exception.html");
		protocol = url.getProtocol();
		host = url.getHost();
		port = url.getPort(); 
		defaultPort = url.getDefaultPort();
		path = url.getPath();
		query = url.getQuery();
		ref = url.getRef();
		
		
		System.out.println("��������(protocol) : " + protocol);
		System.out.println("ȣ��Ʈ(host) : " + host);
		System.out.println("��Ʈ(port) : " + port);
		System.out.println("�⺻��Ʈ(defaultPort) : " + defaultPort);
		System.out.println("���(path) : " + path);
		System.out.println("����(query) : " + query);
		System.out.println("ref : " + ref);
		System.out.println();
		
		
	}
}
