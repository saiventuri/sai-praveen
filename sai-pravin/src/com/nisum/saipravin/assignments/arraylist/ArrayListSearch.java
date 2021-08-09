package com.nisum.saipravin.assignments.arraylist;

import java.util.ArrayList;
import java.util.List;

import com.nisum.saipravin.assignments.logging.LoggerUtility;

/**
 * Problem Statement : Write a program to find an element in a array list.
 * 
 * @author sai praveen
 * 
 */

public class ArrayListSearch {

    /**
     * This is the main method used to find an element in array list.
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

        LoggerUtility.logInfo("List before search of element");
        LoggerUtility.logInfo(integerList.toString());

        // Searching an element 7 in the Array List
        if (integerList.contains(7)) {
            LoggerUtility.logInfo("Element is found in the list at " + (integerList.indexOf(7) + 1) + " position");
        } else {
            LoggerUtility.logInfo("Element is not found in the list");
        }

    }

}
