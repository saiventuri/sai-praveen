package com.nisum.saipravin.assignments.collections;

import com.nisum.saipravin.assignments.logging.LoggerUtility;
import java.util.Hashtable;
import java.util.Map;

/**
 * Problem Statement: Write a program to search key and value from HashTable.
 * 
 * @author sai praveen
 *
 */
public class HashTableSearch {

    /**
     * This is the main method used to search HashTable for key-value pairs.
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

        // Searching the key 1 in namesMap
        if (namesMap.containsKey(1)) {

            LoggerUtility.logInfo("Key 1 is present in the HashTable");
        } else {

            LoggerUtility.logInfo("Key 1 is not present in the HashTable");
        }

        // Searching the value 'Lokesh' in namesMap
        if (namesMap.containsValue("Lokesh")) {

            LoggerUtility.logInfo("Value 'Lokesh' is present in the HashTable");
        } else {

            LoggerUtility.logInfo("Value 'Lokesh' is not present in the HashTable");
        }
    }
}
