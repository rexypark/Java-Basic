package com.mystudy.ex02_filecopy;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReceiveString {
	public static void main(String[] args) {
		//(실습) FileReader, FileWriter 사용해서 파일복사
		//원본파일 : file/test_char.txt
		//대상파일 : file/test_char_copy.txt
		//처리 : 원본파일을 읽어서 대상파일에 쓰기(저장 - 문자단위처리)
		//-----------------------------------------------
		
		// null처리를 해줘야 close할 때 해당 변수값 유무를 판별 할 수 있다.
		FileReader fileRd = null;
		List<String> list = new ArrayList<String>();
		//0. 사용할 파일 객체 생성
		File fileIn = new File("file/txt_char.txt");
		
		try {
		//1. 파일로부터 읽고, 쓸 객체 저장할 변수 선언   >>  Input
		fileRd = new FileReader(fileIn);

		//3. 읽고, 쓰기 (반복작업)
		int readVal = -1;
		String emp = "";
		
		while((readVal = fileRd.read()) != -1) {
			emp += String.valueOf((char)readVal);
		}
		String[] listEmp = emp.split(" ");
		for (String lst : listEmp) {
			System.out.print(lst + " ");
		}
		
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			//4. 사용한 객체 close()처리
			if(fileRd != null) {
				try {
					fileRd.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}

		
		
	
		
		
		
		
		
		
	}
}
