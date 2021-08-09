package com.nisum.saipravin.assignments.hashmap;

import com.nisum.saipravin.assignments.logging.LoggerUtility;
import java.util.HashMap;
import java.util.Map;

/**
 * Problem Statement: Write a program to check if a map contains the specified
 * key/value.
 * 
 * @author sai praveen
 *
 */
public class HashMapSearch {

    /**
     * This is the main method which is used to perform search on hash map.
     * 
     * @param args unused.
     */
    public static void main(String[] args) {

        /* Initializing the hash map */
        Map<Integer, String> namesMap = new HashMap<>();

        /* Adding key-value pairs to the map */
        namesMap.put(1, "Sai");
        namesMap.put(2, "Praveen");
        namesMap.put(3, "Lokesh");
        namesMap.put(4, "Keerthi");
        namesMap.put(5, "Vimal");

        LoggerUtility.logInfo("Hash Map");
        LoggerUtility.logInfo(namesMap.toString());

        /* Searching for the key 3 in the map */
        if (namesMap.containsKey(3)) {
            LoggerUtility.logInfo("Key 3 found in the hash map");
        } else {
            LoggerUtility.logInfo("Key not found in the hash map");
        }

        /* Searching for the value Lokesh in the map */
        if (namesMap.containsValue("Lokesh")) {
            LoggerUtility.logInfo("Value Lokesh found in the hash map");
        } else {
            LoggerUtility.logInfo("Value Lokesh not found in the hash map");
        }

    }

}
