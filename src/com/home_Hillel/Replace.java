package com.home_Hillel;

import java.util.Arrays;

public class Replace {
    public static void main(String[] args) {
        //Заполняем массив
        int [] array = new int [100];
        for (int i = 0; i < array.length; i++){
            array [i] = i + 1;
        }

        String str = Arrays.toString(array);
        //После преобразования массива в строку начинаем перебирать наш массив исходя из 3х условий
        for (int j = 1; j <= array.length; j++){
            if (j % 3 == 0 && j % 5 == 0) {
                str = replaceConditions(str, String.valueOf(j), "HelloWord");
            } else if (j % 3 == 0) {
                str = replaceConditions(str, String.valueOf(j), "Hello");
            } else if (j % 5 == 0) {
                str = replaceConditions(str, String.valueOf(j), "Word");
            }
        }
        str = str.replace(",","").replace("[", "").replace("]","");
        System.out.println(str);
    }
    //Создаем метод (для удобства и) для замены нужных нам чисел исходя из условий
    private static String replaceConditions (String str, String oldChar, String newChar){
        return str.replaceFirst(oldChar, newChar);
    }
}
