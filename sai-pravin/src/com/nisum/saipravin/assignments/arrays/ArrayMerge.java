package com.nisum.saipravin.assignments.arrays;

import com.nisum.saipravin.assignments.logging.LoggerUtility;

/**
 * Problem Statement: Write a program to merge two arrays into one.
 * 
 * @author sai praveen
 *
 */
public class ArrayMerge {

    /**
     * This is the main method used
     * to merge two arrays.
     * 
     * @param args unused.
     */
    public static void main(String[] args) {

        int[] array1 = {3, 4, 10, 4, 7, 5, 8, 9, 11, 3};

        LoggerUtility.logInfo("First Array");
        ArrayUtilities.logArray(array1);

        int[] array2 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        LoggerUtility.logInfo("Second Array");
        ArrayUtilities.logArray(array2);
        
        int[] mergedArray = mergeArrays(array1, array2);

        LoggerUtility.logInfo("Merged Array");
        ArrayUtilities.logArray(mergedArray);
    }

    /**
     * Merges the given 2 arrays into a single array.
     * 
     * @param array1 First array to be merged
     * @param array2 Second array to be merged
     * @return merged array
     */
    public static int[] mergeArrays(int[] array1, int[] array2) {

        // Creating the merged array
        int[] mergedArray = new int[array1.length + array2.length];

        // Copying the arrays into the merged array
        System.arraycopy(array1, 0, mergedArray, 0, array1.length);  
        System.arraycopy(array2, 0, mergedArray, array1.length, array2.length);

        return mergedArray;
    }

}
