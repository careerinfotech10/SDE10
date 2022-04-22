package com.santosh.functionalinterface;

import java.util.Comparator;
import java.util.function.BinaryOperator;

public class BinaryOperatorExample {

 static Comparator<Integer>comparator=(a,b)->a.compareTo(b);

  public static void main(String[] args) {
    BinaryOperator<Integer> binaryOperator=(a,b)->a+b;
    System.out.println("addition : "+binaryOperator.apply(2,4));

    BinaryOperator<Integer> maxBy=BinaryOperator.maxBy(comparator);
    System.out.println("max : "+maxBy.apply(66,2));

    BinaryOperator<Integer> minBy=BinaryOperator.minBy(comparator);
    System.out.println("min : "+minBy.apply(66,2));


  }
}
