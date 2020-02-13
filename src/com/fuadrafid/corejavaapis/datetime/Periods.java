package com.fuadrafid.corejavaapis.datetime;

import java.time.*;

public class Periods {
    public static void main(String[] args) {
        LocalDate start = LocalDate.of(2015, Month.JANUARY, 1);
        LocalDate end = LocalDate.of(2015, Month.MARCH, 30);
        Period period = Period.ofMonths(1); // create a period
        performAnimalEnrichment(start, end, period);

        //Cannot use period with every date time object, it depends on the type
        LocalDate date = LocalDate.of(2015, 1, 20);
        LocalTime time = LocalTime.of(6, 15);
        LocalDateTime dateTime = LocalDateTime.of(date, time);
        period = Period.ofMonths(1);
        System.out.println(date.plus(period)); // 2015-02-20
        System.out.println(dateTime.plus(period)); // 2015-02-20T06:15
        System.out.println(time.plus(period)); // UnsupportedTemporalTypeException
    }

    private static void performAnimalEnrichment(LocalDate start, LocalDate end,
                                                Period period) { // uses the generic period
        LocalDate upTo = start;
        while (upTo.isBefore(end)) {
            System.out.println("give new toy: " + upTo);
            upTo = upTo.plus(period); // adds the period
        }}
}
