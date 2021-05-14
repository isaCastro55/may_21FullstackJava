package com.ss.jb.four;

class Singleton {
     volatile private static Singleton instance;
    private Singleton() {

    }
    public static Singleton getInstance3()
    {
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
