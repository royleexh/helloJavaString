package com.test;

import junit.framework.TestCase;

public class SampleStringTest extends TestCase{
	
	private int a;
	private int b;
	private int r1,r2;
	
	protected void setUp() {
		a = 50;
		b = 20;
		r1 = 70;
		r2 = 30;
	}
	
	protected void tearDown(){
		
	}
	
	public void testAdd(){
		assertEquals(r1 , a+b);/*¼ì²â²âÊÔ½á¹û*/
	}
	
	public void testSubtration(){
		assertEquals(r2 , a-b);/*¼ì²â²âÊÔ½á¹û*/
	}
}
