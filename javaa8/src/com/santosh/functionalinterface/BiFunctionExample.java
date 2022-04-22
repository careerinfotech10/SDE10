package com.santosh.functionalinterface;

import com.santosh.data.Student;
import com.santosh.data.StudentDataBase;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Predicate;

public class BiFunctionExample {

  static BiFunction<List<Student>, Predicate<Student>, Map<String, Double>> biFunction = (students, predicate) -> {
    Map<String, Double> studentsMap=new HashMap<>();

    students.forEach(student -> {
      if(predicate.test(student))
      {
        studentsMap.put(student.getName(),student.getGpa());
      }

    });
    return studentsMap;
  };

  public static void main(String[] args) {
    System.out.println(biFunction.apply(StudentDataBase.getAllStudents(),PredicateStudentExample.p2));
  }
}
