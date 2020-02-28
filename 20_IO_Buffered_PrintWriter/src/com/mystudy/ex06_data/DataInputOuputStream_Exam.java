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
		// �⺻������ Ÿ�� ������� ����, �б�
		File file = new File("file/data_IO_stream.txt");
		FileInputStream fis = null;
		FileOutputStream fos = null;
		
		DataInputStream dis = null;
		DataOutputStream dos = null;
				
		try {
			
			//out file > �����͸� �Ἥ �������� ����
			fos = new FileOutputStream(file);
			dos = new DataOutputStream(fos);
			
			//in file > �����͸� �ҷ��� �д� ����
			fis = new FileInputStream(file);
			dis = new DataInputStream(fis);
			
			// DataOutStream > dos.write�� ������ ����(����)
			dos.writeInt(12345);		
			dos.writeBoolean(true);		
			dos.writeByte(1234);		
			dos.writeDouble(123.15452);
			dos.writeUTF("abc�ѱ۹��ڿ�");
			// ===================
			// ����� ������ �о����
			// fis = new FileInputStream(file);
			
			//DataInStream > dis.read�� ������ �б�(���)
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
