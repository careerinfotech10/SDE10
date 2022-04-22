package com.santosh.streams.intermidiate;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LimitAndSkipExample {

  public static void main(String[] args) {
    List<Integer> integerList = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

    List<Integer> integerList1 = integerList.stream()
        .limit(5)
        .collect(Collectors.toList());


  }

}
