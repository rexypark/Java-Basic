package com.mystudy.ex02_fileinputstream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;

public class FileInputStream_Ex3_2 {

	public static void main(String[] args) {
		File file = new File("file/test_01.txt");
		FileInputStream fis = null;
		
		
		
		try {
			//1. 객체생성(파일 읽기용 객체)  <-  File
			fis = new FileInputStream(file);
			
			//2. 객체사용 작업처리
//			(int) file.length()
			byte[] bytes = new byte[(int)file.length()];
			int byteCnt = 0;
			// 파일을 읽고 읽은 갯수가 하나라도 있으면 반복문 실행
			// 리턴값이 -1인 경우에는 파일의끝(EOF)을 만난 경우
//			byteCnt = fis.read(bytes);
//			System.out.println("읽어온 갯수 : " + byteCnt);
//			System.out.println("읽어온 값 : " + Arrays.toString(bytes));
//			System.out.println((char)-1);
			
			
			while ((byteCnt = fis.read(bytes)) != -1) {
				
				System.out.println("읽어온 갯수 : " + byteCnt);
				System.out.println("읽어온 값 : " + Arrays.toString(bytes));
				for (int i = 0; i < byteCnt; i++) {
					System.out.println("(char)bytes[i] : " + (char)bytes[i] + "     " + "byteCnt : " + i);
				
				}
			}
			
			System.out.println();
			System.out.println();
			
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			
			if(fis !=null) {
				
				try {
					fis.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		
		
		
		

		
		
		
		//3. 사용객체 close
		
		
		
	}
}
