package com.mystudy.ex02_filecopy;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileCopyCharacterExam2 {
	public static void main(String[] args) {
		
		FileOutputStream fileEdit = null;
		
		File file = new File("file/txt_char.txt");
		
		try {
		fileEdit = new FileOutputStream(file);

		String rexy = "rexypark very Good player\nBrwal!!!";		
		byte[] bytes = rexy.getBytes();
		
		fileEdit.write(bytes);
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			//4. 사용한 객체 close()처리
			if(fileEdit != null) {
				try {
					fileEdit.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}

		
		
	
		
		
		
		
		
		
	}
}
