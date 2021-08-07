package com.nisum.saipravin.assignments.oops;

import com.nisum.saipravin.assignments.logging.LoggerUtility;

/**
 * Problem Statement: Write a program to demonstrate method overloading.

 * @author sai praveen
 *
 */
public class MethodOverload {

    /**
     * This is the main method used
     * to show method overloading.
     * 
     * @param args unused.
     */
    public static void main(String[] args) {

        // Demonstrating method overloading
        LoggerUtility.logInfo("Sum of two numbers 2 and 3 is " + add(2, 3));
        LoggerUtility.logInfo("Sum of three numbers 2, 3 and 5 is " + add(2, 3, 5));
    }

    /**
     * Adds two numbers.
     *
     * @param number1 first number for addition
     * @param number2 second number for addition
     * @return sum of two numbers
     */
    public static int add(int number1, int number2) {
        return number1 + number2;
    }

    /**
     * Adds three numbers.

     * @param number1 first number for addition
     * @param number2 second number for addition
     * @param number3 sum of two numbers
     * @return sum of three numbers
     */
    public static int add(int number1, int number2, int number3) {
        return number1 + number2 + number3;
    }

}
