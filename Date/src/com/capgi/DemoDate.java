package com.capgi;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DemoDate {

	public static void main(String[] args) {
		Date date1 =new Date();
		
		SimpleDateFormat formatter =new SimpleDateFormat("dd/mm/yy");
		String newDate=formatter.format(date1);
		Date date2 =new Date("2020/12/09");
		
		

		System.out.println(date2);
		
	}

}
