package com.mystudy.ex05_hashset;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class HashSetLotto {
	public static void main(String[] args) {
	
	
		//TreeSet > ���ĵ� set
		//�ζǹ�ȣ �������� 6�� �޴� set ����
		Set lottoSet= new TreeSet();

		// 1 ~ 45�������� ��ȣ�� �������� �޴� ��ȣ ���� ����
		int rNum;
		
		// set�� �ߺ��� �����Ƿ� ���� ���� �� �� ����.
		// lottoSet�� ũ�Ⱑ 6�� �� ���� lottoSet�� ���� ���� ����
		while (lottoSet.size() != 6) {
				   //���� �� 1~45
			rNum = (int)(Math.random()*45 + 1);
			//lottoSet�� ���� �� ����
			lottoSet.add(rNum);
		}
		
		
		
		//������ �ִ� ǥ��ȭ �Ͽ� ���� ��� ��ȯ �ϱ� ���� iterator ���� 
		
//		ArrayList<Integer> lottoArr = new ArrayList<Integer>(lottoSet);
//		// ArrayList �������� ����
//		Collections.sort(lottoArr);
		// ������ �ζǹ�ȣ : ��ȣ �������� ���
		System.out.print("������ �ζǹ�ȣ : ");
		

		// �ζ� ��ȣ ���
		for (Object list : lottoSet) System.out.print(list + " ");
		
		
		
		
	}
}
