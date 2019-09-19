package com.lessonHillel;

public class ExceptionEx3 {
    public static void main(String[] args) {
        try
        {
            int data=50/0; //возможно выбросится исключение
            // если исключение случится, оставшийся код не будет выполнен
            System.out.println("rest of the code");
        }
        // обработка исключений
        catch(ArithmeticException e)
        {
            System.out.println(e);
        }

    }
}
