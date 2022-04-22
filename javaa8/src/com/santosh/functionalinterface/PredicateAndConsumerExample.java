package com.santosh.functionalinterface;

import com.santosh.data.Student;
import com.santosh.data.StudentDataBase;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Predicate;
import javax.print.DocFlavor.STRING;

public class PredicateAndConsumerExample {

  Predicate<Student> p1 = (student) -> student.getGpa() > 3;
  Predicate<Student> p2 = (student) -> student.getGradeLevel() > 3.9;
  BiConsumer<String, List<String>> studentByConsumer = (name, activities) -> System.out
      .println(name + "  : " + activities);
  Consumer<Student> studentConsumer = (student) -> {
    if (p1.and(p2).test(student)) {
      studentByConsumer.accept(student.getName(), student.getActivities());
    }
  };

  public void pringNamesAndActivities(List<Student> allStudents) {

    allStudents.forEach(studentConsumer);


  }

  public static void main(String[] args) {
    List<Student> allStudents = StudentDataBase.getAllStudents();
    new PredicateAndConsumerExample().pringNamesAndActivities(allStudents);
  }
}
