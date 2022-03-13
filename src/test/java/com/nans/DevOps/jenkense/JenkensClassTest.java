package com.nans.DevOps.jenkense;

import static org.junit.Assert.*;

import org.junit.Test;

public class JenkensClassTest {

	@Test
	public void addTest() {
		Jenkenscalculator calc = new Jenkenscalculator();
		assertEquals(10, calc.addNum(5, 5));
		
	}
	
}
