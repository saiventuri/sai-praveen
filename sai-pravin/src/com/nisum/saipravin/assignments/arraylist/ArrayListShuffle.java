package com.nisum.saipravin.assignments.arraylist;

import com.nisum.saipravin.assignments.logging.LoggerUtility;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Problem Statement: Write a program to shuffle the given array list.
 * 
 * @author sai praveen
 * 
 */
public class ArrayListShuffle {

    /**
     * Random Index Generator.
     */
    public static final Random randIndexGenerator = new Random();

    /**
     * This is the main method which is used to perform shuffling on array list.
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

        LoggerUtility.logInfo("List before shuffling of elements");
        LoggerUtility.logInfo(integerList.toString());

        // Shuffling the ArrayLList
        shuffleList(integerList);

        LoggerUtility.logInfo("List after shuffling of elements");
        LoggerUtility.logInfo(integerList.toString());

    }

    /**
     * Shuffles the given list.
     * 
     * @param list the list of integers that is to be shuffled
     */
    public static void shuffleList(List<Integer> list) {
        int size = list.size();

        for (int i = size - 1; i > 0; i--) {

            /* Getting the Random index */
            int randIndex = randIndexGenerator.nextInt(i + 1);

            /* Swapping the elements */
            int temp = list.get(randIndex);
            list.set(randIndex, list.get(i));
            list.set(i, temp);
        }
    }

}
