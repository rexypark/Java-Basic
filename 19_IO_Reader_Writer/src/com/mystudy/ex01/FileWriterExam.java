package com.mystudy.ex01;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FileWriterExam {
	public static void main(String[] args) {
		//FileWriter : 파일에 문자단위 쓰기
		File file = new File("file/txt_char.txt");
		
		//변수선언
		FileWriter fw = null;
		List<String> list = new ArrayList<String>();
		list.add("rexypark very Good player");
		list.add("Brwal!!");
		
	    //사용할 객체 생성
		try {
			fw = new FileWriter(file);

			//객체 사용
//			fw.write('대');  //char  ->  int
//			fw.write("한");
			for (String lst : list) {
				fw.write(lst);
			}
			fw.flush(); // 버퍼(특정공간을 미리 만들어 저장)
						// 버퍼가 채워지지 않아도 Output처리
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
//			try {
//				if(fw != null) {
//					fw.close();
//				}
//			} catch (IOException e) {
//				e.printStackTrace();
//			}
			
		}
		
	}
}
