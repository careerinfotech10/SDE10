package com.santosh.methodreferance;

import com.santosh.data.Student;
import com.santosh.data.StudentDataBase;
import java.util.function.Consumer;

public class ConsumerMethodReferanceExample {

 static Consumer<Student>consumer= System.out::println;
  public static void main(String[] args) {

    StudentDataBase.getAllStudents().forEach(consumer);
  }
}
