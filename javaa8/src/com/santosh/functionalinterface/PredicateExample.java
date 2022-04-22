package com.santosh.functionalinterface;

import java.util.function.Predicate;

public class PredicateExample {
 static Predicate<Integer> p=(k)->k%2==0;
  static Predicate<Integer> p1=(k)->k%5==0;
  static Predicate<Integer> p2=(k)->k%10==0;


  public static void predicateAnd(Integer no)
  {
    System.out.println("And :"+p.and(p1).and(p2).test(no));
  }

  public static void predicateOr(Integer no)
  {
    System.out.println("OR  :"+p.or(p1).or(p2).test(no));
  }
  public static void predicateNegate(Integer no)
  {
    System.out.println("Negate : "+p.or(p1).or(p2).negate().test(no));
  }
  public static void main(String[] args) {
    predicateOr(25);
    predicateAnd(20);
    predicateNegate(10);
  }

}
