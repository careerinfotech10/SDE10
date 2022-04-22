package com.santosh.lambdas;

import java.util.Comparator;

public class ComparatorLambdaExample {

  public static void main(String[] args) {
    Comparator<Integer> comparator=new Comparator<Integer>() {
      @Override
      public int compare(Integer o1, Integer o2) {
        return 0;
      }
    };
  }

}
