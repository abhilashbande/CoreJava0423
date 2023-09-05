package com.DateAndTime;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class App {

	public static void main(String[] args) {
//		LocalDate today = LocalDate.now();
//		LocalDate nextDate = today.plusDays(15);
//		System.out.println(nextDate);
		
		LocalDate independanceDay = LocalDate.of(1947, 8, 15);
		//System.out.println(independanceDay);
		
		LocalDate today = LocalDate.now();
		Period yearsOfInd = Period.between(independanceDay, today);
//		System.out.println(yearsOfInd);
//		System.out.print(yearsOfInd.getYears()+ " years ");		
//		System.out.print(yearsOfInd.getMonths()+ " months ");
//		System.out.print(yearsOfInd.getDays() + " days ");	
		
		LocalTime currentTime = LocalTime.now();
		//System.out.println(currentTime);
		
		LocalTime time = LocalTime.of(19, 00, 00);
		//System.out.println(time);
		
		Duration d = Duration.between(currentTime, time);
		//System.out.println(d);
		
		LocalDateTime current = LocalDateTime.now();
		System.out.println(current);
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MMM-yyyy hh:mm:ss");
		System.out.println(current.format(formatter));
	}

}
