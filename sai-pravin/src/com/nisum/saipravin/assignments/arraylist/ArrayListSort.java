package com.nisum.saipravin.assignments.arraylist;

import com.nisum.saipravin.assignments.logging.LoggerUtility;
import java.util.ArrayList;
import java.util.List;

/**
 * Problem Statement: Write a program to sort the given array list.
 * 
 * @author sai praveen
 * 
 */
public class ArrayListSort {

    /**
     * This is the main method used to perform sorting on array list.
     * 
     * @param args unused.
     */
    public static void main(String[] args) {

        /* Initialize the Array List */
        List<Integer> integerList = new ArrayList<>();

        /* Adding Elements to the ArrayList */
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

        LoggerUtility.logInfo("List before sorting of elements");
        LoggerUtility.logInfo(integerList.toString());

        /* Sorting the list using bubbleSort technique */
        bubbleSort(integerList);

        LoggerUtility.logInfo("List after sorting of elements");
        LoggerUtility.logInfo(integerList.toString());
    }

    /**
     * Sorts the given list according to bubble sort algorithm.
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
}
