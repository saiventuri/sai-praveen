package com.nisum.saipravin.assignments.collections;

import com.nisum.saipravin.assignments.logging.LoggerUtility;
import java.util.Arrays;
import java.util.List;

/**
 * Problem Statement : Write a program for binary search.
 * 
 * @author sai praveen
 *
 */
public class BinarySearch {

    /**
     * This is the main method which executes
     * binary search on different list collections.
     * 
     * @param args unused.
     */
    public static void main(String[] args) {

        // Creating a list with Integers
        List<Integer> listOfIntegers =  Arrays.asList(3, 5, 9, 12, 15, 88);

        // Creating a list of Strings
        List<String> listOfStrings = Arrays.asList("apple", "ball", "cat", "dog", "soap");

        // Printing the lists
        LoggerUtility.logInfo("The Integer list");
        LoggerUtility.logInfo(listOfIntegers.toString());

        LoggerUtility.logInfo("The String list");
        LoggerUtility.logInfo(listOfStrings.toString());

        // Searching the element 9 and 'cat' in the lists
        int integerListindex = binarySearch(listOfIntegers, 9);
        int stringListIndex = binarySearch(listOfStrings, "cat");

        if (integerListindex != -1) {
            LoggerUtility.logInfo("The element 9  is present at "
                            + (integerListindex + 1) 
                            + " position in the list");
        } else {
            LoggerUtility.logInfo("The element 9  is not present in the list");
        }

        if (stringListIndex != -1) {
            LoggerUtility.logInfo("The element 'cat' is present at "
                            + (stringListIndex + 1) 
                            + " position in the list");
        } else {
            LoggerUtility.logInfo("The element 'cat' is not present in the list");
        }
    }

    /**
     * Searches the specified list for the specified object using the binary search algorithm.
     * 
     * @param <T> the class of the objects in the list.
     * @param list the list to be searched.
     * @param key the key to be searched for.
     * @return the index of the search key, if it is contained in the list else -1.
     * @throws ClassCastException if key could not be compared with elements of list.
     * @throws NullPointerException if a null element is compared in the list or null key is passed.
     */
    public static <T> int binarySearch(List<? extends Comparable<T>> list,
                                       T key) {

        int listLength = list.size();
        int low = 0;
        int high = listLength - 1;

        while (low <= high) {

            // calculating the mid position
            int mid = low + ((high - low) / 2);

            // Comparing the mid element with the key
            int comparisonResult = list.get(mid).compareTo(key);

            if (comparisonResult == 0) {

                // Returning the position if the key equals object at mid position
                return mid;
            } else if (comparisonResult > 0) {

                // Changing low to mid+1 as given key is greater than the object at mid position
                low = mid + 1;
            } else {

                // Changing high to mid-1 as given key is less than the object at mid position
                high = mid - 1;
            }
        }

        // Returning -1 to indicate that key is not found in the list
        return -1;
    }

}
