package com.nitish.test;

import java.time.Duration;
import java.time.LocalDateTime;

public class DateDifference {

	public static void main(String[] args) {
	
		LocalDateTime start = LocalDateTime.parse("2020-01-01T13:42:00");
		
		LocalDateTime end = LocalDateTime.parse("2021-01-01T13:42:00");
		
		LocalDateTime mid = LocalDateTime.parse("2019-01-01T13:42:00");
				
		 Duration duration = Duration.between(start, end);
         long daysDiff = Math.abs(duration.toDays());
         System.out.println("today : "+daysDiff);
         
         if(daysDiff == 365  || daysDiff == 366) {
        	 System.out.println("today : "+daysDiff);
         }
	}

}
