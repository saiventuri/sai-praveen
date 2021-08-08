package com.nisum.saipravin.assignments.collections;

import com.nisum.saipravin.assignments.logging.LoggerUtility;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * Problem Statement: Write a program to sort and reverse the LinkedList elements.
 * 
 * @author sai praveen
 *
 */
public class LinkedListReversal {

    /**
     * This is the main method used to sort and reverse the Linked List elements.
     * 
     * @param args unused.
     */
    public static void main(String[] args) {

        // Creating the linked list
        List<Integer> integerList = new LinkedList<>();
        integerList.addAll(Arrays.asList(4, 6, 8, 4, 10, 5, 8, 7));

        // Printing the list
        LoggerUtility.logInfo("Initial List : " + integerList.toString());

        // Sorting the list
        bubbleSort(integerList);

        // Printing the list
        LoggerUtility.logInfo("List after sort : " + integerList.toString());

        // Reversing the list
        reverseList(integerList);

        // Printing the list
        LoggerUtility.logInfo("List after reversing : " + integerList.toString());

    }

    /**
     * Sorts the given linked list according to bubble sort algorithm.
     * 
     * @param list the list of integers that is to be sorted.
     */
    public static void bubbleSort(List<Integer> list) {

        int size = list.size();
        boolean swapped = true;

        for (int pass = size - 1; pass >= 0 && swapped; pass--) {

            swapped = false;
            for (int i = 0; i <= pass - 1; i++) {

                if (list.get(i) > list.get(i + 1)) {

                    // Swapping elements in the list
                    int temp = list.get(i);
                    list.set(i, list.get(i + 1));
                    list.set(i + 1, temp);
                    swapped = true;
                }
            }
        }
    }

    /**
     * Reverses the given linked list.
     * 
     * @param list the list of integers that is to be reversed.
     */
    public static void reverseList(List<Integer> list) {

        int size = list.size();

        for (int i = 0; i < size / 2; i++) {

            int temp = list.get(size - 1 - i);
            list.set(size - i - 1, list.get(i));
            list.set(i, temp);
        }

    }

}
