package com.valtech.traning.corejava.d5;

import java.util.Comparator;

public class StringSorter implements Comparator<String> {


	private int length(String s2) {
		return s2.length();
	}

	@Override
	public int compare(String o1, String o2) {
		int  s1 = length(o1);
		int s2 = length(o2);
		if(s1 < s2)return -1;
		if(s1 > s2) return 1;
		s1 =VowelLength(o1);
		s2 = VowelLength(o2);
		if(s1 < s2)return -1;
		if(s1 > s2) return 1;
		return o1.compareTo(o2);
	}
	
public int VowelLength(String s3 ) {
	int count=0;
	String vowels = "aAeEiIoOuU";
	for(int i = 0; i<s3.length(); i++) {
		char s4 = s3.charAt(i);
		if(vowels.contains(""+s4)) {
			count++;
		}
	}
	        return count;
}
}