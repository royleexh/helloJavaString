package com.test;

import junit.framework.TestCase;

public class SampleStringTest extends TestCase{
	
	private String str1;
	private String str2;
	
	protected void setUp() {
		str1 = "Hello";
		str2 = "java";
	}
	
	protected void tearDown(){
		
	}
	
	public void testConCat(){
         assertEquals( "Hellojava", str1.concat(str2));
	}
	
	public void testToUpperCase(){
		assertEquals("HELLO" ,str1.toUpperCase());
	}
}
