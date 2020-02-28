package com.mystudy.ex01_file;

import java.io.File;
import java.io.IOException;

public class FileExam2 {
	public static void main(String[] args) {
		//파일명 : temp.txt - 파일명.확장자(명)
		File file1 = new File("temp.txt");
		
		//파일명 출력  > File의 객체생성은 파일의 존재여부와 관계없이 생성가능
		System.out.println(file1);
		
		// C:\temp\aaa\a1\temp.txt : 절대경로 방식
		File file2 = new File("C:\\temp\\aaa\\a1\\temp.txt");
		System.out.println(file2);
		
		
		// file\\temp.txt : 상대경로 방식(. : 현재위치, .. : 상위디렉토리(폴더))
		File file3 = new File("file/temp.txt");
		System.out.println(file3);
		
		// >>>> 객체를 생성한다고 물리적으로 파일을 생성하지 않음
		
		// 절대위치 확인 getAbsolutePath()
		System.out.println("파일위치(file1) : " + file1.getAbsolutePath());
		System.out.println("파일위치(file2) : " + file2.getAbsolutePath());
		System.out.println("파일위치(file3) : " + file3.getAbsolutePath());
		
		//File exists()
		System.out.println("있냐(file1) : " + file1.exists());
		System.out.println("있냐(file2) : " + file2.exists());
		System.out.println("있냐(file3) : " + file3.exists());
		System.out.println();

		System.out.println("==== File getName() ====");
		System.out.println("파일명(file1) : " + file1.getName());
		System.out.println("파일명(file2) : " + file2.getName());
		System.out.println("파일명(file3) : " + file3.getName());
		System.out.println();

		System.out.println("==== File getPath() ====");
		System.out.println("file1.getPath() : " + file1.getPath());
		System.out.println("file2.getPath() : " + file2.getPath());
		System.out.println("file3.getPath() : " + file3.getPath());
		System.out.println();
		
		System.out.println("==== File 속성정보 ====");
		System.out.println("file1.length() : " + file1.length());
		System.out.println("file1.canRead() : " + file1.canRead());
		System.out.println("file1.canWrite() : " + file1.canWrite());
		System.out.println("file1.canExecute() : " + file1.canExecute());
		System.out.println();
		
		System.out.println("==== isDirectory(), isFile() ====");
		// 폴더니?
		System.out.println("file1.isDirectory() : " + file1.isDirectory());
		// 파일이니?
		System.out.println("file1.isFile() : " + file1.isFile());
		
		
		File file4 = new File ("file/temp4.txt");
		
		try {
			// 파일만 생성, 폴더(디렉토리)없으면 IOException 발생
			boolean isSuccess = file4.createNewFile();
			System.out.println("파일생성 : " + isSuccess);
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println(file4.exists());
		file4.delete();
		System.out.println(file4.exists());
	}
}
