package com.nisum.saipravin.assignments.javanew;

import com.nisum.saipravin.assignments.logging.LoggerUtility;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Write a program to find all the numbers starting with one.
 * 
 * @author sai praveen
 *
 */
public class NumbersBeginningWithOne {

    /**
     * This is the main method used to find all numbers starting with one in a list.
     * 
     * @param args unused.
     */
    public static void main(String[] args) {

        List<Integer> integerList = new ArrayList<>();
        integerList.addAll(Arrays.asList(1, 2, 3, 14, 5, 6, 117, 8, 9, 10));

        // Printing the list
        LoggerUtility.logInfo("The List : " + integerList.toString());

        // Printing numbers starting with one from the list
        LoggerUtility.logInfo("The numbers starting with one in the list");
        integerList.stream().filter(i -> (i / (int) (Math.pow(10, (int) (Math.log10(i))))) == 1)
                .forEach(i -> LoggerUtility.logInfo(i.toString()));
    }

}
