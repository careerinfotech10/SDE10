package com.santosh.streams.intermidiate;

import static java.util.stream.Collectors.toList;
import static java.util.stream.Collectors.toSet;

import com.santosh.data.Student;
import com.santosh.data.StudentDataBase;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamsFlatMapedExample {


  private  static  void printStream()
  {
    Set<String> collect = StudentDataBase.getAllStudents().stream()
        .map(Student::getActivities)
        .flatMap(List::stream)
        .collect(toSet());
    System.out.println(collect);
  }

  private static void printList()
  {
    StudentDataBase.getAllStudents().stream()
        .map(Student::getActivities)
        .flatMap(List::stream)
        .distinct()
        .sorted()
        .collect(Collectors.toList()).forEach(System.out::println);
  }
  public static void main(String[] args) {
//printStream();
    printList();
  }
}
