package com.mystudy.string;

import java.util.Arrays;

public class Ex_02_string_method {
	
	public static void main(String[] args) {
		//charAt()
		System.out.println("--- charAt() ---");
		String str = "Java World";
		System.out.println("str : " + str);
		
		System.out.println("str : " + str.toString());
		
		char ch = str.charAt(0);
		System.out.println(ch);
		
		char [] ch2 = {str.charAt(0), 
					   str.charAt(1), 
					   str.charAt(2), 
					   str.charAt(3)
					   };
//		System.out.println(Arrays.toString(ch2));
		
		for (int i = 0; i < ch2.length; i++) {
			System.out.print(ch2[i]);
		}
		
		
		System.out.println("--- java vs java ---");
		System.out.println("java vs java : " + "java".compareTo("java"));
		System.out.println("aaa".compareTo("bbb"));
		System.out.println("aaa".compareTo("aaa"));
		System.out.println("aaa".compareTo("ccc"));
		System.out.println("d".compareTo("a"));
	
		System.out.println("--- copyValueOf() ---");
		char [] ch3 = {'a', 'b', 'c', 'd'};
		System.out.println(Arrays.toString(ch3));
		String str3 = ((String.copyValueOf(ch3)));
		System.out.println(str3);
		System.out.println("=== star ===");
		System.out.println("str3 : " + str3);
		System.out.println("start : " + str3);
		System.out.println(str3.startsWith("ab"));
		System.out.println(str3.startsWith("ac"));
				
		
		System.out.println(" --- indexOf ---");
		String str4 = "Java";
		System.out.println();
		System.out.println("str4 : " + str4);			
		System.out.println(str4.indexOf(ch));
		System.out.println('a');
		
		System.out.println();
		System.out.println("--- isEmpty() --");
		str4 = "";
				
		System.out.println(str4.isEmpty());
		
		System.out.println("---- replace() -----");
		System.out.println("str4 : " +  str4);
		System.out.println(str4.replace('a','b'));
	
		System.out.println(" --- replaceAll() ---");
		str4 = "java java";
		System.out.println("str4 : " + str4);
		System.out.println("ja -> Java");
		
		//replaceAll()
		System.out.println("ja -> Java" + str4.replaceAll("ja", "JA"));
		
		//replaceFirst()
		System.out.println("ja -> Java" + str4.replaceFirst("ja", "Jx"));
		
		System.out.println();
		System.out.println(" ==== substring() ====");
		str = "Java World";
		System.out.println("str : " + str);
		System.out.println(str.substring(6)); // 5번 인덱스 뒤에
		
		//beginIndex : 시작위치값 부터 (포함), end 이전 까지(불포함)
		System.out.println(str.substring(2,4));
		
		
		System.out.println(str.substring(0, str.length()-1));
		
		System.out.println("toUpperCase(), toLower(), train");
		System.out.println();
		System.out.println();
		
		int num = 100;
		
		String snum = String.valueOf(100);
		String bstr = String.valueOf(true);
		
		if("true".equals(bstr)) {
			System.out.println("True");
		}else {
			
			
		}
		
		
	}

	
	
}
