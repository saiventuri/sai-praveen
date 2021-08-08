package com.nisum.saipravin.assignments.collections;

import com.nisum.saipravin.assignments.logging.LoggerUtility;
import java.util.Hashtable;
import java.util.Map;

/**
 * Problem Statement: Write a program to display HashTable content.
 * 
 * @author sai praveen
 *
 */
public class HashTableDisplay {

    /**
     * This is the main method which displays HashTable content.
     * 
     * @param args unused.
     */
    public static void main(String[] args) {

        // Creation of HashTable
        Map<Integer, String> namesMap = new Hashtable<>();

        // Adding data into the HashTable
        namesMap.put(1, "Sai");
        namesMap.put(2, "Praveen");
        namesMap.put(3, "Lokesh");
        namesMap.put(4, "Kamal");
        namesMap.put(5, "Vimala");

        // Displaying the data of HashTable
        LoggerUtility.logInfo(namesMap.toString());
    }

}
