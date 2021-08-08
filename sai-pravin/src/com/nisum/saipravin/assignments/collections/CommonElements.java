package com.nisum.saipravin.assignments.collections;

import com.nisum.saipravin.assignments.logging.LoggerUtility;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Problem Statement: Write a program to find common elements.
 * 
 * @author sai praveen
 *
 */
public class CommonElements {

    /**
     * This is the main method used for finding common elements in two collections.
     * 
     * @param args unused.
     */
    public static void main(String[] args) {

        // Creating two collections (Set and List)
        Set<Integer> integerSet = new HashSet<>();
        List<Integer> integerList = new ArrayList<>();

        // Adding elements to list and set
        integerSet.addAll(Arrays.asList(1, 2, 3, 4, 5));
        integerList.addAll(Arrays.asList(4, 6, 8, 4, 10, 5, 8, 7));

        // Printing the set
        LoggerUtility.logInfo("The Set");
        LoggerUtility.logInfo(integerSet.toString());

        // Printing the list
        LoggerUtility.logInfo("The List");
        LoggerUtility.logInfo(integerList.toString());

        // Printing the common elements
        LoggerUtility.logInfo("The common elements");
        integerSet.stream()
           .filter(integerList::contains)
           .distinct()
           .forEach(i -> LoggerUtility.logInfo(i.toString()));
    }

}
