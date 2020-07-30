package com.src.junitsample;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class JunitBoolean {
	@Test
	public void compareMessage() {
		int val=5;
		int val1=6;
		
		assertTrue(val<val1);
		
	}

	

}
