package com.test.junitsample;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import com.src.junitsample.Demo1Src;

public class Demo1 {
	Demo1Src src;

	@Before
	public void setUp() {
		src = new Demo1Src();
		
	}
	
	@Test
	public void testMethod() {
		assertFalse(src.methodon());
		src.on();
		assertTrue(src.methodon());
		src.on();
		assertFalse(src.methodon());
	}
}
