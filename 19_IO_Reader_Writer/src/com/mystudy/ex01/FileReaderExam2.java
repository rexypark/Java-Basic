package com.mystudy.ex01;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderExam2 {
	public static void main(String[] args) {
		// ����(Character) ���� �Է� ó��
		// FileReader : ���Ϸ� ���� ���ڴ����� ������ �б�
		// ���ڴ��� : 1, A, $ - 1 byte����
		//         ��, ��, �K - 2 byte����(�ѱ�,�߱���,�±���,�ƶ���....)
		// -----------------------------------------------------
		
		// FileReader�� �о�� ��� ����(file)
		File file = new File("file/txt_char.txt");
		
		// FileReader Ÿ�� ��ü ����� ���� ����
		FileReader fr = null;
		
		
		try {
			// 1. ��ü����
			fr = new FileReader(file);
			
			// 2. ��ü ����ؼ� ���ڴ����� �б�
			//[�ǽ�] �ݺ��� ó��
			
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
			System.out.println("[���ܹ߻�] : " + e.getMessage());
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
