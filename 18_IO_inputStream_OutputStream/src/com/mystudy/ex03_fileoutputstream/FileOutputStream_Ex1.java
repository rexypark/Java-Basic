package com.mystudy.ex03_fileoutputstream;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FileOutputStream_Ex1 {
	
	public static void main(String[] args) {
		//FileOutputStream : byte ������ ���Ͽ� ����(���, ����)
		//  - OutputStream �߻�Ŭ������ ��ӹ޾�(Ȯ���ؼ� extends) ������� Ŭ���� 

		
		//Output������ �ش� ������ ������ �ڵ����� �����Ѵ�.		
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
		
		
		// 1. ��ü����
		try {
//			fos = new FileOutputStream(file);
			fos = new FileOutputStream(file); //�߰�(append) ���·� ��� >> ����
		// 2. ��ü ��� �۾� ó��
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
			
			//write(����Ʈ�迭)
			fos.write(bytes);
			
			//write(����Ʈ�迭, ������ġ, ����)
			//write(byte[] b, off, len)
			//012345678
			//rexypark!!
			//rexy (�ε��� 0���� 4����)
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
