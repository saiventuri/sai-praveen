package com.nisum.saipravin.assignments.ExceptionHandling;


/**
 * 
 * @author sai praveen
 * Problem Statement : Write a program to define your own custom exception and throw it.
 */

public class OwnCustomException {

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
