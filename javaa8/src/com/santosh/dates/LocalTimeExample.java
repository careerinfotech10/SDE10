package com.santosh.dates;

import java.time.LocalTime;
import java.time.temporal.ChronoField;

public class LocalTimeExample {

  public static void main(String[] args) {
    LocalTime localTime = LocalTime.now();
    System.out.println("Local Time : "+localTime);
    LocalTime localTime1 = LocalTime.of(22, 12, 22);
    System.out.println("local time "+localTime1);
//getting values from local time instance
    System.out.println("local hour : "+localTime.getHour());
    System.out.println("local minute : "+localTime.getMinute());
    System.out.println("ChronoField.HOUR_OF_DAY : "+localTime.get(ChronoField.HOUR_OF_DAY));
    System.out.println("ChronoField.CLOCK_HOUR_OF_DAY : "+localTime.get(ChronoField.CLOCK_HOUR_OF_DAY));
    System.out.println("localTime.toSecondOfDay() : "+localTime.toSecondOfDay());
  }
}
