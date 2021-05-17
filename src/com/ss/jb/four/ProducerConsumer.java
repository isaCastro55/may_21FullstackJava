package com.ss.jb.four;


import java.util.LinkedList;

public class ProducerConsumer {

    // create shared resource
    private static LinkedList<Integer> sharedQueue = new LinkedList<>();
    private static int size = 5;

    //
    public void produceInt()
    {
        Integer produced = 0;

        // continuously tries to add items to Shared Queue
        while (true) {

            // locks this class to ensure only producer thread runs
            synchronized (this)
            {
                // Thread waits if list is full for consumer to consume
                if (sharedQueue.size() == size) {
                    try {
                        // gives up lock and goes into waiting
                        wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

                System.out.println("Producer Thread Produced: " + produced);
                sharedQueue.add(produced++);

                // Notifies consumer thread that it may start consuming
                notify();

                // include sleep for the program functionality to be more easily read
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
    public void consumeInt()
    {
        // continuously consumes from shared queue
        while (true) {
            // locks class
            synchronized (this)
            {
                // checks to see if sharedQueue is full
                // if full gives up lock and waits
                if (sharedQueue.size() == 0) {
                    try {
                        wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

                Integer consumed = sharedQueue.removeFirst();
                System.out.println("Consumer Thread Consumed: " + consumed);

                // Notifies Producer thread that it may start producing
                notify();

                // included to better see functionality of program
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

}
