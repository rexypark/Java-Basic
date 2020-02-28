package com.mystudy.ex01_buffered;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedReaderWriterExam {

	
	public static void main(String[] args) {
	// ����(buffer) ����� �����Ǿ� �ִ� Ŭ����
	// BufferedReader, BufferedWriter
	// File -> FileReader -> BufferedReader
		FileReader fileRd = null;
		FileWriter fileWt = null;
		
		BufferedReader bufferedRd = null;
		BufferedWriter bufferedWt = null;
		
		
		//������ ���� > ���ϸ���  > ���ϵ����ͻ��
		//���۴� ���� > ���ϸ��� > ���Ϲ��� > ���ϵ����ͻ��
		try {
			// ���Ϸκ��� �б� ���� ��ü ����
			File inFile = new File("file/test_buf_rw_in.txt");
			fileRd = new FileReader(inFile);
			
			//���ۻ�� + �����б� ���
			bufferedRd = new BufferedReader(fileRd);
			
			//���Ͼ��� ���� ��ü ����
			File outFile = new File("file/test_buf_rw_out.txt");
			fileWt = new FileWriter(outFile);

			//���ۻ�� + ���Ͼ��� ���
			bufferedWt = new BufferedWriter(fileWt);
			
			bufferedWt.write("�ȳ��ϼ���. �ڹٰ������Դϴ�. \n");
			bufferedWt.write("Hello Java!!!.");
			bufferedWt.newLine();
			bufferedWt.write("����ֳ���????????");
			bufferedWt.newLine();
			bufferedWt.write("============================");
			
			bufferedWt.flush();
			
			
			//���Ϸκ��� �а� ����(���� ��� �̿��ؼ�)
			//���Ͽ��� �б�(�ѹ��б�)
			//���δ����� �д� �� readLine()
			String str = bufferedRd.readLine();
			System.out.println("readLine() ó�� ���� �� : " + str);
			
			
			//���Ͽ�����(�� �� ����)
			bufferedWt.newLine();
			bufferedWt.write(str);
			bufferedWt.newLine();
			bufferedWt.flush();
			//���� ������ ��� �а� ����
			str = bufferedRd.readLine();  // ���̻� ������ null ����
			while(str!=null) {
				bufferedWt.write(str);
				bufferedWt.newLine();
				str = bufferedRd.readLine();
				
			}
			
			bufferedWt.flush();
			
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
			
		} catch (IOException e) {
			
			e.printStackTrace();
			
		} finally {
			if(fileRd != null)
				try {
					fileRd.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			if(fileWt != null)
				try {
					fileWt.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
		}
		
		
	
	}
}
