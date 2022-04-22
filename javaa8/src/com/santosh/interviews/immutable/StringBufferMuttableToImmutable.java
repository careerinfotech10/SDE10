package com.santosh.interviews.immutable;

public class StringBufferMuttableToImmutable {

  public static void main(String[] args) {

    final StringBuffer sb=new StringBuffer("Santosh");
    sb.append(" Engieer");

  sb.append("wow");
    System.out.println(sb.toString());

  }
}
