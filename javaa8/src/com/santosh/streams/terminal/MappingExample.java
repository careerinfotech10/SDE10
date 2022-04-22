package com.santosh.streams.terminal;

import static java.util.stream.Collectors.toList;

import com.santosh.data.Student;
import com.santosh.data.StudentDataBase;
import java.util.List;
import java.util.stream.Collectors;

public class MappingExample {

  public static List<String> mappings()
  {
   return StudentDataBase.getAllStudents()
        .stream()
        .collect(Collectors.mapping(Student::getName,toList()));
  }
  public static void main(String[] args) {
    System.out.println(mappings());
  }

}
