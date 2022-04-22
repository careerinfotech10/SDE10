package com.santosh.dates;

import java.time.LocalDate;

public class ParseAndFormatterExample {


  public static void main(String[] args) {
    System.out.println("This is a good ...");
    String str="2021-12-19";
    parseDate(str);



  }

  public  static void parseDate(String date)
  {
    LocalDate localDate = LocalDate.parse(date);

    System.out.println(localDate);
  }

}
