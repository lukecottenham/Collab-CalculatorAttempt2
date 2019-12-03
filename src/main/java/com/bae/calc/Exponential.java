package com.bae.calc;

public class Exponential extends Calculator {

    public static String exponential(int number1, int number2) {
        double  answer = Math.pow(number1, number2);
        return "The answer is: " + answer;
    }
}
