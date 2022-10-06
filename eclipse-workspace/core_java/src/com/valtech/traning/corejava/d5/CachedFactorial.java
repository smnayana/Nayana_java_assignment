package com.valtech.traning.corejava.d5;

import java.util.ArrayList;
import java.util.List;

public class CachedFactorial {
	
	List<Long> factorials1= new ArrayList<>();
	
	public long factorial(int num) {
		//check the size of the list
		//size is >n then return the element
	//System.out.println(factorials1.size());	
	
	if(factorials1.size()>= num) {
		System.out.println("returning from the cache..");
		return factorials1.get(num-1);
	}
	//size is less
	//compute the factorial from size to n
	if(num==1) {
		factorials1.add(1L);
		return num;
	}
	long fact = factorial(num-1);
	long factn = num * fact;
	factorials1.add(factn);
	return factn;
	}
}