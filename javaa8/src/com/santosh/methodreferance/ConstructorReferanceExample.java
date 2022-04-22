package com.santosh.methodreferance;

import com.santosh.data.Student;
import java.util.function.Function;
import java.util.function.Supplier;

public class ConstructorReferanceExample {
static  Supplier<Student> student=Student::new;
static  Function<String ,Student> studentFunction=Student::new;
  public static void main(String[] args) {
    System.out.println(student.get());
    System.out.println(studentFunction.apply("ABC"));
  }
}
