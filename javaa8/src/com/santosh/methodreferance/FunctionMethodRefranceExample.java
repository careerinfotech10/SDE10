package com.santosh.methodreferance;

import java.util.function.BiFunction;
import java.util.function.Function;

public class FunctionMethodRefranceExample {
static  Function<String, String>function=String::toUpperCase;

static BiFunction<String,String,String> biFunction=String::concat;

  public static void main(String[] args) {
    System.out.println(function.apply("Santosh Turerao"));

    System.out.println(biFunction.andThen(String::toUpperCase).apply("sagar","rahul"));
  }
}
