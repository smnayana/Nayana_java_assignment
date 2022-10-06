package com.valtech.traning.corejava.d5;


import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.junit.Test;

public class DateTest {
	
DateFormat df = new SimpleDateFormat("dd-MMM-yyyy HH:mm:ss");
	

@Test
	public void testDate() {
		Date date = new Date();
		System.out.println(date);
		/*
		 * HH - hour
		 * mm - Minute
		 * ss - second
		 * SS - MilliSecond
		 * YY/YYY - year
		 * MM/MMM - Month
		 * dd - Day
		 */
	
		System.out.println(df.format(date));
	}
	
	@Test
	public void testDateWithCal() {
		Calendar cal = Calendar.getInstance();
		cal.set(Calendar.YEAR, 1947);
		cal.set(Calendar.MONTH, 7);
		cal.set(Calendar.DATE, 15);
		Date date = cal.getTime();
		System.out.println(date);
		System.out.println(df.format(date));
	}

	@Test
	public void testDateFromString() throws Exception {
		DateFormat df = new SimpleDateFormat("dd-MM-yyyy");
		Date date = df.parse("15-08-1947");
		System.out.println(date);
		
	}
}
