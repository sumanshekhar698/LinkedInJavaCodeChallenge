package com.sumanshekhar.challenges.noob;

import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;

/*There are a few different built-in libraries that we can use for working with dates and times.
 You may have heard of Java.util.dates or Java.util.calendar,
 but many components of these libraries are less intuitive to use,
 sometimes deprecated, and only remain for the use of backwards compatibility.
 Introduced in Java eight, the Java.time library is often the preferred way to work with dates and times in Java*/
public class DaysFromNow {

    public static void main(String[] args) {
        LocalDate now = LocalDate.now(ZoneId.of("America/New_York"));//Beware to right the correct Zone
        LocalDate future = calculateHundredDaysFromNow(now);
        System.out.println("100 days from now is ..." + future);
    }

    static LocalDate calculateHundredDaysFromNow(LocalDate now) {
        Period period = Period.ofDays(100);
        return now.plus(period);
    }
}
