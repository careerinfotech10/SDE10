package com.santosh.streams.intermidiate;

import com.santosh.streams.intermidiate.util.Emp;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapExample {
 static List<List<Integer>> numbersList = Arrays
      .asList(Arrays.asList(1, 2), Arrays.asList(3, 4), Arrays.asList(5, 6));
  static  List<Emp> empList = Arrays.asList(
            new Emp(1L, "Omkar"),
            new Emp(2L, "Santosh"),
            new Emp(3L, "Sagar"),
            new Emp(4L, "Sonali"),
            new Emp(5L, "Shreya"));
  public static void main(String[] args) {
    System.out.println(empList);
    List<String> namesList = empList.stream()
        .map(Emp::getName)
        .collect(Collectors.toList());
    System.out.println(namesList);

    //flatMap Example


    //[[1, 2], [3, 4], [5, 6]]
    //[1,2,3,4,5,6]
    System.out.println("nested number :: "+numbersList);

    List<Integer> integerList = numbersList.stream()
        .flatMap(List::stream)
        .collect(Collectors.toList());
    System.out.println("Flatten Map "+integerList);




  }

}
