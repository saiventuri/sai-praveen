package com.nisum.saipravin.assignments.ArrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Problem Statement: Write a program to shuffle the given array list
 * @author sai praveen
 * 
 */

public class ArrayListShuffle {
	
	/* Random Index Generator */
	public static final Random randIndexGenerator = new Random();

	public static void main(String[] args) {
		/* Initialize the Array List */
		List<Integer> list = new ArrayList<>();
		
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
		
		/* Shuffling the ArrayLList */
		shuffleList(list);
		
		System.out.println("List after shuffling of elements");
		System.out.println(list);

	}
	
	/**
	 * Shuffles the given list
	 * @param list the list that is to be shuffled
	 */
	public static void shuffleList(List<Integer> list) {
		int size = list.size();
		
		for(int i = size-1; i > 0; i--) {
			
			/* Getting the Random index */
			int randIndex = randIndexGenerator.nextInt(i+1);
			
			/* Swapping the elements */
			int temp = list.get(randIndex);
			list.set(randIndex, list.get(i));
			list.set(i, temp);
		}
	}

}
