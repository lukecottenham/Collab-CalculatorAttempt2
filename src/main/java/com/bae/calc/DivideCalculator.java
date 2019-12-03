package com.bae.calc;

public class DivideCalculator {

	public String divide(int number, int divisor) {
		String result = null;
		double answer = 0; 
		if (divisor == 0) {
			result = "Cannot divide by 0";
		}
		else {
			answer = number / divisor;
			System.out.println(answer %.3f);
			result = number + " / " + divisor + " = " + answer;
		}
		
		return result;
	}
	
}
