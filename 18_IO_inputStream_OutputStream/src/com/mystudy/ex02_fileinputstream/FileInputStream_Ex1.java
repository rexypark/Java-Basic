package com.mystudy.ex02_fileinputstream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
//바이트(byte) : 읽기
//데이터 입력(읽기) : InputStream - 추상클래스
//FileInputStream - InputStream을 상속(extends)받아 만든 클래스
//파일(file)로 부터 데이터를 입력(읽어)처리하기 위한 클래스
public class FileInputStream_Ex1 {

	public static void main(String[] args) {
		
		File file = new File("temp.txt");
		System.out.println(file.exists());
		
//		if(!file.exists()) {//파일이 없으면 새로만들기 처리
//			try {
//			file.createNewFile();
//			} catch (IOException e) {
//				e.printStackTrace();
//			}
//		
			//읽어들일 파일과 연결됨
		try {
			// 1. 사용 할 파일 객체를 전달 받아서 객체생성
			// FileNotFoundException 가능성이 있음
			FileInputStream fis = new FileInputStream(file); 
			
			// 2. 객체 사용
			int readValue = fis.read();
			System.out.println("read() 값(int) : " + readValue);
			System.out.println("read() char : " + (char)readValue);
			
			System.out.println("==== 전체데이터 읽어오기 ====");
			while(true) {
				readValue = fis.read();
				System.out.println("read() 값(int) : " + readValue);
				System.out.println("read() char : " + (char)readValue);
				if(readValue == -1) break; // EOF(End Of File) 만나면 -1 리턴
			}
			
			//3. 객체 닫기 : 사용 자원 원위치(파일 close)
			fis.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		//타입의 크기가 큰오류가 뒤에 정의된다.
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
	}
//}
