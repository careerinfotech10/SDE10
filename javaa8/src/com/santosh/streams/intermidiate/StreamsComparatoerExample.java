package com.santosh.streams.intermidiate;

import com.santosh.data.Student;
import com.santosh.data.StudentDataBase;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StreamsComparatoerExample {

  public  static List<Student> sortStudentByName()
  {
    Predicate<Student> predicateGPALevel=(student)->student.getGradeLevel()>=3;
    return  StudentDataBase.getAllStudents().stream()
        .sorted(Comparator.comparing(Student::getName))
          .distinct()
          .filter(predicateGPALevel)
          .collect(Collectors.toList());
  }

  public static void main(String[] args) {
    sortStudentByName().forEach(System.out::println);
    System.out.println("hi how are you dear !!!!!");
  }
}
