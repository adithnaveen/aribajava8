package com.ariba.dateworks;

import java.time.Clock;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;

public class DateEx1 {
	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		cal.add(Calendar.HOUR, 8);
		
		System.out.println("After Adding 8 hrs "+ cal.getTime());
		
		
		// java 8 
		LocalTime now = LocalTime.now();
		
		LocalTime later = now.plus(8, ChronoUnit.HOURS);
		System.out.println("After adding 8 hrs - JDK 8 "  + later);
			
		// to add 30 days 
		LocalDate today = LocalDate.now();
		System.out.println("After adding 30 Days : " + today.plusDays(30));
		System.out.println("After adding 1 month :" + today.plusMonths(1));
		System.out.println("Before 1 Month " + today.minusMonths(1));
		
		
		LocalTime newTime = LocalTime.of(22, 10, 22);
		System.out.println("New time is " + newTime);
		
		LocalDate newDate = LocalDate.of(2016, Month.JANUARY, 10);
		System.out.println("New Date " + newDate);
		
		
		
		// to extract only Month part 
		
		System.out.println("Month Only " + newDate.getMonth());
		System.out.println("Month Only as int  " + newDate.getMonthValue());
		
		System.out.println(Clock.systemDefaultZone());
		
		System.out.println("----------------------------------------------");
		ZoneId.getAvailableZoneIds().forEach(System.out:: println);
		
		ZoneId chicagoZone = ZoneId.of("America/Chicago");
		LocalTime time1 = LocalTime.now(chicagoZone);
		System.out.println("Chicago Time "+ time1);
		
	}
}
