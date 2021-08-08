package com.nisum.saipravin.assignments.multithreading;

import com.nisum.saipravin.assignments.logging.LoggerUtility;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Problem Statement: Write a program for producer consumer problem.
 * 
 * @author sai praveen
 *
 */
public class ProducerConsumerImpl {

    /**
     * This is the main method used
     * to demonstrate producer consumer problem.
     * 
     * @param args unused.
     */
    public static void main(String[] args) {

        // 1. Create a Blocking Queue
        BlockingQueue<Object> commonQueue = new ArrayBlockingQueue<>(20);

        // 2. Initialize the Producer Runnable
        Runnable producerRunnable = () -> {

            try {

                while (!Thread.currentThread().isInterrupted()) {

                    // Waits for 1 second to produce an object every time
                    Thread.sleep(1000);
                    Object justProduced = new Object();
                    commonQueue.put(justProduced);
                    LoggerUtility.logInfo("PRODUCER: produced a resource and the queue size now is "
                                         + commonQueue.size());
                }
            } catch (InterruptedException exception) {

                LoggerUtility.logInfo("PRODUCER: exiting due to interrupted exception");
                Thread.currentThread().interrupt();
            }
        };

        // 3. Initialize the Consumer Runnable
        Runnable consumerRunnable = () -> {
            try {

                while (!Thread.currentThread().isInterrupted()) {

                    Object obj = commonQueue.take();
                    LoggerUtility.logInfo(
                            "CONSUMER: consumed a resource(" + obj + ") and the queue size now is "
                             + commonQueue.size());
                    Thread.sleep(100);
                }
            } catch (InterruptedException exception) {

                LoggerUtility.logInfo("CONSUMER: exiting due to interrupted exception");
                Thread.currentThread().interrupt();
            }

        };

        int numberOfProducers = 4;
        int numberOfConsumers = 3;

        ExecutorService exService =
                Executors.newFixedThreadPool(numberOfConsumers + numberOfProducers);

        // Starting the Producers
        for (int i = 0; i < numberOfProducers; i++) {

            exService.execute(producerRunnable);
        }

        // Starting the consumers
        for (int i = 0; i < numberOfConsumers; i++) {

            exService.execute(consumerRunnable);
        }

        // Let the producer-consumer run for 10 seconds
        try {

            Thread.sleep(10000);
        } catch (InterruptedException e) {

            e.printStackTrace();
            Thread.currentThread().interrupt();
        }

        // Closing all threads
        exService.shutdownNow();
    }

}
