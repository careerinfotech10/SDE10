package com.santosh.dates;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;

public class DateExample {

  public static void main(String[] args) {

    String startDate="21/04/2020";
    String endDate="21/05/2020";

    DateTimeFormatter formatter=DateTimeFormatter.ofPattern("dd/MM/yyyy");

    LocalDate startD=LocalDate.parse(startDate,formatter);
    LocalDate endD=LocalDate.parse(endDate,formatter);

    LocalDate date = endD.minusMonths(startD.getDayOfMonth());
    System.out.println(date);
  }
}
