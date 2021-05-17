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
     /*
         if (instance == null) {
            instance = new Singleton();
         }
            return instance;


          This allows creation of multiple instances
          of this class if called by more than one thread in parallel
          (multithreading)
         */

        /*
            if we use synchronization:

            synchronized (instance) {
			Integer testCount = 0;// this is just for test
			if (instance == null) {
				instance = new SingletonDemo();
			}
		    }
		    return instance;

		    we can ensure that the class becomes thread safe
		    but is not very efficient since you need to synchronize
		    (lock) everytime the method is called, even though
		    its only needed on first creation
         */

    /*
        To solve efficiency problem use double checked locking
        to lock only a certain section of the code.

        - called double checked since instance==null is checked twice
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