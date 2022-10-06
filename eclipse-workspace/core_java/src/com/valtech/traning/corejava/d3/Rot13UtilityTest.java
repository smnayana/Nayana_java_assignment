package com.valtech.traning.corejava.d3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Rot13UtilityTest {

	@Test
	public void test() {
		assertEquals('n',Rot13Utility.rotate('a'));
		assertEquals('a',Rot13Utility.rotate('n'));
		assertEquals('m',Rot13Utility.rotate('z'));
		assertEquals('z',Rot13Utility.rotate('m'));
	}

}
