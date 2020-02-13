package com.fuadrafid.corejavaapis.datetime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Creation {
    public static void main(String[] args) {
        //All these classes are immutable
        System.out.println(LocalDate.now()); // contains just date
        System.out.println(LocalTime.now()); // contains just time
        System.out.println(LocalDateTime.now()); // contains date and time

        //initialize with any other date than today
        LocalDate date1 = LocalDate.of(2015, Month.JANUARY, 20);

        //initialize with any other time than today
        LocalTime time1 = LocalTime.of(6, 15); // hour and minute
        LocalTime time2 = LocalTime.of(6, 15, 30); // + seconds
        LocalTime time3 = LocalTime.of(6, 15, 30, 200); // + nanoseconds
        System.out.println(time1);
        System.out.println(time2);
        System.out.println(time3);

        //initialize with any other date and time than today
        LocalDateTime dateTime1 = LocalDateTime.of(2015, Month.JANUARY, 20, 6, 15, 30);
        LocalDateTime dateTime2 = LocalDateTime.of(date1, time1);
        System.out.println(dateTime1);
        System.out.println(dateTime2);

        //DateTime classes have private constructors, java forces to use static methods
        //LocalDate d = new LocalDate(); //private

        //be careful not to enter wrong parameter values
        LocalDate.of(2015, Month.JANUARY, 32); // throws DateTimeException


        //Old ways of using date time (Java 1.1, 1.2)

        //today's date time
        Date d= new Date();

        //custom date time
        Calendar c = Calendar.getInstance();
        c.set(2015, Calendar. JANUARY, 1);
        Date jan = c.getTime();

        Calendar gc = new GregorianCalendar(2015, Calendar. JANUARY, 1);
        Date janGc = c.getTime();



    }
}
