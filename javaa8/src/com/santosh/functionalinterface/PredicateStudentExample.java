package com.santosh.functionalinterface;

import com.santosh.data.Student;
import com.santosh.data.StudentDataBase;
import java.util.List;
import java.util.function.Predicate;

public class PredicateStudentExample {

  static Predicate<Student> p1=(student) -> student.getGradeLevel()>=3;
  static Predicate<Student> p2=(student) -> student.getGpa()>=3.9;


  public  static  void filterStudentByGradeLevel()
  {
    List<Student> allStudents = StudentDataBase.getAllStudents();

    allStudents.forEach(student -> {
      if (p1.test(student))
      {
        System.out.println(student);
      }
    });
  }

  public  static  void filterStudentByGPA()
  {
    List<Student> allStudents = StudentDataBase.getAllStudents();

    allStudents.forEach(student -> {
      if (p2.test(student))
      {
        System.out.println(student);
      }
    });
  }

  public  static  void filterStudentByGPAAndGradeLevel()
  {
    List<Student> allStudents = StudentDataBase.getAllStudents();

    allStudents.forEach(student -> {
      if (p2.or(p1).negate().test(student))
      {
        System.out.println(student);
      }
    });
  }
  public static void main(String[] args) {
    System.out.println("****** Grade Level Student ********");
//    filterStudentByGradeLevel();
    System.out.println("\n\n -------------------------------------------\n\n ************GPA Level Students *************");
//    filterStudentByGPA();
    System.out.println("************************");
    filterStudentByGPAAndGradeLevel();
  }
}
