package com.biglots.com.leetcode.model;

public class LeetcodeModel {

    public static void main(String[] args) {


        Singleton singleton = Singleton.getInstance("FOO");
        Singleton anotherSingleton = Singleton.getInstance("BAR");
        System.out.println(singleton.value);
        System.out.println(anotherSingleton.value);
    }
}
