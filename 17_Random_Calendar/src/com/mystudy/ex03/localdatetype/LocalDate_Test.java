package com.mystudy.ex03.localdatetype;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Calendar;

public class LocalDate_Test {
	public static void main(String[] args) {
		
		//Calendar : ��ü�� ����� �����Ͱ� �����
		Calendar now = Calendar.getInstance();
		
		System.out.println("Calendar.getInstance() : "+ now);
		now.add(Calendar.DATE,  3);
		now.add(Calendar.MONTH,  -3);
		System.out.println("3���� 3���� ���� �� : " + now);
		LocalDate nowDate = LocalDate.now();
		System.out.println(nowDate);
		System.out.println(nowDate.getMonthValue());
		System.out.println(nowDate.getDayOfMonth());
		
		LocalDate newDate = nowDate.plusYears(2).plusMonths(2).plusDays(2);
		System.out.println(newDate);
		
		
		System.out.println("==== LocalTime ====");
		
		LocalTime nowTime = LocalTime.now();
		System.out.println("LocalTime.now() : " + LocalTime.now());
		System.out.println(nowTime.getHour());
		System.out.println(nowTime.getMinute());
		System.out.println(nowTime.getSecond());
		System.out.println(nowTime.getNano());
		LocalTime newtime = nowTime.plusHours(2);
	}
}
