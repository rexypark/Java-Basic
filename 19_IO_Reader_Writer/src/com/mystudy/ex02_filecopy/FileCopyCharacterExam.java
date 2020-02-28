package com.mystudy.ex02_filecopy;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileCopyCharacterExam {
	public static void main(String[] args) {
		//(�ǽ�) FileReader, FileWriter ����ؼ� ���Ϻ���
		//�������� : file/test_char.txt
		//������� : file/test_char_copy.txt
		//ó�� : ���������� �о ������Ͽ� ����(���� - ���ڴ���ó��)
		//-----------------------------------------------
		
		// nulló���� ����� close�� �� �ش� ������ ������ �Ǻ� �� �� �ִ�.
		FileReader fileRd = null;
		FileWriter fileWt = null;
		
		//0. ����� ���� ��ü ����
		File fileIn = new File("file/txt_char.txt");
		File fileOut = new File("file/txt_char_copy.txt");
		
		try {
		//1. ���Ϸκ��� �а�, �� ��ü ������ ���� ����   >>  Input
		fileRd = new FileReader(fileIn);
		//2. �б����� ��ü����, �������� ��ü ����        >>  Output
		fileWt = new FileWriter(fileOut);

		//3. �а�, ���� (�ݺ��۾�)
		int readVal = -1;
		while((readVal = fileRd.read()) != -1) {
			//fileWt�� fileRd���� ����ϴ� �� ����
			fileWt.write((char)readVal);
		}
		// fileWt�� ����
		fileWt.flush();
		
		
		
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			//4. ����� ��ü close()ó��
			
				try { 
					if(fileWt != null) fileWt.close();
					if(fileRd != null) fileRd.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			
		}

		
		
	
		
		
		
		
		
		
	}
}
