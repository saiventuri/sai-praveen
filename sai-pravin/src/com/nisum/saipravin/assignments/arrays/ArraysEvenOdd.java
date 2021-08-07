package com.nisum.saipravin.assignments.arrays;

import java.util.Arrays;

import com.nisum.saipravin.assignments.logging.LoggerUtility;


/**
 * Problem Statement: Write a program to print even and odd numbers.
 * 
 * @author sai praveen
 *
 */
public class ArraysEvenOdd {

    /**
     * This is the main method used
     * to print even and odd numbers in
     * the array.
     * 
     * @param args unused.
     */
    public static void main(String[] args) {

        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        LoggerUtility.logInfo("Array");
        ArrayUtilities.logArray(array);

        LoggerUtility.logInfo("Even numbers in the array");
        printEvenNumbersinArray(array);

        LoggerUtility.logInfo("Odd numbers in the array");
        printOddNumbersinArray(array);
    }

    /**
     * Prints odd numbers present in the given array.
     * 
     * @param array the array in which odd numbers to be printed.
     */
    public static void printOddNumbersinArray(int[] array) {

        Arrays.stream(array)
              .boxed()
              .filter(i -> i % 2 != 0)
              .forEach(i -> LoggerUtility.logInfo(i.toString()));
    }
    
    /**
     * Prints even numbers present in the given array.
     * 
     * @param array the array in which even numbers to be printed.
     */
    public static void printEvenNumbersinArray(int[] array) {

        Arrays.stream(array)
              .boxed()
              .filter(i -> i % 2 == 0)
              .forEach(i -> LoggerUtility.logInfo(i.toString()));
    }

}
