package com.ariba.dateworks;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;

public class DateEx2 {
	public static void main(String[] args) {
		LocalDate date1 = LocalDate.now();
		LocalDate date2 = LocalDate.of(1990, Month.APRIL, 20);
		
		// on days 
		Period p   = Period.between(date1, date2);
		System.out.println("Period is " + p);
	
		LocalTime time1 = LocalTime.now();
		LocalTime time2 = LocalTime.of(10, 10);
		
		// work on time min, sec, hrs 
		Duration duration = Duration.between(time1, time2);
		System.out.println(duration);
		
		Duration twoHrs = Duration.ofMinutes(2);
		
		LocalTime t2 = time1.plusHours(2);
		System.out.println("Tim 1 is " + time1);
		System.out.println("t2 value is " + t2);
		
	}
}
