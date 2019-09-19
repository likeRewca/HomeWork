package com.home_Hillel;

import java.io.IOException;
import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {

    private static ArrayList<Integer> numbers = new ArrayList<Integer>();

    public static void main(String[] args) {
        readData();
    }

    public static void readData() {
        String userInput = "";
        int inputAsInt = 0;
        System.out.println("Введите цифры:");
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            for(;;) {
                userInput = reader.readLine();
                inputAsInt = Integer.parseInt(userInput);
                numbers.add(inputAsInt);
            }
        } catch (NumberFormatException | IOException e) {
            System.out.println("Увы но ты ввел букву, вспомни что ты вводил:");
            getArray();
        }
    }
    private static void getArray (){
        for (int i = 0; i < numbers.size(); i++) {
            System.out.println(numbers.get(i));
        }
    }
}

