package com.nisum.saipravin.assignments.javanew;

import com.nisum.saipravin.assignments.logging.LoggerUtility;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Problem Statement : Write a program to find all the even numbers exist in the
 * list.
 * 
 * @author sai praveen
 *
 */
public class EvenNumberInList {

    /**
     * This is the main method used to find even numbers in a list using streams.
     * 
     * @param args unused.
     */
    public static void main(String[] args) {

        List<Integer> integerList = new ArrayList<>();
        integerList.addAll(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));

        // Printing the list
        LoggerUtility.logInfo("The List : " + integerList.toString());

        LoggerUtility.logInfo("The even numbers in the list");

        // Printing even numbers from the list
        LoggerUtility.logInfo("The even numbers in the list");
        integerList.stream().filter(i -> i % 2 == 0) // Filtering the even numbers
                .forEach(i -> LoggerUtility.logInfo(i.toString())); // Printing the even numbers
    }

}
