package com.ss.jb.four;

public class ProducerConsumerExample {

    public static void main(String[] args)

    {
        // create new producer consumer object
        final ProducerConsumer proCon = new ProducerConsumer();

        // implements abstract run method from runnable
        // since only one method can use lambda
        Runnable t = () ->proCon.produceInt();
        Runnable tt = () ->proCon.consumeInt();

        // creates new threads using the runnables
        Thread t1 = new Thread(t);
        Thread t2 = new Thread(tt);

        // starts the threads
        t1.start();
        t2.start();
    }


}
