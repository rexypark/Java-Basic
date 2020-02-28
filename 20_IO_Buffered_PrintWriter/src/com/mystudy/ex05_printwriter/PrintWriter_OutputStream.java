package com.mystudy.ex05_printwriter;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;

public class PrintWriter_OutputStream {

	public static void main(String[] args) {
		//PrintWrtier : byte�迭, ���ڰ迭 ��� ��밡��
		FileOutputStream fos = null;
		PrintWriter pw = null;

		
		try {
			fos = new FileOutputStream(new File("file/pw_ouputStream.txt"));
			pw = new PrintWriter(fos);
			
			pw.write("�ȳ��ϼ��� \n");
			pw.println("IO���� ������~~~");
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} finally {
			pw.close();
		}
		
		
	}
}
