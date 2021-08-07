package com.nisum.saipravin.assignments.arrays;

import com.nisum.saipravin.assignments.logging.LoggerUtility;

/**
 * Problem Statement: Write a program to sort array using Bubble sort.
 * 
 * @author sai praveen
 *
 */
public class ArraySort {

    /**
     * This is the main method used
     * to sort the array.
     * 
     * @param args unused.
     */
    public static void main(String[] args) {

        int[] array = {3, 4, 10, 4, 7, 5, 8, 9, 11, 3};

        LoggerUtility.logInfo("Array before sorting");
        ArrayUtilities.logArray(array);

        /* Sorting the array */
        bubbleSort(array);

        LoggerUtility.logInfo("Array after sorting");
        ArrayUtilities.logArray(array);
    }

    /**
     * Sorts the given array using bubble sort algorithm.
     * 
     * @param array the array that is to be sorted.
     */
    public static void bubbleSort(int[] array) {

        int arrayLength = array.length;
        boolean swapped = true;

        for (int pass = arrayLength - 1; pass >= 0 && swapped; pass--) {

            swapped = false;
            for (int i = 0; i <= pass - 1; i++) {

                if (array[i] > array[i + 1]) {

                    // Swapping elements in the array
                    int temp = array[i + 1];
                    array[i + 1] = array[i];
                    array[i] = temp;
                    swapped = true;
                }
            }
        }
    }

}
