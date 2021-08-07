package com.nisum.saipravin.assignments.arrays;

import com.nisum.saipravin.assignments.logging.LoggerUtility;

/**
 * Problem Statement: Write a program to reverse the array.
 * 
 * @author sai praveen
 *
 */
public class ArrayReverse {

    /**
     * This is the main method used
     * to reverse the array.
     * 
     * @param args unused.
     */
    public static void main(String[] args) {

        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        LoggerUtility.logInfo("Array before reversing");
        ArrayUtilities.logArray(array);

        // Reversing the array
        reverseArray(array);

        LoggerUtility.logInfo("Array after reversing");
        ArrayUtilities.logArray(array);
    }

    /**
     * Reverses the content of the array.
     * 
     * @param array the array whose content to be reversed
     */
    public static void reverseArray(int[] array) {

        int arrayLength = array.length;

        for (int i = 0; i < arrayLength / 2; i++) {
            int temp = array[i];
            array[i] = array[arrayLength - i - 1];
            array[arrayLength - i - 1] = temp;
        }
    }
}
