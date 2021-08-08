package com.nisum.saipravin.assignments.collections;

import com.nisum.saipravin.assignments.logging.LoggerUtility;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;

/**
 * Problem Statement : Write a program to delete duplicate object from ArrayList.
 * 
 * @author sai praveen
 *
 */
public class ArrayListDuplicateDeletion {

    /**
     * This is the main method used for demonstration of duplicate element deletion
     * from ArrayList.
     * 
     * @param args unused.
     */
    public static void main(String[] args) {

        // Creation of ArrayList
        ArrayList<Integer> integerList = new ArrayList<>();
        integerList.addAll(Arrays.asList(4, 6, 8, 4, 10, 5, 8, 7));

        // Printing the list before deletion of duplicates
        LoggerUtility.logInfo("The List");
        LoggerUtility.logInfo(integerList.toString());

        // Deleting duplicate elements from the list
        removeDuplicates(integerList);

        // Printing the list after deletion of duplicates
        LoggerUtility.logInfo("The List after deletion of duplicates");
        LoggerUtility.logInfo(integerList.toString());
    }

    /**
     * Removes duplicate elements from the given list.
     * 
     * @param <T>  the class of the objects in the list.
     * @param list the list in which duplicates are to be removed.
     * @throws NullPointerException if the specified collection is null
     */
    public static <T> void removeDuplicates(List<T> list) {

        // Converting the ArrayList to a LinkedHashSet to get unique elements from the
        // list
        // and to preserve the order of elements
        LinkedHashSet<T> uniqueElementSet = new LinkedHashSet<>(list);

        // clearing the old list and copying the unique elements into the list
        list.clear();
        list.addAll(uniqueElementSet);
    }

}
