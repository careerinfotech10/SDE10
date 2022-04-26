package com.santosh.functionalinterface.practfunctions;

import java.util.function.Function;

public class FunctionsExample1 {


     static       Function<String,String> toUpperString=(str)-> str.toUpperCase();

     static   Function<String,String> concanateOperations=(str)->str.concat("Turerao");

    public static void main(String[] args) {


        String name="santosh";
        String lastname="turerao";

      String upperName=  toUpperString.compose(concanateOperations).apply(name);


        System.out.println(upperName);

    }
}
