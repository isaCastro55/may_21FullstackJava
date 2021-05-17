package com.ss.jb.four;

public class Deadlock {
    public static void main(String[] args) {
        final Integer resource1 = 5;
        final Integer resource2 = 10;

        final String r3= "Hello";
        final String r4= "World";

        System.out.println("Deadlock Example Begin");
        Runnable t1 = new Runnable() {

            @Override
            public void run() {
                try {
                    // thread 1 locks resource 1
                    synchronized (resource1) {
                        // thread 1 sleeps for sometime
                        Thread.sleep(100);
                        // thread 1 attempts to lock resource 2 but cant since thread 2 already has it
                        synchronized (resource2) {
                            // if thread 1 was able to lock resource 2 then would print some manipulation of the resource
                            System.out.println("Thread 1 Dead lock String example: "+r3+" "+r4);
                            System.out.println("Thread 1 is running:"+(resource1+resource2));
                        }
                    }

                } catch (Exception e) {
                    e.printStackTrace();
                }

            }
        };

        Runnable t2 = new Runnable() {

            @Override
            public void run() {
                try {
                    // thread 2 locks resource 2
                    synchronized (resource2) {
                        //thread 2 waits a while
                        Thread.sleep(100);

                        // thread 2 attempts to lock resource 1 but cant since its locked by thread 1
                        synchronized (resource1) {
                            // if able to lock resource1 would print some manipulation of the resource
                            System.out.println("Thread 2 Dead lock String example: "+r3+" "+r4);
                            System.out.println("Thread 2 is running: "+(resource1-resource2));
                        }
                    }

                } catch (Exception e) {
                    e.printStackTrace();
                }

            }
        };

        // start the threads
        new Thread(t1).start();
        new Thread(t2).start();

        System.out.println("Deadlock example end");
    }
}