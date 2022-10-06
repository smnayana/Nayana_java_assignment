package com.valtech.traning.corejava.d3;

import static org.junit.jupiter.api.Assertions.*;

import java.io.Reader;
import java.io.StringReader;
import java.io.StringWriter;
import java.io.Writer;

import org.junit.jupiter.api.Test;

class Rot13WriterTest {

	@Test
	 public void test() throws Exception {
		Writer strWriter = new Rot13Writer(new StringWriter());
		String msg = "helloworld";
		strWriter.write(msg);
		String res = strWriter.toString();
		System.out.println("after Rotation "+res);
		strWriter.close();
		Reader reader = new Rot13Reader(new StringReader(res));
		char [] buffer = new char [1024];
		int i = reader.read(buffer);
		System.out.println("Read"+i+" bytes");
		System.out.println("after Rotating again....."+new String(buffer,0,i));
		
		assertEquals(msg,new String(buffer,0,i));
		reader.close();
		
	}

}
