package com.santosh.streams.intermidiate;

import com.santosh.data.Student;
import com.santosh.data.StudentDataBase;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StreamsFilterExample {

  public  static  List<Student> filterStudentByGPA(){
    return StudentDataBase.getAllStudents().stream().filter(student -> student.getGpa()>=4)        .collect(Collectors.toList());
  }
  public static void main(String[] args) {

    filterStudentByGPA().forEach(System.out::println);
  }
}
