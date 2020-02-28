package com.mystudy.ex04_filecopy;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopy_Test {

	public static void main(String[] args) {
		// ���Ϻ��� : �������Ͽ��� �а�(Input) ������Ͽ� ����(Output)
		
		// ������ ���� ����(source file : AS-IS)
		File fileIn = new File("src/com/mystudy/ex04_filecopy/FileCopy_Test.java");
		
		// ���� ���� �������(target : To-BE)
		File fileOut = new File("file/FileCopy_Test_Backup.java");
		
		// 1. ���Ͽ��� �а� �������� ��ü�� ������ ���� ����
		FileInputStream fis = null;
		FileOutputStream fos = null;
		
		// ���Ͽ��� �а� ���� ���� ��ü�� ����
		try {
			fis = new FileInputStream(fileIn);
			fos = new FileOutputStream(fileOut);
			
		//2. ��ü ����ؼ� �а� ����
			int value = -1; 
			
			while (true) {
				//�б�(1byte)
				value = fis.read();
				if (value == -1) break; //EOF(End Of File) ������ ���̸� �ݺ����� 
				//����(1byte)
				fos.write(value);
			}
		
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if(fos != null) {
				//3. ��밴üclose(�������� ��������)
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
