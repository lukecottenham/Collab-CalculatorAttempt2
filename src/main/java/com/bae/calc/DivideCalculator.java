package com.bae.calc;

import java.math.RoundingMode;
import java.text.DecimalFormat;

public class DivideCalculator {

	public String divide(double number, double divisor) {
		String result = null;
		double answer = 0; 
		if (divisor == 0) {
			result = "Cannot divide by 0";
		}
		else {
			answer = number / divisor;
			DecimalFormat doubleTo3DP = new DecimalFormat("#.####");
			doubleTo3DP.setRoundingMode(RoundingMode.CEILING);
			result = doubleTo3DP.format(number) + " / " + doubleTo3DP.format(divisor) + " = " + doubleTo3DP.format(answer);
		}
		
		return result;
	}
	
}
