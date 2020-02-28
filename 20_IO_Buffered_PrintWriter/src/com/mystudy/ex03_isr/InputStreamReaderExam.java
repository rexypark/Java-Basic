package com.mystudy.ex03_isr;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputStreamReaderExam {
	public static void main(String[] args) {
		// byte 처리 계열 -> 문자 처리 계열 전환
		// 데이터를 byte계열로 읽어 들이고, 최종적으로 문자단위로 처리
		
		// InputStreamReader : InputStrea -> Reader 전환
		// OutputStreamWriter : OutputStream -> Writer 전환
		
		File file = new File("file/test_isr.txt");
		FileInputStream fis = null;
		InputStreamReader isr = null;
		BufferedReader br = null;
		
		
		try {
			
			fis = new FileInputStream(file);
			int readByte = fis.read();
			System.out.println((char)readByte);
			//buffer는 바이트를 갖지 않는다
			//br = new BufferedReader(fis)
			
			
			isr = new InputStreamReader(fis);
			System.out.println();
			System.out.println();
			System.out.println();
			
			int isrCnt = isr.read();
				
			System.out.print((char)(isrCnt));
			
			
			br = new BufferedReader(isr);
			String str = br.readLine();
			System.out.println(str);
			
			while(true) {
				str = br.readLine();
				if(str == null) break;
				System.out.println(str);
			}
			
			//InputStreamReader는 InputStream을 상속 받는다
			//InputStream > InputStreamReader
			//InputStreamReader는 Reader와 Object객체를 가진다.
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
