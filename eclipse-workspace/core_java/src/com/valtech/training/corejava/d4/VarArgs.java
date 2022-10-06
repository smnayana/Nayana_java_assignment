package com.valtech.training.corejava.d4;

public class VarArgs {
	
	public int add(int ... a) {
		int res = 0;
		for (int i : a) {
			res+=i;//res = res +i;
		}
		return res;
	}
}


