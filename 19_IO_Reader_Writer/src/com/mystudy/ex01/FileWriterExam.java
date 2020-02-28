package com.mystudy.ex01;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FileWriterExam {
	public static void main(String[] args) {
		//FileWriter : ���Ͽ� ���ڴ��� ����
		File file = new File("file/txt_char.txt");
		
		//��������
		FileWriter fw = null;
		List<String> list = new ArrayList<String>();
		list.add("rexypark very Good player");
		list.add("Brwal!!");
		
	    //����� ��ü ����
		try {
			fw = new FileWriter(file);

			//��ü ���
//			fw.write('��');  //char  ->  int
//			fw.write("��");
			for (String lst : list) {
				fw.write(lst);
			}
			fw.flush(); // ����(Ư�������� �̸� ����� ����)
						// ���۰� ä������ �ʾƵ� Outputó��
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
