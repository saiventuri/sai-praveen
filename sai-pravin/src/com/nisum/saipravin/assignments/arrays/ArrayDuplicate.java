package com.nisum.saipravin.assignments.arrays;

import java.util.HashMap;

import com.nisum.saipravin.assignments.logging.LoggerUtility;

/**
 * Problem Statement: Write a program to find duplicate values in array.
 * 
 * @author sai praveen
 *
 */
public class ArrayDuplicate {

    /**
     * This is the main method
     * used to find duplicates in
     * array.
     * 
     * @param args unused.
     */
    public static void main(String[] args) {

        // Creating the array
        int[] integerArray = {3, 4, 10, 4, 7, 5, 8, 9, 11, 3};

        LoggerUtility.logInfo("Array");
        ArrayUtilities.logArray(integerArray);
 
        LoggerUtility.logInfo("Duplicates in the array");
        findDuplicatesInArray(integerArray);
    }

    /**
     * Prints the duplicate elements in the array.
     * 
     * @param array the array in which duplicates are to be printed.
     */
    public static void findDuplicatesInArray(int[] array) {

        // Creating a HashMap to keep track of element count
        HashMap<Integer, Integer> elementMap = new HashMap<>();

        // Iterating through the array to find duplicates
        for (int i : array) {

            if (elementMap.containsKey(i)) {

                elementMap.put(i, elementMap.get(i) + 1);
            } else {

                elementMap.put(i, 0);
            }
        }

        elementMap.entrySet().stream()
                             .filter(e -> e.getValue() != 0)
                             .forEach(e -> LoggerUtility.logInfo(e.getKey().toString()));
    }

}
