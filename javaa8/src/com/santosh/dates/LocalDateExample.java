package com.santosh.dates;

import java.time.LocalDate;
import java.time.ZoneId;
import java.time.temporal.ChronoField;

public class LocalDateExample {

  public static void main(String[] args) {
/*creating different values from dates..
* */
    LocalDate localDate=LocalDate.now();
    LocalDate dateByGivenData = LocalDate.of(2021, 03, 25);
    LocalDate localDateByYearandDayOfYear = LocalDate.ofYearDay(2021,25);
    System.out.println("localDateByYearandDayOfYear: "+localDateByYearandDayOfYear);
    System.out.println("Local Date: "+localDate);
    System.out.println("LocalDate.of() : "+dateByGivenData);

    /*
    get data from locadate.
    * */

    System.out.println("get month :"+localDate.getMonth());
    System.out.println("get month value:"+localDate.getMonthValue());
    System.out.println("get dayof month :"+localDate.getDayOfMonth());
    System.out.println("day pf week:"+localDate.getDayOfWeek());
    System.out.println("info by enum chronfield:"+localDate.get(ChronoField.DAY_OF_MONTH));

  }

}
