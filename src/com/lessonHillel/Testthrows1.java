package com.lessonHillel;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;


class Testthrows1 {
    public static void main(String[] args) {
        String firstDate = "14.09.2019 1:59:30";
        DateFormat df = new SimpleDateFormat("dd.MM.yyyy kk:mm:ss", Locale.US);
        DateFormat destinationFormat = new SimpleDateFormat("dd MMM h:mm a",
                Locale.US);
        Date date;
        //14 Sep 1:59 AM
        String newDate;
        try {
            date = df.parse(firstDate);
            System.out.println("Date: " + date);
            //14 Sep 1:59 AM
            newDate = destinationFormat.format(date);
            System.out.println(newDate);
        } catch (ParseException e) {
            System.out.println("Can't parse");
        }
    }
}