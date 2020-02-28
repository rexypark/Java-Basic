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
		//StudentVO 객체들을 List에 담아서 파일에 저장하고
		// 파일에서 읽어들인 List에 담긴 데이터를 화면에 출력
		File file = new File("file/object_io_list.txt");
		File file_saveData = new File("file/object_io_list_saveData.txt");
		
		System.out.println(">> 저장 할 데이터");
		
		//객체 생성
		StudentVO std1 = new StudentVO("19001","홍길동",100,90,81);
		StudentVO std2 = new StudentVO("19002","박성구",99,100,100);
		StudentVO std3 = new StudentVO("19002","김민채",85,95,75);
		StudentVO std4 = new StudentVO("19002","박희영",55,85,65);
		System.out.println("std1 : " + std1);
		System.out.println("std2 : " + std2);
		System.out.println("========================");
		
		//리스트 생성 및 객체 저장
		ArrayList<StudentVO> list = new ArrayList<>();
		list.add(std1);
		list.add(std2);
		list.add(std3);
		list.add(std4);
		System.out.println("list : " + list);
		
		
		//출력을 위한 FileOutStream, ObjectOutStream 객체 생성
		
		//문자 데이터 저장 파일 fos생성
		FileWriter save_fWt = null;
		BufferedWriter save_bWt = null;
		
		// 실습 ArrayList 타입의 객체 list를 파일에 저장하고
		// 파일에 저장된 데이터를 읽어 들여 list에 저장된 학생정보를 화면 출력
		// 화면 출력시 toString() 사용하지 말고 필드값 추출해서 직접 화면 출력
		
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
			
			save_bWt.write("이름" + "\t" + "국어" + "\t" + "영어" + "\t" + "수학" + "\t" + "총점" + "\t" + "평균 \n" );
			save_bWt.write("======================================\n");
			
			System.out.println();
			System.out.println("이름" + "\t" + "국어" + "\t" + "영어" + "\t" + "수학" + "\t" + "총점" + "\t" + "평균" );
			System.out.println("==============================================");
			
			
			// 하나의 객체씩 입력 받는 것이 아니라, 리스트 통째로 저장하여
			// 새롭게 받은 리스트를 참조하여 데이터를 입력 받는다.
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
