package com.mystudy.ex07_object;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

public class ObjectInputOutputStream_Exam {
	public static void main(String[] args) {
		// ObjectInputStream, ObjectOutputStream
		// Object Ÿ���� �����͸� ����ؼ� �����(I/O)
		//--------------------------------------
		// Object Ÿ���� �����͸� ���Ͽ� �����ϰ� �о����
		// StudentVO Ÿ���� ������ ���
		File file = new File("file/object_io.txt");
		
		
		// ���Ͽ� ���� ���� �뵵
		FileOutputStream fos = null;
		ObjectOutputStream oos = null;
		
		
		// ���Ϸ� ���� �б� ���� �뵵
		FileInputStream fis = null;
		ObjectInputStream ois = null;
		
		
		//���Ͽ� ������ ������ �غ�
		System.out.println("=== ������ ������ �غ� ===");
		StudentVO std1 = new StudentVO("19001","ȫ�浿",100,90,81);
		StudentVO std2 = new StudentVO("19002","�ڼ���",99,100,100);
		System.out.println(std1);
		
		System.out.println("=========================");
		
		
		//���Ͽ� ����
		try {
			
			
			fos = new FileOutputStream(file);
			oos = new ObjectOutputStream(fos);
			
			
			System.out.println("���Ͽ� ����(ObjectOutputStream)");
			// writeObject�� objŸ���� ���� �Ķ���Ϳ� �Է� / object�� ��ü�� ���� �����ϴ�.
			oos.writeObject(std1);
			oos.writeObject(std2);
		
			
		} catch (FileNotFoundException e) {

			
			e.printStackTrace();
			
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				oos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		// ���Ϸκ��� �б�===========================================
		try {
			fis = new FileInputStream(file);
			ois = new ObjectInputStream(fis);
			
//			Object obj = ois.readObject();
//			StudentVO stu = (StudentVO)obj;
//			StudentVO stu = null;
//			if (obj instanceof StudentVO) { 
//				stu = (StudentVO)obj;
//			}
//			System.out.println(stu);
//			System.out.println(">> �о�� ������ ���");
//			System.out.println("�̸� : " + stu.getName() + ", ��� " + stu.getAvg());
//			
//			
			StudentVO stuIn1 = (StudentVO)ois.readObject();
			StudentVO stuIn2 = (StudentVO)ois.readObject();
			
			
			
			System.out.println(stuIn1);
			System.out.println(stuIn2);
			
			
//			System.out.println(stu.getName());
			
			
			 
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} finally {
			try {
				if(ois!=null) {
				ois.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		
		
		
	}// end main
}// end class
