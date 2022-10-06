package com.valtech.traning.corejava.d1;

import static org.junit.jupiter.api.Assertions.*;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

import com.valtech.traning.corejava.d1.Point3D;
import org.junit.jupiter.api.Test;

class Point3DSetTest {

	
	
	@Test
	 public void testEquals() {
		 Point3D p= new Point3D(2,3,2);
		 Point3D p1= new Point3D(2,3,2);
		 Point3D p3=new Point3D(3,2,3);
		 Point3D p4=p;
		 Point3D p5=p1;
		 assertTrue(p == p4);
		 assertTrue(p1 == p5);
		 assertFalse(p == p1);
		 assertTrue(p.equals(p1));
		 assertEquals(p.hashCode(),p1.hashCode());
		 
		
	}
	
	
	 @Test
	 public void testSetGet() {
		  Point3D p =new Point3D();
		  p.setX(10);
		  assertEquals(10,p.getX());
		  p.setY(20);
		  assertEquals(20,p.getY());
		  p.setZ(30);
		  assertEquals(30,p.getZ());
	 }
	 
	 @Test
	 public void testDistance() {
		 Point3D p = new Point3D();
		 assertEquals(0.0,p.distance(),0.00000001);
		 p=new Point3D(10,20,30);
		 assertEquals(Math.sqrt(10*10+20*20+30*30),p.distance(),0.00000001);
	 }
	 

		@Test
		 public void testPointCtor() {
			Point3D p = new Point3D();
			assertEquals(0,p.getX());
			assertEquals(0,p.getY());
			assertEquals(0, p.getZ());
			
			Point3D p1 = new Point3D(2,3,4);
			assertEquals(2,p1.getX());
			assertEquals(3,p1.getY());
			assertEquals(4,p1.getZ());
		}
	
	@Test
	public void testTreeSet() {
		Set<Point3D> points= new TreeSet<>();
		points.add(new Point3D(2,3,2));
		assertEquals(1,points.size());
		points.add(new Point3D(2,3,2));
		assertEquals(1,points.size());
		points.add(new Point3D(3,3,2));
		assertEquals(2,points.size());
		
	}
	
	@Test
	public void testSetOfPoints() {
		Set<Point3D> points =new HashSet<>();
		points.add(new Point3D(2,3,2));
		assertEquals(1,points.size());
		points.add(new Point3D(2,3,2));
		assertEquals(1,points.size());
		points.add(new Point3D(3,3,3));
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
