package com.santosh.dates;

import java.time.LocalDate;
import java.time.Period;

public class ComparingDateUsingPeriod {
  public static void main(String[] args) {
    LocalDate startDate = LocalDate.of(1988, 07, 17);
    LocalDate endtDate = LocalDate.of(2021, 3, 31);
    Period comparedDate = startDate.until(endtDate);
    System.out.println("comparing between days"+comparedDate.getDays());
    System.out.println("comparing between months "+comparedDate.getMonths());
    System.out.println("comparing between getYears()"+comparedDate.getYears());
    Period ofYears = Period.ofYears(5);
    System.out.println("getting no of years : "+ofYears.toTotalMonths());
    Period between = Period.between(startDate, endtDate);
    System.out.println(between.getYears()+"-"+between.getMonths()+"-"+between.getDays());
  }

}
