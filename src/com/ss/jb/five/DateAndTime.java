package com.ss.jb.five;

import java.time.*;
import java.time.temporal.ChronoField;
import java.time.temporal.TemporalAdjusters;
import java.util.Scanner;

public class DateAndTime {
    /*
        Question 1: Which class would you use to store your birthday in years, months, days, seconds, and nanoseconds?

        Answer: LocalDateTime class would be used to store your birthday in years, months, days, seconds and nanoseconds
        LocalDateTime is used to represent a combination of date and time. If a time zone needs to be taken into account
        user could use the ZonedDateTime class which also represents a combo of date and time.

        Question 2: Given a random date, how would you find the date of the previous Thursday?

        Answer: Use temporal adjuster-

        LocalDate date = LocalDate.now();
        date.with(TemporalAdjusters.previous(DayOfWeek.THURSDAY))

        Question 3: What is the difference between a ZoneId and a ZoneOffset?

        Answer: ZoneId is used to describe a time-zone identifier. It also provides
        rules which are used for converting between an Instant and a LocalDateTime.
        ZoneOffset describes a time-zone offset, in other words it describes the amount
        of time by which a time zone differs from UTC/Greenwhich

        Question 4: How would you convert an Instant to a ZonedDateTime? How would you convert a ZonedDateTime to an Instant?

        Answer 4: you can use the Instant.atZone method to convert from Instant to ZonedDateTime-
        ZonedDateTime x= Instant.now().atZone(ZoneId.systemDefault());

        you can use toInstant method in in ChronoZonedDatetime interface to convert from
        ZonedDateTime to Instant-
        Instant inst = ZonedDateTime.now().toInstant();
     */


    public static void main(String [] args){

        Scanner scan = new Scanner(System.in);

        // example 1: for a given year reports length of each month
        System.out.print("Enter year in (yyyy) format: ");
        Integer y = scan.nextInt();
        lengthOfEachMonth(y);

        // example 2: list all mondays in given month from current year
        System.out.print("Enter name of month (i.e. November): ");
        String mon = scan.next();
        mondays(mon.toUpperCase());

        // example 3: test whether a given date occurs on Friday the 13th
        scan = new Scanner (System.in);
        System.out.print("Please enter name of month(i.e. November) followed by a day (i.e. 10 for 10th): ");
        String m=scan.nextLine();
        String[] in= m.split(" ");
        m=in[0];
        Integer day= Integer.parseInt(in[1]);
        friday(m.toUpperCase(), day);


    }
    public static void friday(String m, Integer d){
        Month mont = null;
        LocalDate dat = null;
        try{
            mont = Month.valueOf(m);
            dat = Year.now().atMonth(mont).atDay(d);
        }
        catch(IllegalArgumentException e){
            System.out.println("Invalid Month or Day");
        }


        Boolean occurs = ((d== 13) && (dat.get(ChronoField.DAY_OF_WEEK) == 5));
        if(occurs){
            System.out.println("Given date occurs on friday the 13th");
        }
        else{
            System.out.println("Given date does not occur on friday the 13th");

        }

    }
    public static void mondays(String m){
        Month month = null;
        try {
             month = Month.valueOf(m);
        } catch (IllegalArgumentException e) {
            System.out.println("\nNot a valid month\n");
            e.printStackTrace();
        }
        LocalDate date = Year.now().atMonth(month).atDay(1).with(TemporalAdjusters.firstInMonth(DayOfWeek.MONDAY));
        Month test = date.getMonth();
        Integer count=1;
        // while still in same month
        while (test == month) {
            System.out.println("Monday "+count+": "+date);
            date = date.with(TemporalAdjusters.next(DayOfWeek.MONDAY));
            test = date.getMonth();
            count++;
        }
    }


    public static void lengthOfEachMonth(Integer year){
        try{
            Year chosenY = Year.of(year);
        }
        catch (IllegalArgumentException e){
            System.out.println("Not a valid year");
        }
        for(int month=1;month<=12;month++){
            YearMonth ym= YearMonth.of(year, Month.of(month));
            System.out.print("Month: "+ym+" Length: "+ym.lengthOfMonth()+"\n");
        }

    }
}
