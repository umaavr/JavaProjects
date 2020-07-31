package com.src.junitsample;

import com.test.junitsample.Demo1;
import com.test.junitsample.PrimeNumberCheckerTest;

import junit.framework.TestResult;
import junit.framework.TestSuite;

public class TestRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TestSuite suite = new TestSuite(Demo1.class,PrimeNumberCheckerTest.class);
		TestResult result = new TestResult();
		suite.run(result);
		System.out.println("No. of testcases: "+result.runCount());
//		Result result = JUnitCore.runClasses(MessageUtil.class);
//		for(Failure failure:result.getFailures())
//			System.out.println(failure.toString());
//		System.out.println(result.wasSuccessful());
//
//	}
	}
}


