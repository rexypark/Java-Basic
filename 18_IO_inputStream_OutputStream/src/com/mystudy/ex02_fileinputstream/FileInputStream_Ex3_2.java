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
			//1. ��ü����(���� �б�� ��ü)  <-  File
			fis = new FileInputStream(file);
			
			//2. ��ü��� �۾�ó��
//			(int) file.length()
			byte[] bytes = new byte[(int)file.length()];
			int byteCnt = 0;
			// ������ �а� ���� ������ �ϳ��� ������ �ݺ��� ����
			// ���ϰ��� -1�� ��쿡�� �����ǳ�(EOF)�� ���� ���
//			byteCnt = fis.read(bytes);
//			System.out.println("�о�� ���� : " + byteCnt);
//			System.out.println("�о�� �� : " + Arrays.toString(bytes));
//			System.out.println((char)-1);
			
			
			while ((byteCnt = fis.read(bytes)) != -1) {
				
				System.out.println("�о�� ���� : " + byteCnt);
				System.out.println("�о�� �� : " + Arrays.toString(bytes));
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
		
		
		
		

		
		
		
		//3. ��밴ü close
		
		
		
	}
}
