package test.java;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import main.java.LeapYear;


public class TestLeapYear {
	
	private LeapYear leapyear;
	
	@Before
	public void initialization(){
		leapyear =new LeapYear();
	}
	
	/**
	 * Rule : All years not divisible by 4 are NOT leap years.
	 * 
	 * Test case where year is not divisible by 4.
	 */
	@Test
	public void testForNonDivisibileByFour(){
		assertFalse(leapyear.isLeapYear(1997));
	}	   
	
	/**
	 * Rule : All years divisible by 4 but not by 100 ARE leap years.
	 * 
	 * Test case where the year given is divisible by 4 and 100.
	 */
	@Test
	public void testForDivisibilityOfFourAndHundred(){
		assertFalse(leapyear.isLeapYear(1900));
	}
	
	/**
	 * Rule : All years divisible by 100 but not by 400 are NOT leap years.
	 * 
	 * Test case where the year provided is divisible by 100 but not 400.
	 */
	@Test
	public void testForDivisibilityOfHundredAndFourHundred(){
		assertFalse(leapyear.isLeapYear(1800));
		
	}
	
	/**
	 * Positive Test Case
	 * Rule : All years divisible by 4 but not by 100 ARE leap years
	 * 
	 * Test case where the year provided is divisible by 400
	 */
	@Test
	public void positiveTestDivisibleByFourButNotHundred(){
		assertTrue(leapyear.isLeapYear(1996));
	}
	
	/**
	 * Positive Test Case
	 * Rule : All years divisible by 400 ARE leap years
	 * 
	 * Test case where the year provided is divisible by 4 but not 100
	 */
	@Test
	public void positiveTestDivisibleByFourHundred(){
		assertTrue(leapyear.isLeapYear(2000));
	}
}
