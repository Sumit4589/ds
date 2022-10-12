package com.sam.time;


import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.time.temporal.Temporal;

public class TimeTest {
  public static void main(String[] args) throws InterruptedException {
    //Instant,Duration for comparing machine
    Instant old = Instant.now();
    System.out.println(old);
    Thread.sleep(1000);
    Instant ne = Instant.now();
    System.out.println(Duration.between(old,ne).toMillis());

    //for human time
    LocalDate localDate = LocalDate.now();
    System.out.println(localDate);
    LocalDate nextYear = localDate.plusYears(1);
    System.out.println(nextYear);
    System.out.println(localDate.until(nextYear, ChronoUnit.DAYS));

    LocalTime localTime = LocalTime.now();
    System.out.println(localTime);
    LocalDateTime localDateTime = LocalDateTime.now();
    System.out.println(localDateTime);

    ZonedDateTime zonedDateTime = ZonedDateTime.now(ZoneId.of("UTC"));
    System.out.println(zonedDateTime);
    System.out.println(ZonedDateTime.parse("1969-07-16 03:32:00-0400",DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ssxx")));
  }
}
