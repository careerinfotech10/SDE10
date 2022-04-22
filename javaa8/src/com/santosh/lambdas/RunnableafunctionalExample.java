package com.santosh.lambdas;

public class RunnableafunctionalExample {

  public static void main(String[] args) {

    Runnable runnable=new Runnable() {
      @Override
      public void run() {
        System.out.println("hello");
      }
    };
    new Thread(runnable).start();

  }


}
