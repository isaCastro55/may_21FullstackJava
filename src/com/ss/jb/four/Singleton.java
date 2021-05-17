package com.ss.jb.four;

class Singleton {
    // Double checked locking of Singleton
    // is a way to make sure that only one instance
    // of Singleton class is created through an application
    // life cycle
    //In double-checked locking, code checks for an existing
    // instance of Singleton class twice with and without
    // locking to make sure that only one instance of
    // singleton gets created.

    /*
        Volatile keyword ensures thread safe
        - changes made by one thread are reflected in other threads
     */
    volatile private static Singleton instance=null;
    private Singleton() {

    }
    public static Singleton getInstance3()
    {
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
        if (instance == null) {
            synchronized (Singleton.class)
            {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}
