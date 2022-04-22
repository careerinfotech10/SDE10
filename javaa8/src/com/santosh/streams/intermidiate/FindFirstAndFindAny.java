package com.santosh.streams.intermidiate;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class FindFirstAndFindAny {

  // Object
  //String
  //Optional
  public static void main(String[] args) {

    String str="test";
    str.chars().forEach(ch-> System.out.println(ch));
//    List<Integer> integerList = Arrays.asList(11, 11, 13, 14,15, 14, 15, 12, 9, 10);
//
//    Optional<Integer> first = integerList
//        .stream()
//        .filter(m -> m >= 9)
//        .findAny();
//    System.out.println(first.get());
  }

}
