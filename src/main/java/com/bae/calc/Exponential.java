package com.bae.calc;

public class Exponential extends Calculator{
    public static void exponential(String x_to_the_a) {
    }

    public static String exponential(int number1, int number2) {
        long answer = (long) Math.pow(number1, number2);
        return "The answer is: " + answer;
    }
}
