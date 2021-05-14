package com.ss.jb.four;


import java.util.LinkedList;

public class ProducerConsumer {

    private static LinkedList<Integer> list = new LinkedList<>();
    private static int capacity = 5;

    public void produceInt()
    {
        Integer produced = 0;
        while (true) {
            synchronized (this)
            {
                while (list.size() == capacity) {
                    try {
                        wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println("Produced: " + produced);
                list.add(produced++);
                notify();
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
        while (true) {
            synchronized (this)
            {
                while (list.size() == 0) {
                    try {
                        wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                Integer consumed = list.removeFirst();
                System.out.println("Consumed: " + consumed);
                notify();
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

}
