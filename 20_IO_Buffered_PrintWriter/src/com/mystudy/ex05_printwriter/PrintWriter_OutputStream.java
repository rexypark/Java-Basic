package com.mystudy.ex05_printwriter;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;

public class PrintWriter_OutputStream {

	public static void main(String[] args) {
		//PrintWrtier : byte계열, 문자계열 모두 사용가능
		FileOutputStream fos = null;
		PrintWriter pw = null;

		
		try {
			fos = new FileOutputStream(new File("file/pw_ouputStream.txt"));
			pw = new PrintWriter(fos);
			
			pw.write("안녕하세요 \n");
			pw.println("IO공부 씐난당~~~");
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} finally {
			pw.close();
		}
		
		
	}
}
