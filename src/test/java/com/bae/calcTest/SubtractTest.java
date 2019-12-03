package com.bae.calcTest;

import org.junit.Assert;
import org.junit.Test;

import com.bae.calc.SubtractCalc;



public class SubtractTest {

	@Test

public void subtractCalculatorTest() {
	SubtractCalc calc = new SubtractCalc();	
	String subtractResult1 = calc.subtract(22, 12);
	String subtractResult2 = calc.subtract(3, 4);
	String subtractResult3 = calc.subtract(200, 189);
	
	
	Assert.assertEquals("The result is 10", subtractResult1);
	Assert.assertEquals("The result is -1", subtractResult2);
	Assert.assertEquals("The result is 11", subtractResult3);
	
	
	}
}
	
	
	