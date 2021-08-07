package com.nisum.saipravin.assignments.arrays;

import com.nisum.saipravin.assignments.logging.LoggerUtility;

/**
 * Problem Statement: Write a program to find second min and max number.
 * 
 * @author sai praveen
 *
 */
public class ArraySecondMinAndMax {

    /**
     * This is the main method used
     * for finding second minimum and
     * maximum elements in the array.
     * 
     * @param args unused.
     */
    public static void main(String[] args) {

        int[] array = {3, 4, 10, 4, 7, 5, 8, 9, 11, 3};

        LoggerUtility.logInfo("Array");
        ArrayUtilities.logArray(array);

        LoggerUtility.logInfo("Second smallest element in the array is "
                + findSecondMinInArray(array));
        LoggerUtility.logInfo("Second largest element in the array is "
                + findSecondMaxInArray(array));
    }

    /**
     * Returns the second smallest element in the array.
     * 
     * @param array the array to find second smallest element
     * @return second smallest element
     */
    public static int findSecondMinInArray(int[] array) {

        int firstSmallestElement = Integer.MAX_VALUE;
        int secondSmallestElement = Integer.MAX_VALUE;

        for (int i = 0; i < array.length; i++) {

            if (array[i] < firstSmallestElement) {

                secondSmallestElement = firstSmallestElement;
                firstSmallestElement = array[i];
            } else if (array[i] < secondSmallestElement && array[i] != firstSmallestElement) {

                secondSmallestElement = array[i];
            }
        }

        return secondSmallestElement;
    }

    /**
     * Returns the second largest element in the array.
     * 
     * @param array the array to find second largest element
     * @return second largest element
     */
    public static int findSecondMaxInArray(int[] array) {

        int firstMaxElement = Integer.MIN_VALUE;
        int secondMaxElement = Integer.MIN_VALUE;

        for (int i = 0; i < array.length; i++) {

            if (array[i] > firstMaxElement) {

                secondMaxElement = firstMaxElement;
                firstMaxElement = array[i];
            } else if (array[i] > secondMaxElement && array[i] != firstMaxElement) {

                secondMaxElement = array[i];
            }
        }

        return secondMaxElement;
    }

}
