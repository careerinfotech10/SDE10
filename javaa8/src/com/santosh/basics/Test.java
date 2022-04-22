package com.santosh.basics;

public class Test {

  public static void main(String[] args) {

String s="santosh";

long count=s.chars().filter(ch->ch=='a'||ch=='i'||ch=='o'||ch=='u')
    .count();

    System.out.println(count);
  }

}
