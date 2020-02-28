package com.mystudy.ex02_filecopy;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReceiveString {
	public static void main(String[] args) {
		//(�ǽ�) FileReader, FileWriter ����ؼ� ���Ϻ���
		//�������� : file/test_char.txt
		//������� : file/test_char_copy.txt
		//ó�� : ���������� �о ������Ͽ� ����(���� - ���ڴ���ó��)
		//-----------------------------------------------
		
		// nulló���� ����� close�� �� �ش� ������ ������ �Ǻ� �� �� �ִ�.
		FileReader fileRd = null;
		List<String> list = new ArrayList<String>();
		//0. ����� ���� ��ü ����
		File fileIn = new File("file/txt_char.txt");
		
		try {
		//1. ���Ϸκ��� �а�, �� ��ü ������ ���� ����   >>  Input
		fileRd = new FileReader(fileIn);

		//3. �а�, ���� (�ݺ��۾�)
		int readVal = -1;
		String emp = "";
		
		while((readVal = fileRd.read()) != -1) {
			emp += String.valueOf((char)readVal);
		}
		String[] listEmp = emp.split(" ");
		for (String lst : listEmp) {
			System.out.print(lst + " ");
		}
		
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			//4. ����� ��ü close()ó��
			if(fileRd != null) {
				try {
					fileRd.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}

		
		
	
		
		
		
		
		
		
	}
}
