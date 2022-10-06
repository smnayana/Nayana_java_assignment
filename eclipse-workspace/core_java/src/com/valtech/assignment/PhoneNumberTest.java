package com.valtech.assignment;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.BeforeClass;
import org.junit.Test;


public class PhoneNumberTest {

	PhoneNumber phoneNumber= new PhoneNumber();
	List<Long> numList = new ArrayList<>();
	
	@Test
	public void test() {
		
		
		numList.add(1717171717L);
		numList.add(7892208513L);
		int size=numList.size();
		
		
		assertEquals(0,PhoneNumber.checkPhoneNumber(size, numList));
		
		
		
		
		
		numList.add(8480991564L);
		numList.add(7854325252L);
		numList.add(9632194875L);
		size=numList.size();
		
		
		assertEquals(0,PhoneNumber.checkPhoneNumber(size, numList));
		
		
		numList.add(9999999999L);
		numList.add(1234567890L);
		size=numList.size();
		
		
		assertEquals(0,PhoneNumber.checkPhoneNumber(size, numList));
		
	
		numList.add(1212363636L);
		numList.add(8217576371L);
		size=numList.size();
		assertEquals(0,PhoneNumber.checkPhoneNumber(size, numList));
		
		
		
		
		
		
	}
	
	
	

}
