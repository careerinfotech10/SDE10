package com.santosh.dates;

import java.time.LocalDate;

public class LocalDateAdditionalSupportExample {

  public static void main(String[] args) {
    LocalDate localDate = LocalDate.now();
    System.out.println("Leap Year "+localDate.isLeapYear());
  }
}
