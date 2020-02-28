package com.mystudy.ex01_file;

import java.io.File;

public class FileExam1 {
public static void main(String[] args) {
	String separator = File.separator;
	System.out.println("File.separator : " + separator);
	
	char separatorChar = File.pathSeparatorChar;
	System.out.println(separatorChar);
	
	char pathSeparator = File.pathSeparatorChar;
	
	System.out.println("File.pathSeparator : " + pathSeparator);
	
	System.out.println("=============================");
	
	File[] listRoots = File.listRoots();
	
	for(File root : listRoots) {
		System.out.println(root);
	}
	
	}
}
