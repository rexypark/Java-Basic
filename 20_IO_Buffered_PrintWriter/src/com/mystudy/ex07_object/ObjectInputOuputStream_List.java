package com.mystudy.ex07_object;

import java.io.BufferedOutputStream;
import java.io.BufferedWriter;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import javax.naming.spi.ObjectFactoryBuilder;

public class ObjectInputOuputStream_List {
	
	public static void main(String[] args) {
		//StudentVO ��ü���� List�� ��Ƽ� ���Ͽ� �����ϰ�
		// ���Ͽ��� �о���� List�� ��� �����͸� ȭ�鿡 ���
		File file = new File("file/object_io_list.txt");
		File file_saveData = new File("file/object_io_list_saveData.txt");
		
		System.out.println(">> ���� �� ������");
		
		//��ü ����
		StudentVO std1 = new StudentVO("19001","ȫ�浿",100,90,81);
		StudentVO std2 = new StudentVO("19002","�ڼ���",99,100,100);
		StudentVO std3 = new StudentVO("19002","���ä",85,95,75);
		StudentVO std4 = new StudentVO("19002","����",55,85,65);
		System.out.println("std1 : " + std1);
		System.out.println("std2 : " + std2);
		System.out.println("========================");
		
		//����Ʈ ���� �� ��ü ����
		ArrayList<StudentVO> list = new ArrayList<>();
		list.add(std1);
		list.add(std2);
		list.add(std3);
		list.add(std4);
		System.out.println("list : " + list);
		
		
		//����� ���� FileOutStream, ObjectOutStream ��ü ����
		
		//���� ������ ���� ���� fos����
		FileWriter save_fWt = null;
		BufferedWriter save_bWt = null;
		
		// �ǽ� ArrayList Ÿ���� ��ü list�� ���Ͽ� �����ϰ�
		// ���Ͽ� ����� �����͸� �о� �鿩 list�� ����� �л������� ȭ�� ���
		// ȭ�� ��½� toString() ������� ���� �ʵ尪 �����ؼ� ���� ȭ�� ���
		
		try (FileOutputStream fos = new FileOutputStream(file);
		     ObjectOutputStream oos = new ObjectOutputStream(fos);){
			
			
			
			//
			oos.writeObject(list);
			
			
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
			
		} catch (IOException e) {
			
			e.printStackTrace();
			
		} 
		
		try (FileInputStream fis = new FileInputStream(file);
			 ObjectInputStream ois = new ObjectInputStream(fis);
				){

			
			save_fWt = new FileWriter(file_saveData);
			save_bWt = new BufferedWriter(save_fWt);
			
			save_bWt.write("�̸�" + "\t" + "����" + "\t" + "����" + "\t" + "����" + "\t" + "����" + "\t" + "��� \n" );
			save_bWt.write("======================================\n");
			
			System.out.println();
			System.out.println("�̸�" + "\t" + "����" + "\t" + "����" + "\t" + "����" + "\t" + "����" + "\t" + "���" );
			System.out.println("==============================================");
			
			
			// �ϳ��� ��ü�� �Է� �޴� ���� �ƴ϶�, ����Ʈ ��°�� �����Ͽ�
			// ���Ӱ� ���� ����Ʈ�� �����Ͽ� �����͸� �Է� �޴´�.
			// ArrayList<StudentVO>  <====  Object
			
			ArrayList<StudentVO> stdList = (ArrayList<StudentVO>) ois.readObject();
			

			for (StudentVO stds : stdList) {
			System.out.println(stds.getName() + "\t" + stds.getKor() + "\t" + stds.getEng() + "\t" + stds.getMath() + "\t" + stds.getTot() + "\t" + stds.getAvg());
			save_bWt.write(stds.getName() + "\t" + stds.getKor() + "\t" + stds.getEng() + "\t" + stds.getMath() + "\t" + stds.getTot() + "\t" + stds.getAvg()+"\n");
			}
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} finally {
		
			if (save_bWt != null) {
				try {
					save_bWt.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		
		
		
	}
}
