package com.santosh.streams.pract.strms.intermidiate;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class SuppliersData {

  static   Supplier<List<Student>> getAllStudents=()-> Arrays.asList(new Student(1L,"santosh",300000),
            new Student(2L,"sagar",600000),
            new Student(3L,"rahul",700000),
            new Student(4L,"vaibhav",400000),
    new Student(5L,"praju",400000));
}
