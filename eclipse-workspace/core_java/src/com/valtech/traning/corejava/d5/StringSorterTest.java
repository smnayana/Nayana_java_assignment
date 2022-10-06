package com.valtech.traning.corejava.d5;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;

public class StringSorterTest {

	@Test
	public void testlength() {
		String[] str = new String [] {"Abc","pqr","lmno","ab","z","abz","Too"};
		System.out.println(Arrays.asList(str));
		Arrays.sort(str,new StringSorter());
		System.out.println(Arrays.asList(str));
		assertArrayEquals(new String [] {"z","ab","pqr","Abc","abz","Too","lmno"},str);
	}
	 @Test
	    public void testAlphabeticOrder() {
	        String[] names = { "Abc", "Pqr", "Lmno", "Too", "Ab", "z" };
	        Arrays.sort(names, new StringSorter());
	        assertArrayEquals(new String[] { "z", "Ab", "Pqr", "Abc", "Too", "Lmno" }, names);
	 }
	 
	 
	      @Test
	  public void testVowelCount() {
	     String [] s1 = {"Abc","Pqr","Lmno","Too","Ab","z"};
	    Arrays.sort(s1, new StringSorter());
	    assertArrayEquals(new String[] {"z","Ab","Pqr","Abc","Too","Lmno"}, s1);
	    
	  }

}
