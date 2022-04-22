package com.santosh.dates;

import java.time.LocalTime;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;

/**
* hi
* jjjjjj
 *
 *
 *
* jj
* */

public class LocalTimeModifyExample {

  public static void main(String[] args) {
    LocalTime localTime = LocalTime.now();
    System.out.println("minus time :"+localTime.minusHours(20));
    System.out.println("minus ChronoUnit.HOURS :"+localTime.minus(2,ChronoUnit.HOURS));
    System.out.println("LocalTime.MIDNIGHT :"+localTime.with(LocalTime.MIDNIGHT));
    System.out.println("ChronoField.HOUR_OF_DAY,22 :"+localTime.with(ChronoField.HOUR_OF_DAY,12));
    System.out.println("localTime.plusMinutes:"+localTime.plusMinutes(60));




  }

}
