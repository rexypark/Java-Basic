package com.mystudy.ex02.calendar;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class CalendarExam {
	public static void main(String[] args) {
		Date date = new Date();
		System.out.println("date : " + date.getYear());
		date = new Date(119,9,24);
		System.out.println(date);
		
		
		System.out.println("=== Calendar ===");
		System.out.println(getDateTime());
		
		
		SimpleDateFormat sdf 
			= new SimpleDateFormat("yyyy-MM0dd hh:mm:ss");
		System.out.println(sdf.format(date));
		//��-��-�� ��:��:��
		
	}
	static String getDateTime() {
		
		
		
		Calendar cal = Calendar.getInstance();
		int date = cal.get(Calendar.DATE);
		
		String today = cal.get(Calendar.YEAR) + "-" + (cal.get(Calendar.MONTH)+1) + " " + cal.get(Calendar.HOUR) +":"+cal.get(Calendar.MINUTE)+":"+cal.get(Calendar.SECOND);
		System.out.println("�� : " + cal.get(Calendar.MONTH)+1);
		System.out.println("�� : " + cal.get(Calendar.DATE));
		System.out.println("�������� : " + cal.get(Calendar.AM_PM));
		System.out.println("��(12�ð�) : " + cal.get(Calendar.HOUR));
		System.out.println("��(24�ð�) : " + cal.get(Calendar.HOUR_OF_DAY));
		System.out.println("�� : " + cal.get(Calendar.MINUTE));
		System.out.println("�� : " + cal.get(Calendar.SECOND));
		return today;
	}
}
