package com.mystudy.ex03.localdatetype;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Calendar;

public class LocalDate_Test {
	public static void main(String[] args) {
		
		//Calendar : 객체에 저장된 데이터가 변경됨
		Calendar now = Calendar.getInstance();
		
		System.out.println("Calendar.getInstance() : "+ now);
		now.add(Calendar.DATE,  3);
		now.add(Calendar.MONTH,  -3);
		System.out.println("3달전 3일후 변경 후 : " + now);
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
