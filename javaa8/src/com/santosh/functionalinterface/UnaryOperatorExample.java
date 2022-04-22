package com.santosh.functionalinterface;

import java.util.function.UnaryOperator;

public class UnaryOperatorExample {

  static UnaryOperator<String> unaryOperator=(s)->s.concat("Default Is there ");
  public static void main(String[] args) {

    System.out.println(unaryOperator.apply("santosh"));

  }

}
