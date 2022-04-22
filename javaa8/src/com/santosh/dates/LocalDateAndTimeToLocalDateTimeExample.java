package com.santosh.dates;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class LocalDateAndTimeToLocalDateTimeExample {
  public static void main(String[] args) {
    LocalDate localDate = LocalDate.now();
    LocalDateTime localDateToLocalDateTimeAddingTime = localDate.atTime(20, 25);
    System.out.println("LocalDate Adding time using atTime "+localDateToLocalDateTimeAddingTime);
    LocalTime localTime = LocalTime.now();
    LocalDateTime covertedLocalTimeToLocalDateTime = localTime.atDate(localDate);
    System.out.println("add date and create "+covertedLocalTimeToLocalDateTime);
    LocalDate convertedLocalDateTimeToLocalDate = covertedLocalTimeToLocalDateTime.toLocalDate();
    System.out.println("LocalDateAndTime To Local Date "+convertedLocalDateTimeToLocalDate);
    LocalTime convertedLocalDateTimeToLocalTime = covertedLocalTimeToLocalDateTime.toLocalTime();
    System.out.println("LocalDateTime to Local Time : "+convertedLocalDateTimeToLocalTime);
  }
}
