package com.capgi;

import org.junit.Test;

import junit.framework.TestCase;

public class AddTest extends TestCase {
	Add a = new Add();
	
@Test
	public void testCal() {
		assertEquals(10,a.cal(5, 5));
	}

}
