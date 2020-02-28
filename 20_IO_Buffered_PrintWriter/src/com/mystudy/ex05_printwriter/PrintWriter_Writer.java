package com.mystudy.ex05_printwriter;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class PrintWriter_Writer {
	
	public static void main(String[] args) {
		//File -> FileWrtier -> (BufferedWriter) -> PrintWriter
		FileWriter fw = null;
		BufferedWriter bw = null;
		PrintWriter pw = null;
		
		
	 
		
		try {
			fw = new FileWriter(new File("file/pw_out.txt"));
			bw = new BufferedWriter(fw);
			pw = new PrintWriter(bw);
			
			//pw = new PrintWriter(new BufferedWriter(new FileWriter(new File("file/pw_out.txt"))));
			pw.write("�ȳ��ϼ���~~~");
			pw.println();
			pw.write("�ݰ����ϴ�.");

			pw.write("���� �ڹٰ�����~~ \n");
			pw.write("���亴???.");
			pw.printf("%10s %10s \n", "����", "��°�ð�");
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			
			pw.close();
			
		}
		
		
	}
}
