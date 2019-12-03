package com.bae.divideTest;


import org.junit.Assert;
import org.junit.Test;

import com.bae.app.DivideCalculator;

public class DivideTest {

	@Test
	public void DivideByZeroTest() {
		DivideCalculator calc = new DivideCalculator();
		String divideResult0 = calc.divide(2,0);
		String divideResult1 = calc.divide(2,3);
		String divideResult2 = calc.divide(100,3);

		Assert.assertEquals("Cannot divide by 0", divideResult0);
		Assert.assertEquals("2 / 3 = 0.6667", divideResult1);
		Assert.assertEquals("100 / 3 =  33.3333", divideResult2);

		
		
	}

}
