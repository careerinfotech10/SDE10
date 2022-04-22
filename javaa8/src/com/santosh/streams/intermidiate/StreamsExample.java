package com.santosh.streams.intermidiate;

import com.santosh.data.Student;
import com.santosh.data.StudentDataBase;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StreamsExample {
  static Predicate<Student> studentPredicate =(student -> student.getGpa()>=3);
  static Predicate<Student> studentgpaPredicate =(student -> student.getGpa()>=3.9);
  public static void main(String[] args) {
    Map<String, List<String>> studentsMap = StudentDataBase.getAllStudents()
        .stream()
        .filter(studentPredicate)
        .filter(studentgpaPredicate)
        .collect(Collectors.toMap(Student::getName, Student::getActivities));
    System.out.println(studentsMap);
    List<Entry<String, List<String>>> collect = studentsMap.entrySet().stream()
        .collect(Collectors.toList());
         System.out.println(collect);


  }

}
