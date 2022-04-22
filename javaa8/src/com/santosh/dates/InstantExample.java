package com.santosh.dates;

import java.time.Instant;
import java.time.LocalDateTime;

public class InstantExample {

  public static void main(String[] args) {
    Instant instant = Instant.now();
    LocalDateTime localDateTime = LocalDateTime.now();
//    System.out.println("localDateTime : "+localDateTime);
    System.out.println("instant : "+instant);
  }

}
