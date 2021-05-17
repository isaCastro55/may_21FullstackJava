package com.ss.jb.weekone;


// remove unnecessary imports


public  class SampleSingleton {
    // remove connection
    //private static Connection conn = null;

    //add volatile to make it thread safe
    private volatile static SampleSingleton instance = null;

    // private constructor to ensure use of getInstance method
    // for object creation
    private SampleSingleton() { }
    /*
           Double Checked locking to ensure thread safety
           and efficiency

           by only locking after checking if instance is null
           does not waste resources by locking class
           if instance has already been created
     */
    public static SampleSingleton getInstance() {

        if (instance == null) {
            synchronized (SampleSingleton.class)
            {
                if (instance == null) {
                    instance = new SampleSingleton();
                }
            }
        }
        return instance;
    }

}