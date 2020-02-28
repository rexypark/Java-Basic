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
			pw.write("안녕하세요~~~");
			pw.println();
			pw.write("반갑습니다.");

			pw.write("지금 자바공부중~~ \n");
			pw.write("월요병???.");
			pw.printf("%10s %10s \n", "이제", "둘째시간");
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			
			pw.close();
			
		}
		
		
	}
}
