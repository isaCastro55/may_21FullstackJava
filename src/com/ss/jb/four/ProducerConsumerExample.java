package com.ss.jb.four;

public class ProducerConsumerExample {

    public static void main(String[] args)

    {

        final ProducerConsumer proCon = new ProducerConsumer();
        Thread t1 = new Thread(() -> proCon.produceInt());
        Thread t2 = new Thread(() -> proCon.consumeInt());
        t1.start();
        t2.start();
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


}
