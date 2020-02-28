package com.mystudy.ex01;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderExam2 {
	public static void main(String[] args) {
		// 문자(Character) 단위 입력 처리
		// FileReader : 파일로 부터 문자단위로 데이터 읽기
		// 문자단위 : 1, A, $ - 1 byte문자
		//         대, 한, 핳 - 2 byte문자(한글,중국어,태국어,아랍어....)
		// -----------------------------------------------------
		
		// FileReader로 읽어올 대상 지정(file)
		File file = new File("file/txt_char.txt");
		
		// FileReader 타입 객체 저장용 변수 선언
		FileReader fr = null;
		
		
		try {
			// 1. 객체생성
			fr = new FileReader(file);
			
			// 2. 객체 사용해서 문자단위로 읽기
			//[실습] 반복문 처리
			
			int readChar = -1;
		
			for(int i=0; i < 10; i++) {
				readChar = fr.read();
				System.out.print((char)readChar);
			}
			
			
//			while ((readChar = fr.read()) != -1) {
//				System.out.print((char)readChar);
//				
//			}
			
		} catch (FileNotFoundException e) {
//			e.printStackTrace();
			System.out.println("[예외발생] : " + e.getMessage());
		} catch(IOException e) {
			e.printStackTrace();
		} finally {
			
			if (fr != null)
				try {
					fr.close();
				} catch (IOException e) {
					e.printStackTrace();
				} 
			
		}
		
		
		
	}
}
