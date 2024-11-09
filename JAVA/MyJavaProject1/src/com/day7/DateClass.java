package com.day7;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Date;

public class DateClass {

	public static void main(String[] args) {
		
		LocalDate date=LocalDate.now();
		System.out.println(date);
		System.out.println(date.getMonthValue());
		System.out.println(date.getYear());
		
		LocalTime time=LocalTime.now();
		System.out.println(time);
		System.out.println(time.getHour());
		System.out.println(time.getMinute());
		
		LocalDateTime dt=LocalDateTime.now();
		System.out.println(dt);
		/*Date date=new Date();
		System.out.println(date);
		System.out.println(date.getDate());
		System.out.println(date.getMonth());
		System.out.println(date.getMonth());
		System.out.println(date.getYear());//2024-1900 old 
		*/
		
	}

}
