package com.santosh.dates;

import java.time.LocalDateTime;
import java.time.temporal.ChronoField;
import java.time.temporal.TemporalAdjusters;

public class LocalDateTimeModifyExample {

  public static void main(String[] args) {
    LocalDateTime localDateTime = LocalDateTime.now();

    System.out.println("localDateTime: "+localDateTime);
    System.out.println("localDateTime.plusHours(5): "+localDateTime.plusHours(5));
    System.out.println("Using Temporal Adjustor: "+localDateTime.with(TemporalAdjusters.lastDayOfMonth()));
    System.out.println("Using Chrono field: "+localDateTime.with(ChronoField.DAY_OF_MONTH,5));


  }
}
