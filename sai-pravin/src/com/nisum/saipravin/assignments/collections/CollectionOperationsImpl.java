package com.nisum.saipravin.assignments.collections;

import com.nisum.saipravin.assignments.logging.LoggerUtility;
import java.util.ArrayList;

/**
 * Problem Statement : Write a program to insert, retrieve and remove record.
 * 
 * @author sai praveen
 *
 */
public class CollectionOperationsImpl {

    /**
     * This is the main method used to demonstrate basic collection operations.
     * 
     * @param args unused.
     */
    public static void main(String[] args) {

        ArrayList<String> namesList = new ArrayList<>();

        LoggerUtility.logInfo("Initial size of list: " + namesList.size());

        // Inserting the elements
        namesList.add("Sai");
        namesList.add("Praveen");
        namesList.add("Venkat");
        namesList.add("Kamal");
        LoggerUtility.logInfo("Elements of list after insertion: " + namesList.toString());

        // remove the element
        namesList.remove("Venkat");
        LoggerUtility.logInfo("Elements of ArrayList after deletion: " + namesList.toString());
        LoggerUtility.logInfo("Size of ArrayList: " + namesList.size());

        // Retrieving 2nd index element
        LoggerUtility.logInfo("The element at 2nd index is: " + namesList.get(2));

    }

}
