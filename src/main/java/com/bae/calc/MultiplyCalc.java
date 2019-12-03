package com.bae.calc;

public class MultiplyCalc extends Calculator {
	public String multiply(int num1, int num2) {
		int result = (num1*num2);
		return "The answer is "+ result;
	}	
}
