package com.santosh.methodreferance;

import com.santosh.methodreferance.util.Pen;

public class MethodReferanceExample {

  public MethodReferanceExample() {

    System.out.println("This is a Constructor");
  }

  public static void main(String[] args) {

    Pen pen=()-> System.out.println("this is default pen method msgs ");

//    MethodReferanceExample mr=new MethodReferanceExample();

    //instance referance
//    Pen pen1=mr::bookWrite;
//    pen1.write();

    //static referance
    Pen pen2=MethodReferanceExample::printBook;
//    pen2.write();

//constructor referance
    Pen  pen3=MethodReferanceExample::new;
    pen3.write();
  }

  void bookWrite(){
    System.out.println("hi this is book writing method");
  }
static void printBook(){
  System.out.println("Print Book");
}


}
