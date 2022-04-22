package com.santosh.streams.intermidiate;

import com.santosh.data.Student;
import com.santosh.data.StudentDataBase;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.IntBinaryOperator;
import java.util.function.ToIntFunction;

public class StreamReduceExample {

  public  static int perFormMulti(List<Integer> integers)
  {
 return integers.stream().reduce(1,(a,b)->a*b);
  }

  public  static Optional<Integer> perFormMultiEithoutIdentity(List<Integer> integers)
  {
    return integers.stream().reduce((a,b)->a*b);
  }
  public static Optional<com.santosh.data.Student> getHighestGPAStudentCount()
  {
  return  StudentDataBase.getAllStudents().stream()
        .reduce((s1,s2)->s1.getGpa()>s2.getGpa()?s1:s2);
  }
  public static void main(String[] args) {
    List<Integer> integers = Arrays.asList(1, 2, 3, 4,10);
    List<Double> doubles = Arrays.asList(1.1, 2.0, 3.8, 4.0, 10.8);
    Double aDouble = doubles.stream().reduce((a, b) -> a * b).get();
    System.out.println("md: "+aDouble);
//    System.out.println(perFormMulti(integers));
    ToIntFunction<? super Integer> fun;
    integers.stream().mapToInt(i->i);
    IntBinaryOperator op=(a,b)->a*b;
    integers.stream().mapToInt(Integer::intValue).reduce(op);
    integers.stream().reduce(Integer::sum);
    System.out.println(perFormMultiEithoutIdentity(integers));

    Optional<Student> highestGPAStudentCount = getHighestGPAStudentCount();
    if(highestGPAStudentCount.isPresent()){
      System.out.println("gpa : "+highestGPAStudentCount.get());
    }

  }
}
