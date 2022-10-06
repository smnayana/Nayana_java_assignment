package com.valtech.assignment;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class PasswordChecker {
	 int cnt = 0;
     public boolean checklower(String str) {
           int flag = 0;
           if (str.length() < 8)
               return false;
           for (char ch = 0; ch < str.length(); ch++) {
               if (Character.isLowerCase(ch)) {
                   if (flag == 0) {
                       cnt += 5;
                       flag = 1;
                       return true;
                   } else {
                       break;
                   }
               }
           }
           return true;
       }
     public boolean checkupper(String str) {
         int flag = 0;
         if (str.length() < 8)
             return false;
         for (char ch = 0; ch < str.length(); ch++) {
             if (!Character.isLowerCase(ch)) {
                 if (flag == 0) {
                     cnt += 5;
                     flag = 1;
                     return true;
                 } else {
                     break;
                 }
           }
       }
         return true;
     }
     public boolean checkdigit(String str) {
         int flag = 0;
       for (char ch = 0; ch < str.length(); ch++) {
             if (Character.isDigit(ch)) {
                 if (flag == 0) {
                     cnt += 5;
                     flag = 1;
                     return true;
                 } else {
                     cnt += 1;
                 }
             } else {
                 return false;
             }



      }
         return true;
     }
     public int checkspecial(String str) {
    	 int flag=0;        
         String specialChars = "!@#$%&*()'+,-./:;<=>?[]^_`{|}";
         for (int i = 0; i < str.length(); i++) {
             String strChar = Character.toString(str.charAt(i));
             // Check whether String contains special character or not
             if (specialChars.contains(strChar)) {
                 if(flag==0) {
                 cnt+=5;
                 flag=1;
             }
                 else {
                     cnt+=2;
                 }
             }
             }
         return cnt;
         }
    
}

	








	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	


//implements Comparator<String> {
//	int passwordLength=8, upChars=0, lowChars=0;
//    int special=0, digits=0;
//    char ch;
//    private int length(String s2) {
//		return s2.length();
//    }
//	@Override
//	public int compare(String o1, String o2) {
//		int  s1 = length(o1);
//		int s2 = length(o2);
//		if(s1 < s2)return -1;
//		if(s1 > s2) return 1;
//		return 0;
//	}
//	
//    
//	public void alphabet(String str) {
//		
//	}
//}