package com.santosh.dates;

import java.time.LocalDate;
import java.time.ZoneId;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;

public class LocalDateModifyingExample {

  public static void main(String[] args) {
    /*
     * Modifying dates.
     * */
    LocalDate localDate = LocalDate.now();
    System.out.println("added two days : "+localDate.plusDays(2));
    System.out.println("with years : "+localDate.withYear(2015));
    System.out.println("at start of the day: "+localDate.atStartOfDay());
    System.out.println("at start of the day: "+localDate.atStartOfDay(ZoneId.systemDefault()));
    System.out.println("with ChoronoField : "+localDate.with(ChronoField.YEAR,2021));
    System.out.println("with last day : "+localDate.with(TemporalAdjusters.lastDayOfMonth()));
    System.out.println("with first day : "+localDate.with(TemporalAdjusters.firstDayOfMonth()));
    System.out.println("chronounit minus: "+localDate.minus(1, ChronoUnit.YEARS));


  }
}
