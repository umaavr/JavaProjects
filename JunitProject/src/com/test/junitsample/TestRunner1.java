package com.test.junitsample;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.RunWith;
import org.junit.runner.notification.Failure;

import junit.framework.TestResult;
import junit.framework.TestSuite;


public class TestRunner1 {
	public static void main(String args[]) {
		
		
	Result result = JUnitCore.runClasses(SampleTest.class);
	for(Failure failure: result.getFailures()) {
		System.out.println(failure.toString());
	}
	System.out.println(result.wasSuccessful());
	//System.out.println(result.runCount());
	
		

	}
}
