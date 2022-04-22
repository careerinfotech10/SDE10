package com.santosh.streams.intermidiate;

import com.santosh.streams.intermidiate.util.Calculatr;

public class MethodReferanceExample {

  public static void main(String[] args) {

    Calculatr cal=()->System.out.println("Addition Method Exwcutes");
    MethodReferanceExample mr=new MethodReferanceExample();
      cal = mr::show;
      cal.add();


  }

  public void show(){
    System.out.println("Show Methods !!!! ");
  }
}
