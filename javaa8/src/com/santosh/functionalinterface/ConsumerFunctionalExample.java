package com.santosh.functionalinterface;

import com.santosh.data.Student;
import com.santosh.data.StudentDataBase;
import java.util.List;
import java.util.function.Consumer;
import org.omg.Messaging.SyncScopeHelper;

public class ConsumerFunctionalExample {

 static Consumer<Integer> gunakarVariable=(x)-> System.out.println("mult fo two no "+x*x);

 static List<Student> allStudents = StudentDataBase.getAllStudents();
 static Consumer<Student> c2 = (student) -> System.out.println(student);
 static Consumer<Student> c3 = (student) -> System.out.print(student.getName());
 static Consumer<Student> c4 = (student) -> System.out.println(student.getActivities());




 public static void main(String[] args) {
gunakarVariable.accept(20);
 }
 public static void pritName() {
  allStudents.forEach(c2);
 }
 public static void pritNameAndActivity() {
  allStudents.forEach(c3.andThen(c4));
 }
 public static void pritNameAndActivityUsingCondition() {
  allStudents.forEach(student -> {
   if (student.getGpa() >= 4) {
    c3.andThen(c4).andThen(c2).accept(student);
   }
  });
 }

 static void displyFirstName(Student stud)
 {
  System.out.println("first name "+stud.getName());
 }

 static  void displayLastName(Student stud)
 {
  System.out.println("last name "+stud.getName());
 }
}
