package com.assignments.BigDecimalDemo;

import static org.junit.Assert.*;

import org.junit.Test;

public class BigDecimalDemoTest {
	
	BigDecimalDemo bigDecimalDemo = new BigDecimalDemo();
	
//	 "12345.12345467" => "12345.12345"
//	 "12345.123456" => "12345.12346"
	@Test
	public void testOne() {
		String num = "12345.12345467";
		String expected = "12345.12345";
		String actual = bigDecimalDemo.roundOf(num);
		assertEquals(expected, actual);
	}
	
	@Test
	public void testTwo() {
		String num = "12345.123456";
		String expected = "12345.12346";
		String actual = bigDecimalDemo.roundOf(num);
		assertEquals(expected, actual);
	}
	
	@Test
	public void testThree() {
		String num = "564562131449451.15432654892431546";
		String expected = "564562131449451.15433";
		String actual = bigDecimalDemo.roundOf(num);
		assertEquals(expected, actual);
	}
	
	@Test
	public void testFour() {
		String num = "5645621.31449451563214236985";
		String expected = "5645621.31449";
		String actual = bigDecimalDemo.roundOf(num);
		assertEquals(expected, actual);
	}

}
