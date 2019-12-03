package com.bae.calc;

public class SubtractCalc extends Calculator {
	public String subtract(int number1, int number2) {
		int number = number1 - number2;
		String result ="The result is " +number;
		System.out.println(result);
		return result;
	}
}
