package com.mystudy.ex04_filecopy;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopy_Test {

	public static void main(String[] args) {
		// 파일복사 : 원본파일에서 읽고(Input) 대상파일에 쓰기(Output)
		
		// 복사할 원본 파일(source file : AS-IS)
		File fileIn = new File("src/com/mystudy/ex04_filecopy/FileCopy_Test.java");
		
		// 쓰기 위한 대상파일(target : To-BE)
		File fileOut = new File("file/FileCopy_Test_Backup.java");
		
		// 1. 파일에서 읽고 쓰기위한 객체를 저장할 변수 선언
		FileInputStream fis = null;
		FileOutputStream fos = null;
		
		// 파일에서 읽고 쓰기 위한 객체를 생성
		try {
			fis = new FileInputStream(fileIn);
			fos = new FileOutputStream(fileOut);
			
		//2. 객체 사용해서 읽고 쓰기
			int value = -1; 
			
			while (true) {
				//읽기(1byte)
				value = fis.read();
				if (value == -1) break; //EOF(End Of File) 파일의 끝이면 반복종료 
				//쓰기(1byte)
				fos.write(value);
			}
		
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if(fos != null) {
				//3. 사용객체close(생성순서 역순으로)
				try {
					fos.close();
					fis.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}

}
