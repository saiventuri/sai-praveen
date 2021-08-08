package com.nisum.saipravin.assignments.multithreading;

import com.nisum.saipravin.assignments.logging.LoggerUtility;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Problem Statement: Write a program to print Fibonacci and reverse series.
 * 
 * @author sai praveen
 *
 */
public class FibanacciReverseImpl {

    /**
     * This is the main method used to
     * print and reverse fibonacci series.
     * 
     * @param args unused.
     */
    public static void main(String[] args) {

        // 1. Create a Blocking Queue
        BlockingQueue<Integer> commonQueue = new ArrayBlockingQueue<>(20);
        List<Integer> reverseSeries = new LinkedList<>();

        // 2. Initialize the Producer Runnable which will produce fibonocci numbers and
        // insert them
        // in the blocking queue
        Runnable fibanacciProducerRunnable = () -> {

            try {

                // Printing first 20 fibanacci numbers
                int num1 = 0;
                int num2 = 1;

                LoggerUtility.logInfo("Fibanacci Series");

                commonQueue.put(num1);
                LoggerUtility.logInfo(Integer.toString(num1));
                int i = 20;
                i--;

                commonQueue.put(num2);
                LoggerUtility.logInfo(Integer.toString(num2));
                i--;

                while (i > 0) {

                    // Waits for 1 second to produce an number every time
                    Thread.sleep(1000);
                    int temp = num1 + num2;
                    num1 = num2;
                    num2 = temp;
                    commonQueue.put(num2);
                    LoggerUtility.logInfo(Integer.toString(num2));
                    i--;
                }
            } catch (InterruptedException ex) {

                LoggerUtility.logInfo("Stopping generation of Fibanacci series");
                Thread.currentThread().interrupt();
            }
        };

        // 3. Initialize the Consumer Runnable
        Runnable reverseConsumerRunnable = () -> {
            try {

                int i = 1;

                while (i <= 20) {

                    Integer num = commonQueue.take();
                    reverseSeries.add(0, num);
                    Thread.sleep(100);
                    i++;
                }
                reverseSeries.stream().forEach( t -> LoggerUtility.logInfo(t.toString()));
            } catch (InterruptedException ex) {

                LoggerUtility.logInfo("CONSUMER: exiting due to interrupted exception");
                Thread.currentThread().interrupt();
            }

        };

        ExecutorService exService = Executors.newFixedThreadPool(2);

        // Starting the Producers
        exService.execute(fibanacciProducerRunnable);

        // Starting the consumers
        exService.execute(reverseConsumerRunnable);

        // Closing all threads
        exService.shutdown();
    }

}
