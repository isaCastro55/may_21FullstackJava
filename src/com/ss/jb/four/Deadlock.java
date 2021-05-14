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
                    synchronized (resource1) {
                        Thread.sleep(100);
                        synchronized (resource2) {
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
                    synchronized (resource2) {
                        Thread.sleep(100);
                        synchronized (resource1) {
                            System.out.println("Thread 2 Dead lock String example: "+r3+" "+r4);
                            System.out.println("Thread 2 is running: "+(resource1-resource2));

                        }
                    }

                } catch (Exception e) {
                    e.printStackTrace();
                }

            }
        };

        new Thread(t1).start();
        new Thread(t2).start();

        System.out.println("Deadlock example end");
    }
}