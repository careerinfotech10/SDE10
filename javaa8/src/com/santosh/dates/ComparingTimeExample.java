package com.santosh.dates;

import java.time.Duration;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class ComparingTimeExample {

  public static void main(String[] args) {
    System.out.println("This is a greate...");

    LocalTime localTime = LocalTime.now();
    LocalTime localTime1 = LocalTime.of(15,10,10);

    long minutes = localTime.until(localTime1, ChronoUnit.MINUTES);
    System.out.println(minutes);

    Duration between = Duration.between(localTime, localTime1);
    System.out.println(between.toMinutes());
    System.out.println(between.toDays());
  }
}
