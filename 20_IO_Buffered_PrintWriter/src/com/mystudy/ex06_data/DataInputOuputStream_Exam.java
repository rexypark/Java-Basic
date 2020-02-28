package com.mystudy.ex06_data;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataInputOuputStream_Exam {

	public static void main(String[] args) {
		// DataInputStream, DataOutputStream
		// 기본데이터 타입 방식으로 쓰고, 읽기
		File file = new File("file/data_IO_stream.txt");
		FileInputStream fis = null;
		FileOutputStream fos = null;
		
		DataInputStream dis = null;
		DataOutputStream dos = null;
				
		try {
			
			//out file > 데이터를 써서 내보내는 역할
			fos = new FileOutputStream(file);
			dos = new DataOutputStream(fos);
			
			//in file > 데이터를 불러와 읽는 역할
			fis = new FileInputStream(file);
			dis = new DataInputStream(fis);
			
			// DataOutStream > dos.write로 데이터 쓰기(저장)
			dos.writeInt(12345);		
			dos.writeBoolean(true);		
			dos.writeByte(1234);		
			dos.writeDouble(123.15452);
			dos.writeUTF("abc한글문자열");
			// ===================
			// 저장된 데이터 읽어오기
			// fis = new FileInputStream(file);
			
			//DataInStream > dis.read로 데이터 읽기(출력)
			System.out.println(dis.readInt());
			System.out.println(dis.readBoolean());
			System.out.println(dis.readByte());
			System.out.println(dis.readDouble());
			System.out.println(dis.readUTF());
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally { 
			try {
				dos.close();
				dis.close();
				
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		
	}
}
