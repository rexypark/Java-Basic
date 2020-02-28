package com.mystudy.ex03.localdatetype;

import java.time.LocalDateTime;

public class LocalDateTime_Test {
public static void main(String[] args) {
	

	LocalDateTime nowDt = LocalDateTime.now();
	System.out.println("LocalDateTime.now() : " + nowDt);
	System.out.println(nowDt.getYear());
	System.out.println(nowDt.getMonthValue());
	System.out.println(nowDt.getDayOfMonth());
	System.out.println(nowDt.getHour());
	System.out.println(nowDt.getMinute());
	System.out.println(nowDt.getSecond());
	
	System.out.println(nowDt.now());


}
}
