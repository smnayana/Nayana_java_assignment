package com.valtech.traning.corejava.d3;

public class GcTest {
	public static void main(String[] args) {
		 int n = Integer.parseInt(args[0]);
	        long x= System.nanoTime();
	        for (int i = 0; i <n; i++) {
	            String s=" "+i+" "+i+" "+i;
	            
	        }
	        long y = System.nanoTime();
	        long time=(y-x)/1000000000;
	        System.out.println("tim taken for execution ="+time+"secs");
	}

}
