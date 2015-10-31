package com.quackslike.me;

/**
 * Hello world!
 *
 */
public class App {
    private String appName;

    public App(String appName){
        System.out.println("Inside Constructor");
        System.out.println(appName);
        this.appName = appName;
    }

    public void greet(){
        System.out.println("Hello " + appName);
    }

    public int square(int numToSquare) {
        System.out.println("Inside square method for " + appName);
        System.out.println("hey " + appName);
        return numToSquare * numToSquare;
    }

    public double sqrt(int numToSqrt) {
        System.out.println("Inside sqrt method for " + appName);
        return Math.sqrt(numToSqrt);
    }

    public int sum(int val1, int val2) {
        return val1 + val2;
    }

}
