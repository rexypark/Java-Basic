package com.mystudy.ex01_buffered;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedReaderWriterExam {

	
	public static void main(String[] args) {
	// 버퍼(buffer) 기능이 구현되어 있는 클래스
	// BufferedReader, BufferedWriter
	// File -> FileReader -> BufferedReader
		FileReader fileRd = null;
		FileWriter fileWt = null;
		
		BufferedReader bufferedRd = null;
		BufferedWriter bufferedWt = null;
		
		
		//원래는 파일 > 파일리더  > 파일데이터사용
		//버퍼는 파일 > 파일리더 > 파일버퍼 > 파일데이터사용
		try {
			// 파일로부터 읽기 위한 객체 생성
			File inFile = new File("file/test_buf_rw_in.txt");
			fileRd = new FileReader(inFile);
			
			//버퍼사용 + 파일읽기 기능
			bufferedRd = new BufferedReader(fileRd);
			
			//파일쓰기 위한 객체 생성
			File outFile = new File("file/test_buf_rw_out.txt");
			fileWt = new FileWriter(outFile);

			//버퍼사용 + 파일쓰기 기능
			bufferedWt = new BufferedWriter(fileWt);
			
			bufferedWt.write("안녕하세요. 자바공부중입니다. \n");
			bufferedWt.write("Hello Java!!!.");
			bufferedWt.newLine();
			bufferedWt.write("재미있나요????????");
			bufferedWt.newLine();
			bufferedWt.write("============================");
			
			bufferedWt.flush();
			
			
			//파일로부터 읽고 쓰기(버퍼 기능 이용해서)
			//파일에서 읽기(한번읽기)
			//라인단위로 읽는 것 readLine()
			String str = bufferedRd.readLine();
			System.out.println("readLine() 처음 읽은 값 : " + str);
			
			
			//파일에쓰기(한 번 쓰기)
			bufferedWt.newLine();
			bufferedWt.write(str);
			bufferedWt.newLine();
			bufferedWt.flush();
			//남은 데이터 모두 읽고 쓰기
			str = bufferedRd.readLine();  // 더이상 없으면 null 리턴
			while(str!=null) {
				bufferedWt.write(str);
				bufferedWt.newLine();
				str = bufferedRd.readLine();
				
			}
			
			bufferedWt.flush();
			
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
			
		} catch (IOException e) {
			
			e.printStackTrace();
			
		} finally {
			if(fileRd != null)
				try {
					fileRd.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			if(fileWt != null)
				try {
					fileWt.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
		}
		
		
	
	}
}
