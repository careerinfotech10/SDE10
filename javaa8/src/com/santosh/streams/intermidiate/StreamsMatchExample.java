package com.santosh.streams.intermidiate;

import com.santosh.data.Student;
import com.santosh.data.StudentDataBase;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StreamsMatchExample {
  static  Predicate<? super Student> isGpaGreatherThan=(x)->x.getGpa()>3.5;
 static public boolean allMatches(){
   return StudentDataBase.getAllStudents().stream()
        .allMatch(isGpaGreatherThan);
  }
  static public boolean anyMatches(){
    return StudentDataBase.getAllStudents().stream()
        .anyMatch(isGpaGreatherThan);
  }
  static public boolean noneMatches(){
    return StudentDataBase.getAllStudents().stream()
        .noneMatch(isGpaGreatherThan);
  }

  static Predicate<? super Integer> isNumberGreaterThanNum=(num)->num>10;
  static  public void anyMatchess()
  {
    List<Integer> integerList = Arrays.asList(1, 2, 3, 5, 6, 7,11);

    boolean b = integerList.stream()
              .anyMatch(isNumberGreaterThanNum);
    integerList.stream().collect(Collectors.toList());
    System.out.println("return : "+b);
  }

  static  public void allMatchess()
  {
    List<Integer> integerList = Arrays.asList(1, 2, 3, 5, 6, 7,11);

    boolean b = integerList.stream()
        .allMatch(isNumberGreaterThanNum);
    System.out.println("return : "+b);
  }

  static  public void noneMatchess()
  {
    List<Integer> integerList = Arrays.asList(19, 2, 3, 5, 6, 7118);

    boolean b = integerList.stream()
        .noneMatch(isNumberGreaterThanNum);
    System.out.println("return : "+b);
  }
  public static void main(String[] args) {
// allMatchess();
    noneMatchess();

//    System.out.println("***** example for allMatches********");
//    System.out.println(allMatches());
//    System.out.println("*****------------------********");
//    System.out.println("***** example for anyMatches********");
//    System.out.println(anyMatches());
//    System.out.println("*****------------------********");
//    System.out.println("***** example for nonMatches********");
//    System.out.println(noneMatches());
//    System.out.println("*****------------------********");
  }
}
