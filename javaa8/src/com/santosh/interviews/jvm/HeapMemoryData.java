package com.santosh.interviews.jvm;

import java.lang.reflect.Method;

public class HeapMemoryData {

  public static void main(String[] args) {

    Student s=new Student();

    Class aClass = s.getClass();
    Method[] methods = aClass.getMethods();

    for (Method m:methods){
      System.out.println("method names :: "+m.getName());
    }

    Student s2=new Student();
    Class<? extends Student> aClass1 = s2.getClass();
    Method[] methods1 = aClass1.getMethods();

    System.out.println(aClass.hashCode()==aClass1.hashCode());

  }


}
