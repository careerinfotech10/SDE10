package com.santosh.streams.terminal;

import static java.util.stream.Collectors.counting;

import com.santosh.data.Student;
import com.santosh.data.StudentDataBase;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class CountingExample {

  static public  Long count()
  {
    Predicate<? super Student> gpaGreaterThan=(student)->student.getGpa()>3.5;
    return StudentDataBase.getAllStudents()
        .stream()
       .filter(gpaGreaterThan)
        .collect(counting());
  }

  public static void main(String[] args) {
    System.out.println("count : "+count());
  }

}
