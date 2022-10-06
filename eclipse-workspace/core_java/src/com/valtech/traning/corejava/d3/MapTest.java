package com.valtech.traning.corejava.d3;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import org.junit.jupiter.api.Test;

import com.valtech.traning.corejava.d1.Point;

class MapTest {

	@Test
	 public void testHashMap() {
		Map<String,Point> points = new HashMap<>(); 
		points.put("1,1",new Point(1,1));
		points.put("1,2",new Point(1,1));
		points.put("2,2",new Point(2,2));
		points.put("1,2",new Point(1,1));
		assertEquals(3, points.size());
		Set<String> keys =points.keySet();
		for (Iterator iterator = keys.iterator(); iterator.hasNext();) {
			String key = (String) iterator.next();
			System.out.println("key "+key+"value "+points.get(key));
		}
	}

}
