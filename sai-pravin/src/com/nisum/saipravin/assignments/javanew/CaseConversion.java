package com.nisum.saipravin.assignments.javanew;

import com.nisum.saipravin.assignments.logging.LoggerUtility;

/**
 * Write a program to define functional interface which will convert input
 * string to lower case.
 * 
 * @author sai praveen
 *
 */
public class CaseConversion {

    /**
     * This is the main method used to change the case of string.
     * 
     * @param args unused.
     */
    public static void main(String[] args) {

        String inputString = "Hello World";
        LoggerUtility.logInfo("The input string is " + inputString);

        LowerCaseConverter lowerCaseConverter = String::toLowerCase;

        LoggerUtility.logInfo("The input string in lower case is " + lowerCaseConverter.toLowerCase(inputString));

    }

}
