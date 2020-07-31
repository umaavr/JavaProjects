package com.test.junitsample;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.src.junitsample.Calculation;

public class CalculationTest {
	@Test
	public void testFindMax() {
		
		assertEquals(8,Calculation.findMax(new int[] {3,4,5,6,7,8}));
		assertEquals(-4,Calculation.findMax(new int[] {3,-4,-5,6,-7,8}));
	}

}
