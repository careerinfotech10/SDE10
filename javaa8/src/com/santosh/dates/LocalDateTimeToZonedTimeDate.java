package com.santosh.dates;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.util.Date;

public class LocalDateTimeToZonedTimeDate {

  public static void main(String[] args) {
    LocalDateTime localDateTime = LocalDateTime.now();
    //Local DateTime to ZonedDateTime Conversion...
    ZonedDateTime zonedDateTime = localDateTime.atZone(ZoneId.of("America/Chicago"));
    System.out.println("LocalDateTime : "+localDateTime);
    System.out.println("zonedDateTime : "+zonedDateTime);
    ZonedDateTime zonedDateTime1 = Instant.now().atZone(ZoneId.of("America/Detroit"));
    System.out.println("zonedDateTime1: "+zonedDateTime1);
    OffsetDateTime offsetDateTime = localDateTime.atOffset(ZoneOffset.ofHours(-6));
    System.out.println("offsetDateTime : "+offsetDateTime);
    Date date = new Date();
    System.out.println("date : "+date);
    LocalDateTime localDateTime1 = date.toInstant().atZone(ZoneId.of("America/Detroit"))
        .toLocalDateTime();
    System.out.println("localDateTime1 : "+localDateTime1);

//    new Date().from(localDateTime1.toLocalTime());
  }
}
