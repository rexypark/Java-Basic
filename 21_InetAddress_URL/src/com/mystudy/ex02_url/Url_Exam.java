package com.mystudy.ex02_url;

import java.net.MalformedURLException;
import java.net.URL;


// pc까지 찾아 갈 땐 ip주소를 찾아감 
// pc또는 서버에서 서비스를 찾아 갈 때는 port에 찾아간다.
// pc나 하나의 서버에 하나의 ip만 가질 수 있지만
// port는 하나 이상의 포트를 가질 수 있다.

public class Url_Exam {
	public static void main(String[] args) throws MalformedURLException {
						//프로토콜://호스트(서버):포트/경로(패스)?질의(query)
		URL url = new URL("http", "com.mystudy.java", 8080,
				          "aaa/bbb/test.jsp?id=hong&pw=1234#content");
		// 위와 같은 url
		//url = new URL("http://com.mystudy.java:8080/aaa/bbb/test.jsp?id=hong&pw=1234#content");
		
		//프로토콜
		String protocol = url.getProtocol();
		//호스트
		String host = url.getHost();
		int port = url.getPort(); 
		int defaultPort = url.getDefaultPort();
		String path = url.getPath();
		String query = url.getQuery();
		String ref = url.getRef();
		
		
		System.out.println("프로토콜(protocol) : " + protocol);
		System.out.println("호스트(host) : " + host);
		System.out.println("포트(port) : " + port);
		System.out.println("기본포트(defaultPort) : " + defaultPort);
		System.out.println("경로(path) : " + path);
		System.out.println("쿼리(query) : " + query);
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
		
		
		System.out.println("프로토콜(protocol) : " + protocol);
		System.out.println("호스트(host) : " + host);
		System.out.println("포트(port) : " + port);
		System.out.println("기본포트(defaultPort) : " + defaultPort);
		System.out.println("경로(path) : " + path);
		System.out.println("쿼리(query) : " + query);
		System.out.println("ref : " + ref);
		System.out.println();
		
		
	}
}
