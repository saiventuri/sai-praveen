package com.nisum.saipravin.assignments.multithreading;

/**
 * Problem Statement: Write a program to demonstrate priorities of thread.
 * 
 * @author sai praveen
 *
 */
public class ThreadPriorities {

    /**
     * This is the main method used for demonstrating thread priorities.
     * 
     * @param args unused.
     */
    public static void main(String[] args) {

        // Setting Thread 1 with high priority
        Thread thread1 = new Thread(new RunnableImpl());
        thread1.setPriority(8);

        // Setting Thread 2 with low priority
        Thread thread2 = new Thread(new RunnableImpl());
        thread2.setPriority(2);

        // Thread 1 completes first as it is given highest priority
        thread1.start();
        thread2.start();
    }

}
