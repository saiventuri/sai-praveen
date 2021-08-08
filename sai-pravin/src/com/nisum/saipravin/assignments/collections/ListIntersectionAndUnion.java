package com.nisum.saipravin.assignments.collections;

import com.nisum.saipravin.assignments.logging.LoggerUtility;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

/**
 * Problem Statement : Write a program to implement intersection and union.
 * 
 * @author sai praveen
 *
 */
public class ListIntersectionAndUnion {

    /**
     * Finds the union of two lists.
     * 
     * @param <T>   the class of the objects in the list.
     * @param list1 the first list.
     * @param list2 the second list.
     * @return list containing union elements.
     */
    public static <T> List<T> union(List<T> list1, List<T> list2) {

        Set<T> set = new HashSet<>();
        set.addAll(list1);
        set.addAll(list2);
        return new LinkedList<>(set);
    }

    /**
     * Finds the intersection of two lists.
     * 
     * @param <T>   the class of the objects in the list.
     * @param list1 the first list.
     * @param list2 the second list.
     * @return list containing intersection elements.
     */
    public static <T> List<T> intersection(List<T> list1, List<T> list2) {

        List<T> list = new LinkedList<>();
        for (T t : list1) {

            if (list2.contains(t)) {

                list.add(t);
            }
        }

        return list;
    }

    /**
     * This is the main method used
     * to demonstrate union and intersection
     * operations on a linked list.
     * 
     * @param args unused.
     */
    public static void main(String[] args) {

        // Creating two collections (Set and List)
        List<Integer> integerList1 = new LinkedList<>();
        List<Integer> integerList2 = new LinkedList<>();

        // Adding elements to lists
        integerList1.addAll(Arrays.asList(1, 2, 3, 4, 5));
        integerList2.addAll(Arrays.asList(4, 6, 8, 4, 10, 5, 8, 7));

        // Printing the list
        LoggerUtility.logInfo("The first list : " + integerList1.toString());
        LoggerUtility.logInfo("The second list : " + integerList2.toString());

        LoggerUtility.logInfo("The union of two lists : " + union(integerList1, integerList2).toString());
        LoggerUtility.logInfo("The intersection of two lists : " + intersection(integerList1, integerList2).toString());

    }

}
