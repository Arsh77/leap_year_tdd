package main.java;

public class LeapYear {
	/*
	    * Acceptance Criteria:
	    * 1. All years divisible by 400 ARE leap years (so, for example, 2000 was indeed a leap year),
	    * 2. All years divisible by 100 but not by 400 are NOT leap years (so, for example, 1700, 1800, 
	    * 	 and 1900 were NOT leap years, NOR will 2100 be a leap year),
	    * 3. All years divisible by 4 but not by 100 ARE leap years (e.g., 2008, 2012, 2016),
	    * 4. All years not divisible by 4 are NOT leap years (e.g. 2017, 2018, 2019).
	    */
	
	public boolean isLeapYear(int year){
		if((isDivisibleByFour(year) && !isDivisibleByHundred(year)) || isDivisibleByFourHundred(year)) {
			return true;
		}
		return false;
	}
	
	private boolean isDivisibleByFour(int year){
		return year%4==0;
	}
	private boolean isDivisibleByHundred(int year){
		return year%100==0;
	}
	private boolean isDivisibleByFourHundred(int year){
		return year%400==0;
	}
}
