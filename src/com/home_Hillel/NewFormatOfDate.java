package com.home_Hillel;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class NewFormatOfDate {
    public static void main(String[] args) throws IOException {
        String presentDate = "15.08.1995 18:30:15"; // Записать в формате- "dd.MM.yyyy kk.mm.ss" Обязательно!!!
        System.out.println(formatOfDate(presentDate.substring(0, 10))); //Отделим дату от времени и форматируем на свой манер
        System.out.println(formatOfTime(presentDate.substring(11, 19)));//Отделим время от даты и форматируем на свой манер
        createFileUsingFileClass(formatOfDate(presentDate.substring(0, 10)), formatOfTime(presentDate.substring(11, 19)));
    }
    //Форматируем дату в методе
    private static String formatOfDate(String oldDate) {
        DateFormat df = new SimpleDateFormat("dd.MM.yyyy", Locale.US);
        DateFormat destinationFormat = new SimpleDateFormat("dd MMM", Locale.US);
        Date date;
        String newDate;
        String result = null;
        try {
            date = df.parse(oldDate);
            newDate = destinationFormat.format(date);
            result = newDate;
        } catch (ParseException e) {
            System.out.println("Can't parse");
        }
        return result;
    }
    //Форматируем время в методе
    private static String formatOfTime (String oldTime){
        DateFormat df = new SimpleDateFormat("kk:mm:ss", Locale.US);
        DateFormat destinationFormat = new SimpleDateFormat("h:mm a", Locale.US);
        Date time;
        String newTime;
        String result = null;
        try {
            time = df.parse(oldTime);
            newTime = destinationFormat.format(time);
            result = newTime;
        } catch (ParseException e) {
            System.out.println("Can't parse");
        }
        return result;
    }
    //Создаем файл по пути /home/yura и записуем наши строки
    private static void createFileUsingFileClass(String date, String time) throws IOException {
        File file = new File(System.getProperty("user.dir") + File.separator + "fileTest.txt");
        if (file.createNewFile()){
            System.out.println("File is created!");
        }else{
            System.out.println("File already exists.");
        }
        //Запись в файле полученных данных
        PrintWriter writer = new PrintWriter(file);
        writer.println(date + "\n" + time);
//        writer.println(time);
        writer.close();
    }
}


