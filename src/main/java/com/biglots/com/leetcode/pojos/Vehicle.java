package com.biglots.com.leetcode.pojos;

public abstract class Vehicle {
    public abstract void start();
    public void stop(){
        System.out.println("Vehicle stopped");
    }
}
