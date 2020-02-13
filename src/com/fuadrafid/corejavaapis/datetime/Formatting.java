package com.fuadrafid.corejavaapis.datetime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class Formatting {
    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2020, Month.JANUARY, 20);
        System.out.println(date.getDayOfWeek()); // MONDAY
        System.out.println(date.getMonth()); // JANUARY
        System.out.println(date.getYear()); // 2020
        System.out.println(date.getDayOfYear()); // 20


        //Formatting the date time
        date = LocalDate.of(2020, Month.JANUARY, 20);
        LocalTime time = LocalTime.of(11, 12, 34);
        LocalDateTime dateTime = LocalDateTime.of(date, time);
        System.out.println(date.format(DateTimeFormatter.ISO_LOCAL_DATE));
        System.out.println(time.format(DateTimeFormatter.ISO_LOCAL_TIME));
        System.out.println(dateTime.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME));


        DateTimeFormatter shortDateTime = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);

        //via formatter
        System.out.println(shortDateTime.format(dateTime)); // 1/20/20
        System.out.println(shortDateTime.format(date)); // 1/20/20
       //System.out.println(shortDateTime.format(time)); // UnsupportedTemporalTypeException, cannot format time to data

        //via date time object
        System.out.println(dateTime.format(shortDateTime));
        System.out.println(date.format(shortDateTime));
        //System.out.println(time.format(shortDateTime));

        //different default date formats
        date = LocalDate.of(2020, Month.JANUARY, 20);
        time = LocalTime.of(11, 12, 34);
        dateTime = LocalDateTime.of(date, time);
        DateTimeFormatter shortF = DateTimeFormatter
                .ofLocalizedDateTime(FormatStyle.SHORT);
        DateTimeFormatter mediumF = DateTimeFormatter
                .ofLocalizedDateTime(FormatStyle.MEDIUM);
        System.out.println(shortF.format(dateTime)); // 1/20/20 11:12 AM
        System.out.println(mediumF.format(dateTime)); // Jan 20, 2020 11:12:34 AM

        //custom date time format
        DateTimeFormatter customDateTimeFormat = DateTimeFormatter.ofPattern("MMMM dd, yyyy, hh:mm");
        System.out.println(dateTime.format(customDateTimeFormat)); // January 20, 2020, 11:12

        DateTimeFormatter customDateFormat = DateTimeFormatter.ofPattern("MMMM dd, yyyy");
        System.out.println(date.format(customDateFormat)); // January 20, 2020

        DateTimeFormatter customTimeFormat = DateTimeFormatter.ofPattern("hh:mm");
        System.out.println(time.format(customTimeFormat)); // 11:12

        //Also, can use parse method to get date time object from string
        DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("MM dd yyyy");
        date = LocalDate.parse("01 02 2015", dateFormat);
        time = LocalTime.parse("11:22");
        System.out.println(date); // 2015-01-02
        System.out.println(time); // 11:22

        StringBuilder puzzle = new StringBuilder("Java");
        System.out.println(puzzle);


    }

}
