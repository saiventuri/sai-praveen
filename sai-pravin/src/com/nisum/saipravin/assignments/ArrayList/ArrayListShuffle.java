package com.nisum.saipravin.assignments.ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 
 * @author sai praveen
 * Problem Statement: Write a program to shuffle the given array list
 *
 */

public class ArrayListShuffle {

	public static void main(String[] args) {
		/* Initialize the Array List */
		List<Integer> list = new ArrayList<Integer>();
		
		/* Adding Elements to the ArrayList */
		list.add(4);
		list.add(2);
		list.add(5);
		list.add(3);
		list.add(10);
		list.add(7);
		list.add(6);
		list.add(4);
		list.add(8);
		list.add(9);
		
		System.out.println("List before shuffling of elements");
		System.out.println(list);
		
		/* Shuffling the ArrayLList using Collections Class utility method */
		Collections.shuffle(list);
		
		System.out.println("List after shuffling of elements");
		System.out.println(list);

	}

}
