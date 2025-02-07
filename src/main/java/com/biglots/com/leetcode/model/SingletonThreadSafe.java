package com.biglots.com.leetcode.model;

public class SingletonThreadSafe {

    public static void main(String[] args) {
        Thread threadFirst = new Thread(new ThreadFirst());
        Thread threadSecond = new Thread(new ThreadSecond());
        threadFirst.start();
        threadSecond.start();

    }

    static class ThreadFirst implements Runnable {
        @Override
        public void run() {
            Singleton singleton = Singleton.getInstance("FirstThread");
            System.out.println(singleton.value);
        }
    }

    static class ThreadSecond implements Runnable {
        @Override
        public void run() {
            Singleton singleton = Singleton.getInstance("ThreadSecond");
            System.out.println(singleton.value);
        }
    }
}
