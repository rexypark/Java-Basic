package com.mystudy.ex05_hashset;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class HashSetLotto {
	public static void main(String[] args) {
	
	
		//TreeSet > 정렬된 set
		//로또번호 랜덤으로 6개 받는 set 생성
		Set lottoSet= new TreeSet();

		// 1 ~ 45번까지의 번호를 랜덤으로 받는 번호 저장 변수
		int rNum;
		
		// set은 중복이 없으므로 같은 수가 들어갈 수 없다.
		// lottoSet의 크기가 6일 때 까지 lottoSet에 랜덤 수를 저장
		while (lottoSet.size() != 6) {
				   //랜덤 수 1~45
			rNum = (int)(Math.random()*45 + 1);
			//lottoSet에 랜덤 수 저장
			lottoSet.add(rNum);
		}
		
		
		
		//가지고 있는 표준화 하여 수를 모두 반환 하기 위해 iterator 생성 
		
//		ArrayList<Integer> lottoArr = new ArrayList<Integer>(lottoSet);
//		// ArrayList 오름차순 정렬
//		Collections.sort(lottoArr);
		// 금주의 로또번호 : 번호 형식으로 출력
		System.out.print("금주의 로또번호 : ");
		

		// 로또 번호 출력
		for (Object list : lottoSet) System.out.print(list + " ");
		
		
		
		
	}
}
