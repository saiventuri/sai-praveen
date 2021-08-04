package com.nisum.saipravin.assignments.ExceptionHandling;


/**
 * Problem Statement : Write a program to define your own custom exception and throw it.
 * @author sai praveen
 * 
 */

public class OwnCustomExceptionClass {

	public static void main(String[] args) {
		
		try {
			System.out.println("Throwing custom excpetion");
			
			throw new CustomException("Custom Exception thrown from the main method");
		} catch(CustomException ex) {
			System.out.println(ex);
		} finally {
			System.out.println("End of Main");
		}
	}

}
