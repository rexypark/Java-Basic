package com.mystudy.ex02_fileinputstream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
//����Ʈ(byte) : �б�
//������ �Է�(�б�) : InputStream - �߻�Ŭ����
//FileInputStream - InputStream�� ���(extends)�޾� ���� Ŭ����
//����(file)�� ���� �����͸� �Է�(�о�)ó���ϱ� ���� Ŭ����
public class FileInputStream_Ex1 {

	public static void main(String[] args) {
		
		File file = new File("temp.txt");
		System.out.println(file.exists());
		
//		if(!file.exists()) {//������ ������ ���θ���� ó��
//			try {
//			file.createNewFile();
//			} catch (IOException e) {
//				e.printStackTrace();
//			}
//		
			//�о���� ���ϰ� �����
		try {
			// 1. ��� �� ���� ��ü�� ���� �޾Ƽ� ��ü����
			// FileNotFoundException ���ɼ��� ����
			FileInputStream fis = new FileInputStream(file); 
			
			// 2. ��ü ���
			int readValue = fis.read();
			System.out.println("read() ��(int) : " + readValue);
			System.out.println("read() char : " + (char)readValue);
			
			System.out.println("==== ��ü������ �о���� ====");
			while(true) {
				readValue = fis.read();
				System.out.println("read() ��(int) : " + readValue);
				System.out.println("read() char : " + (char)readValue);
				if(readValue == -1) break; // EOF(End Of File) ������ -1 ����
			}
			
			//3. ��ü �ݱ� : ��� �ڿ� ����ġ(���� close)
			fis.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		//Ÿ���� ũ�Ⱑ ū������ �ڿ� ���ǵȴ�.
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
	}
//}
