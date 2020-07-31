package com.test.junitsample;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import com.src.junitsample.Sample2;

public class SampleTest {
	Sample2 sample;
	int arr[]={1,2,3,5,7,8,5,9};
	int cubelength = 2;
	String str = "my name is khan";
@Before
public void setup() {
	 sample = new Sample2();
	 
	
	
}

@Test
public void testAllMethods() {
	assertEquals(9,sample.findMax(arr));
	
	assertTrue(8==sample.cube(cubelength));
	assertNotSame("ym eman si nahk",sample.reverseWord(str));
}

}
