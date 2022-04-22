package com.santosh.streams.intermidiate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlattMapExample {

 public static List<List<Integer>> nestedList = Arrays.asList(Arrays.asList(1, 2), Arrays.asList(3, 4));

  public static void main(String[] args) {

    System.out.println(nestedList);

  }

  public static void nestedArrayListFlatten() {
    nestedList.stream()
        .flatMap(List::stream)
        .collect(Collectors.toList());
  }
}
