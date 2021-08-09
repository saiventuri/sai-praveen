package com.nisum.saipravin.assignments.exceptionhandling;

import com.nisum.saipravin.assignments.logging.LoggerUtility;

/**
 * Problem Statement : Write a program to define your own custom exception and
 * throw it.
 * 
 * @author sai praveen
 * 
 */

public class OwnCustomExceptionClass {

    /**
     * This is the main method used to throw custom exception.
     * 
     * @param args unused.
     */
    public static void main(String[] args) {

        try {
            LoggerUtility.logInfo("Throwing custom excpetion");

            throw new CustomException("Custom Exception thrown from the main method");
        } catch (CustomException customException) {

            LoggerUtility.logInfo(customException.toString());
        } finally {

            LoggerUtility.logInfo("End of Main");
        }
    }

}
