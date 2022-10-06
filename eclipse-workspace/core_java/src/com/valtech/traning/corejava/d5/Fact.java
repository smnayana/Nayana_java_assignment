package com.valtech.traning.corejava.d5;

public class Fact {
	 public static long factorial(long n) {                
        if (n == 1)
              return 1;               
              return n*factorial(n-1);
    }
    public static void main(String[] args)
     {
      int num = 10;
      System.out.println("Factorial of "+ num + " is " + factorial(10));
     }
    
}

