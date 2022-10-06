package com.valtech.training.corejava.d2;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class StringTestTest {

	@Test
	public void test() {
	String s= "hello World";
	String s1="hello World";
	assertTrue(s == s1);
	String s2= "hello"+ " " +"World";
	assertTrue(s == s2);
	String s3="World";
	String s4="hello "+s3;
	assertTrue(s.equals(s4));
	assertFalse(s == s4);
	
	
	}

}
