package com.capgi;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class DateTimeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDate date = LocalDate.now();// now-> gives today's date

		/*System.out.println(date);
		System.out.println(date.getMonthValue());
		System.out.println(date.getMonth());*/
		LocalDate d2 = LocalDate.of(2020,Month.DECEMBER, 9);// of->to create our own date
		System.out.println(d2);
		// int res= date.getYear()-d2.getYear();
		//int res = date.getDayOfYear() - d2.getDayOfYear();

		LocalDate lastdate = date.plusYears(4);
		Period p=date.until(d2);
		System.out.println(p);
		System.out.println(p.get(ChronoUnit.DAYS));
		

		System.out.println(lastdate);
		// is(); ->to check leap year or not
		System.out.println(date.isLeapYear());
		System.out.println(date.withDayOfMonth(29));
		System.out.println();

	}

}
