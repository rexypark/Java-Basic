package com.mystudy.ex02_fileinputstream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;

public class FileInputStream_Ex3_1 {

	public static void main(String[] args) {
		File file = new File("file/test_01.txt");
		FileInputStream fis = null;
		
		
		
		try {
		
			//1. 객체생성(파일 읽기용 객체)  <-  File
			fis = new FileInputStream(file);
			
			//2. 객체사용 작업처리
//			(int) file.length()
			byte[] bytes = new byte[10];
			System.out.println("file.length() : " + file.length());
			System.out.println("bytes : " + Arrays.toString(bytes));
			
			//fis.read(byte[] b) : byte 배열의 크기만큼 읽어 b변수에 저장
			//리턴값 : 읽어온 갯수
			System.out.println();
			int byteCnt = fis.read(bytes);
			for (byte b : bytes) {
				System.out.println((char)b + " " + b);
			}
			
			System.out.println();
			System.out.println();
			for (byte b : bytes) {
				System.out.println((char)b + " " + b);
			}
			
			
			for (int i = 0; i < byteCnt; i++) {
				System.out.println("숫자 : " + bytes[i] + ", char: " + (char)bytes[i]);
				
			}
			
			System.out.println();
			System.out.println();
			System.out.println("읽어온 갯수 : " + byteCnt);
			System.out.println("읽어온 값 : " + Arrays.toString(bytes));
			
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
