package com.nisum.saipravin.assignments.Arrays;

import java.util.Arrays;


/**
 * Problem Statement: Write a program to print even & odd numbers
 * @author sai praveen
 *
 */
public class ArraysEvenOdd {

	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4,5,6,7,8,9,10};
		
		System.out.println("Array");
		ArrayUtilities.printArray(arr);
		
		System.out.println("Even numbers in the array");
		printEvenNumbersinArray(arr);
		
		System.out.println("Odd numbers in the array");
		printOddNumbersinArray(arr);

	}
	
	/**
	 * Prints odd numbers present in the given array
	 * @param arr the array in which odd numbers to be printed
	 */
	public static void printOddNumbersinArray(int[] arr) {
		
		Arrays.stream(arr).boxed().filter(i -> i%2 != 0).forEach(System.out::println);
	}
	
	/**
	 * Prints even numbers present in the given array
	 * @param arr the array in which even numbers to be printed
	 */
	public static void printEvenNumbersinArray(int[] arr) {
		Arrays.stream(arr).boxed().filter(i -> i%2 == 0).forEach(System.out::println);
	}

}
