package com.nisum.saipravin.assignments.multithreading;

import com.nisum.saipravin.assignments.logging.LoggerUtility;
import java.util.ArrayList;
import java.util.List;


/**
 * Problem Statement: Write a program to display all running thread.
 * 
 * @author sai praveen
 *
 */
public class RunningThreadStatusImpl {

    /**
     * This is the main method used
     * to implement active thread status notifier.
     * 
     * @param args unused.
     */
    public static void main(String[] args) {

        // Maintaining a list to track thread status
        List<Thread> threadList = new ArrayList<>();

        Runnable statusReporter = () -> {

            while (true) {

                printActiveThreads(threadList);
            }
        };

        Runnable demoRunnable = () -> {

            LoggerUtility.logInfo("Thread " + Thread.currentThread().getId() + " executing..");
            for (int i = 0; i < 10000; i++) {

                LoggerUtility.logInfo("Thread " + Thread.currentThread().getId() + ": " + i);
            }
        };

        Thread thread1 = new Thread(demoRunnable);
        Thread thread2 = new Thread(demoRunnable);

        threadList.add(thread1);
        threadList.add(thread2);

        Thread reporterThread = new Thread(statusReporter);
        reporterThread.setDaemon(true);

        reporterThread.start();
        thread1.start();
        thread2.start();
    }

    /**
     * Prints active thread id's from the thread list.
     * 
     * @param threadList the list of threads running
     */
    private static void printActiveThreads(List<Thread> threadList) {

        threadList.stream()
                  .filter(t -> t.isAlive())
                  .forEach(t -> LoggerUtility.logInfo("Active Thread : " + t.getId()));
    }

}
