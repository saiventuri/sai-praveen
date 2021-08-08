/**
 * 
 */
package com.nisum.saipravin.assignments.collections;

import com.nisum.saipravin.assignments.logging.LoggerUtility;
import java.util.Arrays;
import java.util.HashSet;

/**
 * Problem Statement : Write a program to copy elements from HashSet to Array.
 * 
 * @author sai praveen
 *
 */
public class HashSetCopy {

    /**
     * This is the main method used for copying HashSet elements into an Array.
     * 
     * @param args Unused.
     */
    public static void main(String[] args) {

        // Creation of HashSet and adding elements to it
        HashSet<Integer> integerSet = new HashSet<>();
        integerSet.addAll(Arrays.asList(1, 2, 3, 4, 5));

        // Creating an array of size same as HashSet
        Integer[] integerArray = new Integer[integerSet.size()];

        // Copying set elements to array
        integerSet.toArray(integerArray);

        // Printing set and array
        LoggerUtility.logInfo("The HashSet");
        LoggerUtility.logInfo(integerSet.toString());

        LoggerUtility.logInfo("The copied array");
        for (Integer i : integerArray) {

            LoggerUtility.logInfo(i.toString());
        }
    }

}
