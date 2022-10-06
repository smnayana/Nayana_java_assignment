package com.valtech.training.corejava.d2;

import static org.junit.jupiter.api.Assertions.*;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

import org.junit.jupiter.api.Test;

import com.valtech.traning.corejava.d1.Point;

class PointSetTest {
	
	
	@Test
	public void testTreeSet() {
		Set<Point> points= new TreeSet<>();
		points.add(new Point(2,3));
		assertEquals(1,points.size());
		points.add(new Point(2,3));
		assertEquals(1,points.size());
		points.add(new Point(3,3));
		assertEquals(2,points.size());
		
	}
	
	
	
	
	
	
	@Test
	public void testSetOfPoints() {
		Set<Point> points =new HashSet<>();
		points.add(new Point(2,3));
		assertEquals(1,points.size());
		points.add(new Point(2,3));
		assertEquals(1,points.size());
		points.add(new Point(3,3));
		assertEquals(2,points.size());
		
	}
	
	
	@Test
	public void testSetOfStringsWithGeneric() {
		Set<String> myWords =new HashSet<>();
		myWords.add("hello");
		myWords.add("how");
		myWords.add("you");
		myWords.add("are");
		myWords.add("you");
		for (Iterator iterator= myWords.iterator(); iterator.hasNext();) {
			String string =(String) iterator.next();
			System.out.println(string);
	}
}
	@Test
	public void tesSetOfStrings() {
		Set setOfStrings = new HashSet();
		setOfStrings.add("hello");
		assertEquals(1,setOfStrings.size());
		setOfStrings.add("hello");
		assertEquals(1,setOfStrings.size());
		setOfStrings.add("HEllo");
		assertEquals(2,setOfStrings.size());
		for (Iterator iterator= setOfStrings.iterator(); iterator.hasNext();) {
			Object object =(Object) iterator.next();
			String s=(String)object;
			System.out.println(s);
			
		}
	}

}
