package com.santosh.interviews.abstractions;

public class AbstractExample extends Student {

  protected String test = "test1";
  void abc (){
    System.out.println("xyz");
  }
  static void def(){
    System.out.println("123");
  }
  public static void main(String[] args) {

    Student std=new AbstractExample();
    std.abc();
    std.def();

    System.out.println(std.test);

  }

}
