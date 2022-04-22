package com.santosh.interviews.immutable;

import java.util.Arrays;
import java.util.List;

public class Student {

  @Override
  public String toString() {
    return "Student{" +
        "id=" + id +
        ", name='" + name + '\'' +
        ", hobbies=" + hobbies +
        '}';
  }

  private  long id;
  private  String name;
  private  List<String> hobbies;

  public long getId() {
    return id;
  }



  public String getName() {
    return name;
  }


  public List<String> getHobbies() {
    return hobbies;
  }



  public Student() {
  }

  public Student(long id, String name, List<String> hobbies) {
    this.id = id;
    this.name = name;
    this.hobbies = hobbies;
  }

  final public static void main(String[] args) {
    List<String> hobbies = Arrays.asList("cricket", "hocky");
    Student student=new Student(1,"santosh",hobbies );

    System.out.println(student +" hash "+student.hashCode());

    System.out.println(student+"has "+student.hashCode());
  }
}
