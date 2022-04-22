package com.santosh.streams.intermidiate;

import java.util.Arrays;
import java.util.List;

public class LiminSkipExample {

  public static void main(String[] args) {
    List<Integer> integerList = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
    integerList.stream()
        .filter(x->x>=9)
        .limit(2);
  }

}
