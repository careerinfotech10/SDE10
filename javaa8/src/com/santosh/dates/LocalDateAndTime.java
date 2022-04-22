package com.santosh.dates;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoField;

public class LocalDateAndTime {

  public static void main(String[] args) {
    //create new local date time  instance
    LocalDateTime dateTime = LocalDateTime.now();
    System.out.println("This is a good quality training..."+dateTime);
    LocalDateTime localDateTime = LocalDateTime.of(2020, 12, 22, 22, 22, 22);
    System.out.println(localDateTime);
    LocalDateTime localDateTime1 = LocalDateTime.of(LocalDate.now(), LocalTime.now());
    System.out.println(localDateTime1);
 //get values from date time instances.
    System.out.println(localDateTime1.getMonth()+" "+localDateTime1.getHour());
    System.out.println(localDateTime1.get(ChronoField.HOUR_OF_DAY));
  }

}
