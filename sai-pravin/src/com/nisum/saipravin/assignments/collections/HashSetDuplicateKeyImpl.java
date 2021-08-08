package com.nisum.saipravin.assignments.collections;

import com.nisum.saipravin.assignments.logging.LoggerUtility;
import java.util.Hashtable;
import java.util.Set;

/**
 * Problem Statement : Write a program to remove duplicate key from hash table.
 * 
 * @author sai praveen
 *
 */
public class HashSetDuplicateKeyImpl {

    /**
     * This is the main method used to delete duplicate keys in the hash table.
     * 
     * @param args unused.
     */
    public static void main(String[] args) {

        Hashtable<Student, String> studentMap = new Hashtable<>();

        studentMap.put(new Student("Ram", 81101), "RAM");
        studentMap.put(new Student("Ravi", 82121), "RAVI");
        studentMap.put(new Student("Atul", 83110), "ATUL");
        studentMap.put(new Student("Anil", 81102), "ANIL");

        // Printing the Hash Table
        LoggerUtility.logInfo("Hash Table : " + studentMap.toString());

        LoggerUtility.logInfo("Adding duplicate entry");
        studentMap.put(new Student("Anil", 81102), "ANIL");

        // Deletion of duplicates
        Set<Student> keys = studentMap.keySet();
        for (Student key : keys) {
            LoggerUtility.logInfo(key + " ==> " + studentMap.get(key));
        }

    }

}
