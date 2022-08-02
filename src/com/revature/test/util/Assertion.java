package com.revature.test.util;

public class Assertion {
	public static void Equals(int expected, int actual)
    {
        Evaluate(expected == actual, "Equals Failed");
        
    }
	
	public static void NotEquals(int expected, int actual) {
		Evaluate(expected != actual, "Not Equals Failed");
        
	}
	
	private static void Evaluate(boolean condition, String message) {
		if(!condition) {
			
			throw new AssertionError(message);
		}
	}
}
