package com.santosh.streams.terminal;

import static java.util.stream.Collectors.joining;

import com.santosh.data.Student;
import com.santosh.data.StudentDataBase;
import java.util.stream.Collectors;

public class JoiningExample {
  static  public String joining_1(){
   return StudentDataBase.getAllStudents().stream()
        .map(Student::getName)
        .collect(joining());
  }
  static  public String joiningWithDilimiter(){
    return StudentDataBase.getAllStudents().stream()
        .map(Student::getName)
        .collect(joining("~"));
  }

  static  public String joiningWithDilimiterAndPrefixAndSuffix(){
    return StudentDataBase.getAllStudents().stream()
        .map(Student::getName)
        .collect(joining("~","(",")"));
  }
  public static void main(String[] args) {
    System.out.println("joining"+joining_1());
    System.out.println("joining with dilimter "+joiningWithDilimiter());
    System.out.println("joining with dilimter with prefix and suffix"+joiningWithDilimiterAndPrefixAndSuffix());
  }

}
