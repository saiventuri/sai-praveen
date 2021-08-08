package com.nisum.saipravin.assignments.multithreading;

import com.nisum.saipravin.assignments.logging.LoggerUtility;

/**
 * This class demonstrates a Thread by creating a class that is implementing
 * Runnable interface.
 * 
 * @author sai praveen
 *
 */
public class RunnableImpl implements Runnable {

    /**
     * Run method for the thread.
     */
    @Override
    public void run() {

        for (int i = 0; i < 25; i++) {

            LoggerUtility.logInfo(Thread.currentThread().getId() + ":" + i);
            try {

                Thread.sleep(5000);
            } catch (InterruptedException e) {

                e.printStackTrace();
                Thread.currentThread().interrupt();
            }

        }
    }
}
