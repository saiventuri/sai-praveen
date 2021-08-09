package com.nisum.saipravin.assignments.arraylist;

import com.nisum.saipravin.assignments.logging.LoggerUtility;
import java.util.ArrayList;
import java.util.List;

/**
 * Problem Statement: Write a program to compare two array lists.
 * 
 * @author sai praveen
 * 
 */
public class ArrayListCompare {

    /**
     * This is the main method used to compare two array lists.
     * 
     * @param args unused.
     */
    public static void main(String[] args) {
        // Initialize the First Array List
        List<Integer> integerList1 = new ArrayList<>();

        // Adding Elements to the first ArrayList
        integerList1.add(4);
        integerList1.add(2);
        integerList1.add(5);
        integerList1.add(3);
        integerList1.add(10);
        integerList1.add(7);
        integerList1.add(6);
        integerList1.add(4);
        integerList1.add(8);
        integerList1.add(9);

        // Initialize the second Array List
        List<Integer> integerList2 = new ArrayList<>();

        // Adding Elements to the second ArrayList
        integerList2.add(4);
        integerList2.add(2);
        integerList2.add(5);
        integerList2.add(3);
        integerList2.add(10);
        integerList2.add(7);
        integerList2.add(6);
        integerList2.add(4);
        integerList2.add(8);
        integerList2.add(9);

        // Initialize the third Array List
        List<Integer> integerList3 = new ArrayList<>();

        // Adding Elements to the third ArrayList
        integerList3.add(14);
        integerList3.add(2);
        integerList3.add(81);
        integerList3.add(9);
        integerList3.add(65);
        integerList3.add(3);
        integerList3.add(10);
        integerList3.add(7);
        integerList3.add(6);
        integerList3.add(49);

        LoggerUtility.logInfo("List 1");
        LoggerUtility.logInfo(integerList1.toString());

        LoggerUtility.logInfo("List 2");
        LoggerUtility.logInfo(integerList2.toString());

        LoggerUtility.logInfo("List 3");
        LoggerUtility.logInfo(integerList3.toString());

        /* Comparing List 1 and List 2 */
        if (integerList1.equals(integerList2)) {
            LoggerUtility.logInfo("List 1 and List 2 are same");
        } else {
            LoggerUtility.logInfo("List 1 and List 2 are not same");
        }

        /* Comparing List 1 and List 3 */
        if (integerList1.equals(integerList3)) {
            LoggerUtility.logInfo("List 1 and List 3 are same");
        } else {
            LoggerUtility.logInfo("List 1 and List 3 are not same");
        }

    }

}
