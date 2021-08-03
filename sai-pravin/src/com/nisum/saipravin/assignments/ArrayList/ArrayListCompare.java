package com.nisum.saipravin.assignments.ArrayList;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author sai praveen
 * Problem Statement: Write a program to compare two array lists
 *
 */
public class ArrayListCompare {

	public static void main(String[] args) {
		/* Initialize the First Array List */
		List<Integer> list1 = new ArrayList<Integer>();
		
		/* Adding Elements to the first ArrayList */
		list1.add(4);
		list1.add(2);
		list1.add(5);
		list1.add(3);
		list1.add(10);
		list1.add(7);
		list1.add(6);
		list1.add(4);
		list1.add(8);
		list1.add(9);
		
		/* Initialize the second Array List */
		List<Integer> list2 = new ArrayList<Integer>();
		
		/* Adding Elements to the second ArrayList */
		list2.add(4);
		list2.add(2);
		list2.add(5);
		list2.add(3);
		list2.add(10);
		list2.add(7);
		list2.add(6);
		list2.add(4);
		list2.add(8);
		list2.add(9);
		
		/* Initialize the third Array List */
		List<Integer> list3 = new ArrayList<Integer>();
		
		/* Adding Elements to the third ArrayList */
		list3.add(14);
		list3.add(2);
		list3.add(81);
		list3.add(9);
		list3.add(65);
		list3.add(3);
		list3.add(10);
		list3.add(7);
		list3.add(6);
		list3.add(49);
		
		System.out.println("List 1");
		System.out.println(list1);
		
		System.out.println("List 2");
		System.out.println(list2);
		
		System.out.println("List 3");
		System.out.println(list3);
		
		/* Comparing List 1 and List 2 */
		if(list1.equals(list2)) {
			System.out.println("List 1 and List 2 are same");
		} else {
			System.out.println("List 1 and List 2 are not same");
		}
		
		/* Comparing List 1 and List 3 */
		if(list1.equals(list3)) {
			System.out.println("List 1 and List 3 are same");
		} else {
			System.out.println("List 1 and List 3 are not same");
		}

	}

}
