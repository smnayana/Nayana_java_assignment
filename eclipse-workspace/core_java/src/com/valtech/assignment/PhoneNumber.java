package com.valtech.assignment;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


public class PhoneNumber {

		 public static int checkPhoneNumber(int size,List<Long> numList) {
		      
		      int number=countDistinctDigits( size, numList);
		      return number;
		  }

		  public static int countDistinctDigits(int size,List<Long> numList) {
		      Set<Long> numbers = new HashSet<Long>();
		      long a=0;
		      int j=0;
		      	for(int i=0;i<size;i++) {
		      		long count=0,e=0;
		      		Long k=numList.get(i);
		      		while(k > 0) {	
				         if(numbers.add(k % 10)) { 
				        	 e=k%10;
				        	 count=+1;
				         }
				         else {
				        	 long n=k%10;
				        	 if(e==n) {
				        		 count=+2;
				        	 }
				        	 else if(e==(n+1)) {
				        		 count=+2;
				        	 }
				        	 else if(e==(n-1)) {
				        		 count=+2;
				        	 }
				        	 
				         }
				         k /= 10;
				         }
		      		if(a<count) {
		      			a=count;
		      			j=i;
		      		}
		      		
		      	}
		      	return j;
		  }
	}

