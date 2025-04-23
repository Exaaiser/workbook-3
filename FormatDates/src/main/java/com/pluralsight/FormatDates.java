package com.pluralsight;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class FormatDates {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();

        americanSystem(now);
        euSystem(now);
        System.out.println(americanSystemMonth(now));
        daySystem();
        clockSystem(now);
        detailSystem(now);
    }
    //shows American calendar system pattern    static void americanSystem
    static void americanSystem(LocalDateTime now) {
        DateTimeFormatter americanSystem1 = DateTimeFormatter.ofPattern("MM-dd-yyyy");
        System.out.println(now.format(americanSystem1));
    }
//shows European calendar system pattern
    static void euSystem(LocalDateTime now) {
        DateTimeFormatter euSystem1 = DateTimeFormatter.ofPattern("yyyy/MM/dd");
        System.out.println(now.format(euSystem1));
    }
    //shows American calendar system pattern while spelling out the month
    static String americanSystemMonth(LocalDateTime now) {
        DateTimeFormatter americanSystem2 = DateTimeFormatter.ofPattern("MMMM dd, yyyy");
        return americanSystem2.format(now);
    }
    //shows American calendar system pattern with emphasis on day of the week
    static void daySystem() {
        DateTimeFormatter daySystem1 = DateTimeFormatter.ofPattern("EEEE, MMM d, yyyy");
        LocalDateTime now = LocalDateTime.now();
        System.out.println(now.format(daySystem1));
    }
    // displays local time zone
    static void clockSystem(LocalDateTime now) {
        DateTimeFormatter clockSystem1 = DateTimeFormatter.ofPattern("HH:mm");
        System.out.println(now.format(clockSystem1) + " -- display in GMT time");
    }
    // displays local time and date Military zone detailed
    static void detailSystem(LocalDateTime now) {
        DateTimeFormatter detailSystem1 = DateTimeFormatter.ofPattern("H:mm 'on' dd MMM yyyy");
        System.out.println(now.format(detailSystem1) + " \n ---display in your local time zone---");
    }
}