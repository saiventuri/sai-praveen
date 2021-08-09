package com.nisum.saipravin.assignments.javanew;

import com.nisum.saipravin.assignments.logging.LoggerUtility;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Write a program to find duplicate elements in a given integers list.
 * 
 * @author sai praveen
 *
 */
public class DuplicatesInList {

    /**
     * This is the main method used to find duplicates in the integer list.
     * 
     * @param args unused.
     */
    public static void main(String[] args) {

        List<Integer> integerList = new ArrayList<>();
        Set<Integer> uniqueIntegerSet = new HashSet<>();

        integerList.addAll(Arrays.asList(1, 12, 3, 4, 12, 6, 7, 3, 9, 10));

        // Printing the list
        LoggerUtility.logInfo("The List : " + integerList.toString());

        // Printing duplicates in the list.
        LoggerUtility.logInfo("The duplicate numbers in the list");
        integerList.stream().filter(i -> !uniqueIntegerSet.add(i)).forEach(i -> LoggerUtility.logInfo(i.toString()));

    }

}
