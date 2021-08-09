package com.nisum.saipravin.assignments.javanew;

import com.nisum.saipravin.assignments.logging.LoggerUtility;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Write a program to Summing Numbers in a given integers list.
 * 
 * @author sai praveen
 *
 */
public class ListSum {

    /**
     * This is the main method used to find the sum of given numbers in a list.
     *
     * @param args unused.
     */
    public static void main(String[] args) {

        List<Integer> integerList = new ArrayList<>();
        integerList.addAll(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));

        // Printing the list
        LoggerUtility.logInfo("The List : " + integerList.toString());

        // Finding the sum of numbers in the list
        Integer sum = integerList.stream().mapToInt(Integer::intValue).sum();

        // Printing the sum
        LoggerUtility.logInfo("The sum of numbers in the list : " + sum.toString());

    }

}
