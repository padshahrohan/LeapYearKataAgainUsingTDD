package com.sample.LeapYearKataAgainUsingTDD;

import static org.junit.Assert.*;

import org.junit.Test;

public class LeapYearTest {

	@Test
	public void IsLeapYearIfDivisibleBy400()
	{
		Year year = new Year(2000);
		boolean actual = year.isLeapYear();
		
		assertEquals(true, actual);
		
	}

}
