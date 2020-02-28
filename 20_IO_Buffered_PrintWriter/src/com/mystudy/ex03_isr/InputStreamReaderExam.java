package com.mystudy.ex03_isr;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputStreamReaderExam {
	public static void main(String[] args) {
		// byte ó�� �迭 -> ���� ó�� �迭 ��ȯ
		// �����͸� byte�迭�� �о� ���̰�, ���������� ���ڴ����� ó��
		
		// InputStreamReader : InputStrea -> Reader ��ȯ
		// OutputStreamWriter : OutputStream -> Writer ��ȯ
		
		File file = new File("file/test_isr.txt");
		FileInputStream fis = null;
		InputStreamReader isr = null;
		BufferedReader br = null;
		
		
		try {
			
			fis = new FileInputStream(file);
			int readByte = fis.read();
			System.out.println((char)readByte);
			//buffer�� ����Ʈ�� ���� �ʴ´�
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
			
			//InputStreamReader�� InputStream�� ��� �޴´�
			//InputStream > InputStreamReader
			//InputStreamReader�� Reader�� Object��ü�� ������.
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
