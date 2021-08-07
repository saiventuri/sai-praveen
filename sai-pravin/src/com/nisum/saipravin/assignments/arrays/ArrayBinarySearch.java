package com.nisum.saipravin.assignments.arrays;

import com.nisum.saipravin.assignments.logging.LoggerUtility;

/**
 * Problem Statement: Write a program to search element with binary search.
 * 
 * @author sai praveen
 *
 */
public class ArrayBinarySearch {

    /**
     * This is the main method
     * used to perform binary search
     * on Array.
     * 
     * @param args unused.
     */
    public static void main(String[] args) {

        // Initialize a sorted array
        int[] sortedArray = {11, 13, 14, 15, 16, 17, 18, 19, 23};
        
        // Print array
        LoggerUtility.logInfo("Array");
        ArrayUtilities.logArray(sortedArray);
        
        // Searching 15 in the array using binary search
        int index = binarySearch(sortedArray, 15);
        
        if (index != -1) {
            LoggerUtility.logInfo("The Element 15 is present at "
                            + (index + 1) 
                            + " position in the array");
        } else {
            LoggerUtility.logInfo("The element 15 is not present in the array");
        }

    }

    /**
     * Searches an element in the array and returns its index
     * in the array if present using binary search.
     * 
     * @param sortedArray the array that is to be searched and the array must be sorted
     *                    before passing.
     * @param element the element that needs to be searched in the array.
     * @return -1 if element is not present in the array else index of the element in the array.
     */
    public static int binarySearch(int[] sortedArray, int element) {
        
        int arrayLength = sortedArray.length;
        int low = 0;
        int high = arrayLength -1;
 
        while (low <= high) {

            // Calculating mid position
            int mid = low + ((high - low) / 2);

            if (sortedArray[mid] == element) {
 
                return mid;
            }

            if (element > sortedArray[mid]) {
  
                low = mid + 1;
            } else {

                high = mid - 1;
            }
        }
 
        return -1;
    }

}
