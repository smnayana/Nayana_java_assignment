package com.valtech.training.corejava.d4;

import static org.junit.Assert.*;

import java.lang.reflect.Method;

import org.junit.Test;

import com.valtech.traning.corejava.d1.Point;

public class ReflectTest {

	@Test
	public void test() throws Exception,IllegalAccessException,NoSuchMethodException{
		Point p = Point.class.newInstance();
		System.out.println(p);
		Method m = Point.class.getMethod("setX", int.class);
		m.invoke(p, 10);
		System.out.println(p);
	}

}
