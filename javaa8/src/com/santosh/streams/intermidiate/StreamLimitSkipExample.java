package com.santosh.streams.intermidiate;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.BinaryOperator;

public class StreamLimitSkipExample {

  public static void main(String[] args) {
    List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
    System.out.println("***** example for limit********");
    limitExample(integers).ifPresent(System.out::println);
    System.out.println("*****------------------********");

    System.out.println("***** example for skip********");
    skipExample(integers).ifPresent(System.out::println);
    System.out.println("*****------------------********");

  }
  static BinaryOperator<Integer> sumOfNumbers=(x,y)->x+y;
  static long limitForSumOfNumbers=3;
  public static Optional<Integer> limitExample(List<Integer> integers)
  {
    return integers.stream().limit(limitForSumOfNumbers).reduce(sumOfNumbers);
  }
  public static  Optional<Integer> skipExample(List<Integer> integers)
  {
    return integers.stream().skip(limitForSumOfNumbers).reduce(sumOfNumbers);
  }
}
