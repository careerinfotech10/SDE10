package com.santosh.functionalinterface;

import com.santosh.data.Student;
import java.util.function.Function;

public class FunctionExample {

 static Function<String,String> fun=(name)->name.toUpperCase();
  static Function<String,String> funAddString=(name)->name.concat(" Default ");


  public static void main(String[] args) {
    System.out.println(fun.andThen(funAddString).apply(" santosh turerao "));
    System.out.println(fun.compose(funAddString).apply(" santosh turerao "));
  }
}
