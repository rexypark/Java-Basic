package com.mystudy.ex03_fileoutputstream;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FileOutputStream_Ex1 {
	
	public static void main(String[] args) {
		//FileOutputStream : byte 단위로 파일에 저장(출력, 쓰기)
		//  - OutputStream 추상클래스를 상속받아(확장해서 extends) 만들어진 클래스 

		
		//Output에서는 해당 파일이 없으면 자동으로 생성한다.		
		File file = new File("file/temp_out_01.txt");
		FileOutputStream fos = null;
		List<String> list = new ArrayList<String>();
		list.add("r");
		list.add("e");
		list.add("x");
		list.add("y");
		list.add("p");
		list.add("a");
		list.add("r");
		list.add("k");
		list.add(" ");
		System.out.println(list);
		
		
		// 1. 객체생성
		try {
//			fos = new FileOutputStream(file);
			fos = new FileOutputStream(file); //추가(append) 형태로 출력 >> 수정
		// 2. 객체 사용 작업 처리
			String emp = "";
			for (String lst : list) {
				emp += lst;
			}
			
			byte[] bytes = emp.getBytes();
//			fos.write('H');
//			fos.write('e');
//			fos.write('l');
//			
//			for(int i = 0; i < bytes.length; i++) {
//				fos.write(bytes[i]);
//			}
			
			//write(바이트배열)
			fos.write(bytes);
			
			//write(바이트배열, 시작위치, 개수)
			//write(byte[] b, off, len)
			//012345678
			//rexypark!!
			//rexy (인덱스 0에서 4까지)
			fos.write(bytes,0,4);
			fos.write('\n');
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		finally {
			if(fos != null) {
				try {
				fos.close();
				}  catch(IOException e) {
					e.printStackTrace();
				}
			}
		}
		
		
		
		
	}
	
}
