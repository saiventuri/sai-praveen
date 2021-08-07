package com.nisum.saipravin.assignments.arrays;

import com.nisum.saipravin.assignments.logging.LoggerUtility;

/**
 * Problem Statement: Write a program to remove an element from array.
 * 
 * @author sai praveen
 *
 */
public class ArrayElementRemoval {

    /**
     * This is the main method used
     * to delete an element from an array.
     * 
     * @param args unused.
     */
    public static void main(String[] args) {
        
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        
        LoggerUtility.logInfo("Array before removing element 6");
        ArrayUtilities.logArray(array);

        /* Reversing the array */
        array = removeElementFromArray(array, 6);
        
        LoggerUtility.logInfo("Array after removing element 6");
        ArrayUtilities.logArray(array);
    }

    /**
     * Removes the given element from the array.
     * 
     * @param array the array from which the deletion has to happen.
     * @param element the element that is to be removed from the array.
     * @return array not containing the given element.
     */
    public static int[] removeElementFromArray(int[] array, int element) {

        boolean isElementPresent = false;
        int arrayLength = array.length;
        int[] resArray = new int[arrayLength - 1];

        // used for iterations
        int i = 0;
        int j = 0;

        while (i < arrayLength) {

            // If the array element is not matching given element
            // copy into the result array
            if (array[i] != element) {

                // Handling the overflow condition of the result array
                // in the case when element is not present in array
                if (j < arrayLength - 1) {

                    resArray[j] = array[i];
                    j++;
                }
            } else {

                isElementPresent = true;
            }
            
            i++;
        }
        
        return (isElementPresent) ? resArray : array;
    }

}
