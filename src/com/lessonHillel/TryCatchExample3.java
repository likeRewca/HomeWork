package com.lessonHillel;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class TryCatchExample3 {

     public static void main(String[] args) {
      PrintWriter pw;
      try {
       pw = new PrintWriter("jtp.txt"); //возможно будет выброшен ексепшин
       pw.println("saved");
       pw.flush();
      }
// предоставляет проверяемое исключение
      catch (FileNotFoundException e) {
       System.out.println(e);
      }
      System.out.println("File saved successfully");
     }
    }