package com.valtech.traning.corejava.d5;

import java.util.Comparator;

public class NumberSorter implements Comparator<Integer>{
	
	private boolean isOdd(int a) {
		return Math.abs( a) % 2 == 1;
		
	}
	
	@Override
	public int compare(Integer i1, Integer i2) {
		// check both the number odd
		//put in ascending order
		boolean b1 = isOdd(i1);
		boolean b2 = isOdd(i2);
		if(b1 && b2) {
			if(i1 <i2) return -1;
			if(i1 == i2) return 0;
			return i1 - i2;
		}
		// check both are even
		//put in decending order
		if(!b1 && !b2) {
			return i2 - i1;
		}
		//otherwise one is odd and other is even
		// if first value is odd and smaller return -1
		// second value is odd and smaller return -1
		if(b1) {
			return -1;
		}
		return +1;
	}

}
