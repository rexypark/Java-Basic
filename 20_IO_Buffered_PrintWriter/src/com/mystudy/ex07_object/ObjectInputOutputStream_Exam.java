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
		// Object 타입의 데이터를 사용해서 입출력(I/O)
		//--------------------------------------
		// Object 타입의 데이터를 파일에 저장하고 읽어오기
		// StudentVO 타입의 데이터 사용
		File file = new File("file/object_io.txt");
		
		
		// 파일에 쓰기 위한 용도
		FileOutputStream fos = null;
		ObjectOutputStream oos = null;
		
		
		// 파일로 부터 읽기 위한 용도
		FileInputStream fis = null;
		ObjectInputStream ois = null;
		
		
		//파일에 저장할 데이터 준비
		System.out.println("=== 저장할 데이터 준비 ===");
		StudentVO std1 = new StudentVO("19001","홍길동",100,90,81);
		StudentVO std2 = new StudentVO("19002","박성구",99,100,100);
		System.out.println(std1);
		
		System.out.println("=========================");
		
		
		//파일에 쓰기
		try {
			
			
			fos = new FileOutputStream(file);
			oos = new ObjectOutputStream(fos);
			
			
			System.out.println("파일에 쓰기(ObjectOutputStream)");
			// writeObject로 obj타입의 값을 파라미터에 입력 / object는 객체도 저장 가능하다.
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
		// 파일로부터 읽기===========================================
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
//			System.out.println(">> 읽어온 데이터 사용");
//			System.out.println("이름 : " + stu.getName() + ", 평균 " + stu.getAvg());
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
