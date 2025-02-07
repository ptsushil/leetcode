package com.biglots.com.leetcode.model;

public class Singleton {

    private static Singleton instance;
    public String value;
    private Singleton(String value)
    {
       /* try {
            Thread.sleep(1000);
        }catch (InterruptedException ex){
            ex.printStackTrace();
        }*/
        this.value = value;
    }
    public static Singleton getInstance(String value) {
        if (instance == null){
            instance = new Singleton(value);
        }
        return instance;
    }

    public static Singleton getThreadSafeInstance(String value) {

        Singleton result = instance;
        if (result != null){
            return result;
        }
        synchronized (Singleton.class){
            if(instance == null) {
                instance = new Singleton(value);
            }
            return instance;
        }
    }
}
