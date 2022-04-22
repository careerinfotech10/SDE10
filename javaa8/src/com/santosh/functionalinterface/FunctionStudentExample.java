package com.santosh.functionalinterface;

import com.santosh.data.Student;
import com.santosh.data.StudentDataBase;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
public class FunctionStudentExample {
  static Function<List<Student>, Map<String, Double>> studentFunction = (students) ->
  {
    Map<String, Double> studentMap = new HashMap<>();
    students.forEach(student -> {
      studentMap.put(student.getName(), student.getGpa());
    });
    return studentMap;
  };
  public static void main(String[] args) {
    List<String > fullName=new ArrayList<>();
    StudentDataBase.getAllStudents().forEach(
payer->{

 fullName.add(payer.getBike()+"("+payer.getName()+")");

  }
    );
    System.out.println(studentFunction.apply(StudentDataBase.getAllStudents()));
  }
}

