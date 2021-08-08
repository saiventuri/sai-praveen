package com.nisum.saipravin.assignments.collections;

import com.nisum.saipravin.assignments.logging.LoggerUtility;
import java.util.LinkedList;

/**
 * Problem Statement: Write a program to Implement LinkedList.
 * 
 * @author sai praveen
 *
 */
public class LinkedListImpl {

    /**
     * This is the main method used to perform linked list operations.
     * 
     * @param args unused.
     */
    public static void main(String[] args) {

        // create a linked list
        LinkedList<String> namesList = new LinkedList<>();
        LoggerUtility.logInfo("Initial size of LinkedList: " + namesList.size());

        // add elements to the linked list
        namesList.add("Sai");
        namesList.add("Praveen");
        namesList.add("Lokesh");
        namesList.add("Kamal");
        LoggerUtility.logInfo("Elements of LinkedList: " + namesList.toString());
        LoggerUtility.logInfo("Size of LinkedList after addition: " + namesList.size());

        // adds first and last elements
        namesList.addFirst("Naresh");
        namesList.addLast("Suresh");
        LoggerUtility.logInfo("LinkedList after adding first and last: " + namesList);
        LoggerUtility.logInfo("Size of the LinkedList after addition of first and last elements: " + namesList.size());

        // adds at specific index
        namesList.add(4, "Hari");
        LoggerUtility.logInfo("LinkedList after adding at index 4: " + namesList);
        LoggerUtility.logInfo("Size of the LinkedList after addition at index 4: " + namesList.size());

        // remove elements from the linked list
        namesList.remove(2);
        LoggerUtility.logInfo("Element of LinkedList after deletion: " + namesList.toString());
        LoggerUtility.logInfo("Size of the LinkedList after deletion: " + namesList.size());

        // remove first and last elements
        namesList.removeFirst();
        namesList.removeLast();
        LoggerUtility.logInfo("LinkedList after deleting first and last: " + namesList);
        LoggerUtility.logInfo("Size of the LinkedList after deletion: " + namesList.size());

        // deletion of particular object
        namesList.remove("Suresh");
        LoggerUtility.logInfo("LinkedList after deleting 'Suresh': " + namesList);
        LoggerUtility.logInfo("Size of the LinkedList after deleting 'Suresh': " + namesList.size());

        // Retrieving First and Last element
        LoggerUtility.logInfo("Fisrt element of LinkedList: " + namesList.getFirst());
        LoggerUtility.logInfo("Last element of LinkedList: " + namesList.getLast());
    }

}
