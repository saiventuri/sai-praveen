package com.nisum.saipravin.assignments.exceptionhandling;

import com.nisum.saipravin.assignments.logging.LoggerUtility;

/**
 * Problem Statement: Write a program to define multiple catch blocks for
 * exception handling.
 * 
 * @author sai praveen
 * 
 */

public class MultipleExceptions {

    /**
     * This is the main method used to handle multiple exceptions.
     * 
     * @param args unused.
     */
    public static void main(String[] args) {

        try {

            // Causing Arithmetic Exception
            int n = args.length;
            @SuppressWarnings("unused")
            int a = 100 / n;

            // Causing ArrayIndexOutOfBounds Exception
            int[] b = { 10, 20, 30 };
            b[5] = 50;

        } catch (ArithmeticException arithmeticException) {

            LoggerUtility.logInfo(arithmeticException.toString());
        } catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {

            LoggerUtility.logInfo(arrayIndexOutOfBoundsException.toString());
        } finally {

            LoggerUtility.logInfo("End Of Main");
        }
    }

}
