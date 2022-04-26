package com.santosh.lambdas;

public class SimpleLambdaExample {

    public static void main(String[] args) {
        Runnable welcome = () -> System.out.println("welcome");
        welcome.run();
    }
}
