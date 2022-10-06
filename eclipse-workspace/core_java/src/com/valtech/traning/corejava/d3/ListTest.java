package com.valtech.traning.corejava.d3;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Stack;

import org.junit.Test;

public class ListTest {
	
	@Test
	public  void testStackAndQueue() {
		Stack<String> animals = new Stack<>();
	    //Queue<String> animals = new LinkedList<>();
		animals.push("Dog");
		animals.push("cat");
		animals.push("cow");
		assertEquals(3, animals.size());
		System.out.println(animals.pop());
		System.out.println(animals.pop());
		assertEquals(1, animals.size());
	}

	@Test
	public void test() {
	List<String> names =new ArrayList<>();
	names.add("hello1");
	names.add("hello2");
	names.add("hello3");
	names.add(0,"hello4");
	names.add("hii");
	assertEquals(5,names.size());
	for (Iterator iterator = names.iterator(); iterator.hasNext();) {
		String string = (String) iterator.next();
		System.out.println(string);
	}
	}

}
