package CalculatorTest;

import org.junit.Assert;
import org.junit.Test;

import com.bae.calc.addCalculator;


public class CalculatorTest {
	

	@Test
	public void addCalculatorTest() {
	addCalculator calc = new addCalculator();	
	String addResult1 = calc.add(15, 12);
	String addResult2 = calc.add(-24, -12);
	String addResult3 = calc.add(-12, 1231);
	String addResult4 = calc.add(0,  0);
	
	
	
	Assert.assertEquals("The result is 27", addResult1);
	Assert.assertEquals("The result is -36", addResult2);
	Assert.assertEquals("The result is 1219", addResult3);
	Assert.assertEquals("The result is 0", addResult4);
	

	
	}
	
	
	
	

}
