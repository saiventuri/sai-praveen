package com.nisum.saipravin.assignments.arraylist;

import java.util.ArrayList;
import java.util.List;

import com.nisum.saipravin.assignments.logging.LoggerUtility;

/**
 * Problem Statement: Write a program to reverse the given array lists.
 * 
 * @author sai praveen
 *
 */

public class ArrayListReverse {

    /**
     * This is the main method used to reverse array list.
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

        LoggerUtility.logInfo("List before Reversing of elements");
        LoggerUtility.logInfo(integerList.toString());

        // Reversing the ArrayLList
        reverseList(integerList);

        LoggerUtility.logInfo("List after Reversing of elements");
        LoggerUtility.logInfo(integerList.toString());

    }

    /**
     * Reverses the given list.
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
