package com.nisum.saipravin.assignments.ExceptionHandling;

/**
 * 
 * @author sai praveen
 * Problem Statement: Write a program to define multiple catch blocks for exception handling.
 */

public class MultipleExceptions {

	public static void main(String[] args) {
		try {
			/* Causing Arithmetic Exception */
			int n = args.length;
			@SuppressWarnings("unused")
			int a = 100/n;
			
			/* Causing ArrayIndexOutOfBounds Exception */
			int b[] = {10,20,30};
			b[5] = 50;
			
		} catch(ArithmeticException e) {
			System.out.println(e);
		} catch(ArrayIndexOutOfBoundsException ex) {
			System.out.println(ex);
		} finally {
			System.out.println("End Of Main");
		}
	}

}
