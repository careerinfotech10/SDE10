package com.santosh.streams.intermidiate;

import com.santosh.data.Student;
import com.santosh.data.StudentDataBase;
import java.util.Optional;
import java.util.function.Predicate;

public class FindFirstAndFindAnyExample {

 static Predicate<? super Student> studentGpaGreaterThan=(student)->student.getGpa()>3.9;
 static public Optional<Student> findAnyAndFindFirst()
  {
   return  StudentDataBase.getAllStudents().stream()
        .filter(studentGpaGreaterThan)
        .findFirst();
  }


  public static void main(String[] args) {
    if(findAnyAndFindFirst().isPresent()){
      System.out.println("student found"+findAnyAndFindFirst().get());
    }
    else
    {
      System.out.println("student is not found...");
    }

  }

}
