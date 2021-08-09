package com.nisum.saipravin.assignments.arraylist;

import java.util.ArrayList;
import java.util.List;

import com.nisum.saipravin.assignments.logging.LoggerUtility;

/**
 * Problem Statement: Write a program to remove the element by given index from
 * a array list.
 * 
 * @author sai praveen
 * 
 */
public class ArrayListRemoval {

    /**
     * This is the main method used to remove an element in the array list.
     * 
     * @param args unused.
     */
    public static void main(String[] args) {

        // Initialize the Array List
        List<Integer> integerList = new ArrayList<>();

        // Adding Elements to the ArrayList
        integerList.add(4);
        integerList.add(2);
        integerList.add(5);
        integerList.add(3);
        integerList.add(10);
        integerList.add(7);
        integerList.add(6);
        integerList.add(4);
        integerList.add(8);
        integerList.add(9);

        LoggerUtility.logInfo("List before removal of element");
        LoggerUtility.logInfo(integerList.toString());

        // Removing element 7 from the list
        try {

            LoggerUtility.logInfo("List after removal of element " + integerList.remove(7));
            LoggerUtility.logInfo(integerList.toString());
        } catch (UnsupportedOperationException | IndexOutOfBoundsException ex) {

            LoggerUtility.logInfo("Unable to delete element from the list");
        }

    }

}
