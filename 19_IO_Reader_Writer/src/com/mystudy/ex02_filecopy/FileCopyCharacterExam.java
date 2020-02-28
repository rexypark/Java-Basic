package com.mystudy.ex02_filecopy;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileCopyCharacterExam {
	public static void main(String[] args) {
		//(실습) FileReader, FileWriter 사용해서 파일복사
		//원본파일 : file/test_char.txt
		//대상파일 : file/test_char_copy.txt
		//처리 : 원본파일을 읽어서 대상파일에 쓰기(저장 - 문자단위처리)
		//-----------------------------------------------
		
		// null처리를 해줘야 close할 때 해당 변수값 유무를 판별 할 수 있다.
		FileReader fileRd = null;
		FileWriter fileWt = null;
		
		//0. 사용할 파일 객체 생성
		File fileIn = new File("file/txt_char.txt");
		File fileOut = new File("file/txt_char_copy.txt");
		
		try {
		//1. 파일로부터 읽고, 쓸 객체 저장할 변수 선언   >>  Input
		fileRd = new FileReader(fileIn);
		//2. 읽기위한 객체생성, 쓰기위한 객체 생성        >>  Output
		fileWt = new FileWriter(fileOut);

		//3. 읽고, 쓰기 (반복작업)
		int readVal = -1;
		while((readVal = fileRd.read()) != -1) {
			//fileWt에 fileRd에서 출력하는 값 저장
			fileWt.write((char)readVal);
		}
		// fileWt에 버퍼
		fileWt.flush();
		
		
		
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			//4. 사용한 객체 close()처리
			
				try { 
					if(fileWt != null) fileWt.close();
					if(fileRd != null) fileRd.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			
		}

		
		
	
		
		
		
		
		
		
	}
}
