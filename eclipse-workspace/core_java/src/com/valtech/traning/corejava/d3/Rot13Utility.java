package com.valtech.traning.corejava.d3;

public class Rot13Utility {

	public static char rotate(char c) {
		if(c>='a' && c<='m') {
            return (char)(c+13);
        }
        return (char)(c-13);
	}


}
