package com.nisum.saipravin.assignments.multithreading;

import com.nisum.saipravin.assignments.logging.LoggerUtility;

/**
 * Problem Statement: Write a program for defining Synchronization block and Method.
 * 
 * @author sai praveen
 *
 */
public class ThreadSyncronization implements Runnable {

    /**
     * counter used to demonstrate synchronization.
     */
    private Integer counter = 0;

    /**
     * This is the main method used to demonstrate thread synchronization.
     * 
     * @param args unused.
     * @throws InterruptedException if threads are interrupted.
     */
    public static void main(String[] args) throws InterruptedException {

        ThreadSyncronization obj = new ThreadSyncronization();

        // 1. Demonstrating Synchronized Method
        Runnable runnable = () -> obj.printNumbers(10);

        // Creating the executor service for running threads using runnables having the
        // synchronized method
        Thread thread1 = new Thread(runnable);
        Thread thread2 = new Thread(runnable);

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();

        // 2. Demonstrating Synchronized Block
        // The two threads will not interfere while incrementing the counter due to
        // synchronized block

        Thread thread3 = new Thread(obj);
        Thread thread4 = new Thread(obj);

        thread3.start();
        thread4.start();

        thread3.join();
        thread4.join();
    }

    /**
     * Prints numbers from 0 to the given range. Used to demonstrate synchronized
     * method.
     * 
     * @param range the range up to when the numbers should be printed
     */
    public synchronized void printNumbers(int range) {

        for (int i = 0; i < range; i++) {

            LoggerUtility.logInfo("Thread "
                                 + Thread.currentThread().getId()
                                 + ": "
                                 + i);
        }
    }

    /**
     * Run method for the execution of the thread.
     */
    @Override
    public void run() {

        int i = 100;
        synchronized (this) {
            while (i > 0) {

                this.counter++;
                LoggerUtility.logInfo("Thread "
                                     + Thread.currentThread().getId()
                                     + ": counter value :"
                                     + this.counter);
                i--;
            }
        }
    }
}
