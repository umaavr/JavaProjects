package com.src.junitsample;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class JunitSample {
	String message = "Hello World";	
	   

	   @Test
	   public void testPrintMessage() {	  
	      assertEquals(message,"Hello World");
	   }

}
