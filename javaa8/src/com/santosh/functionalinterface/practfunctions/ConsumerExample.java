package com.santosh.functionalinterface.practfunctions;

import java.util.function.Consumer;

public class ConsumerExample {

    static Consumer<String> printData=(str)-> System.out.println(str);
    static  Consumer<String> makeUpper=(str)->str.toUpperCase();
    public static void main(String[] args) {

        printData.andThen(makeUpper).accept("Santosh");
    }
}
