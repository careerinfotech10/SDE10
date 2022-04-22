package com.santosh.functionalinterface;

import com.santosh.data.Student;
import com.santosh.data.StudentDataBase;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class SupplierExample {

  public static void main(String[] args) {
    Supplier<Student> students=()->{
      return new Student("Santosh",4,3.9,"Male", new ArrayList<>());
    };
    System.out.println(students.get());
    Supplier<List<Student>> studentAll=()-> StudentDataBase.getAllStudents();
    System.out.println(studentAll.get());
  }
}
