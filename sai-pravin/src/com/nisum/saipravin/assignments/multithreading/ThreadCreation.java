package com.nisum.saipravin.assignments.multithreading;

/**
 * Problem Statement : Write a program to create threads by all possible ways.
 * 
 * @author sai praveen
 *
 */
public class ThreadCreation {

    /**
     * This is the main method used to demonstrate
     * thread creation ways.
     * 
     * @param args unused.
     */
    public static void main(String[] args) {

        // 1. Creating a Thread using object from the class which extends Thread Class
        Thread thread1 = new Thread(new ThreadImpl());
        thread1.start();

        // 2. Creating a Thread using object from the class which implements Runnable Interface
        Thread thread2 = new Thread(new RunnableImpl());
        thread2.start();
    }
}
