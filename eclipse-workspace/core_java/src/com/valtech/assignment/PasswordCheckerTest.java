package com.valtech.assignment;

import static org.junit.Assert.*;

import org.junit.Test;

public class PasswordCheckerTest {

	@Test
	public void testchecklower() {
		PasswordChecker pc = new PasswordChecker();
		assertEquals(true,pc.checklower("bbbbbPbbbbb"));
	}
	@Test
	public void testcheckupper() {
		PasswordChecker pc = new PasswordChecker();
		assertEquals(true,pc.checkupper("AAAAAAAAAAA"));
	}
	
	@Test
	
	public void checkdigit() {
		PasswordChecker pc = new PasswordChecker();
		assertEquals(false,pc.checkdigit("167539567"));
	}
	
	


}
