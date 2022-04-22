package com.santosh.dates;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class ZoneDateTimeExample {
  private static final String MM_DD_YYYY_HHMMSS = "MM-dd-yyyy-hhmmss";
  private static final String AMERICA_NEW_YORK = "America/New_York";
  public static void main(String[] args) throws ParseException {
//    ZoneId zoneId = ZoneId.of("Asia/Calcutta");
//
//    DateTimeFormatter formatter=DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
//    ZonedDateTime zonedDateTime = ZonedDateTime.parse("2021-09-22 06:22:51");
//    System.out.println("zonedDateTime"+zonedDateTime);
//    System.out.println("getOffset"+zonedDateTime.getOffset());
//    System.out.println(zonedDateTime.getZone());
//    System.out.println(zoneId);
//    System.out.println(ZoneId.getAvailableZoneIds());
//    System.out.println("Chicago CST : "+ZonedDateTime.now(ZoneId.of("America/Chicago")));
//    System.out.println("Detroit EST: "+ZonedDateTime.now(ZoneId.of("America/Detroit")));
//    System.out.println("LA PST : "+ZonedDateTime.now(ZoneId.of("America/Los_Angeles")));
//    System.out.println("Denver MST: "+ZonedDateTime.now(ZoneId.of("America/Denver")));
    DateFormat dateFormat = new SimpleDateFormat(MM_DD_YYYY_HHMMSS);
    String date="09-29-2021-150000";
    Date parse = dateFormat.parse(date);
    String newYorkDateTime = new ZoneDateTimeExample().dateFormate(parse, AMERICA_NEW_YORK);
    System.out.println("new York :: "+newYorkDateTime);
  }


  private String dateFormate(Date date, String zoneIdStr) throws ParseException {
    if (date == null) {
      return "";
    }
    ZonedDateTime zonedDateTime = ZonedDateTime.ofInstant(date.toInstant(), ZoneId.of(zoneIdStr));
    DateTimeFormatter formatter=DateTimeFormatter.ofPattern(MM_DD_YYYY_HHMMSS);
    return zonedDateTime.format(formatter);
  }
}
