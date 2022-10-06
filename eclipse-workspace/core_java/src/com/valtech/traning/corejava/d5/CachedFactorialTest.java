package com.valtech.traning.corejava.d5;

import static org.junit.Assert.*;

import org.junit.Test;

public class CachedFactorialTest {

	@Test
	public void test() {
		CachedFactorial cf = new CachedFactorial();
		assertEquals(120, cf.factorial(5));
		assertEquals(5040, cf.factorial(7));
		assertEquals(5040, cf.factorial(7));
		assertEquals(120, cf.factorial(5));
		assertEquals(1, cf.factorial(1));
	}

}
