package com.home_Hillel;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Brick {

    private static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Введите параметры кирпича: ширина, длина, высота");
        ArrayList<Integer> parametersOfBrick = new ArrayList<>();
        parametersOfBrick.add(sc.nextInt());
        parametersOfBrick.add(sc.nextInt());
        parametersOfBrick.add(sc.nextInt());
        Collections.sort(parametersOfBrick);
        System.out.println("Введите параметры дырки: ширина, длина");
        ArrayList<Integer> parametersOfHole = new ArrayList<>();
        parametersOfHole.add(sc.nextInt());
        parametersOfHole.add(sc.nextInt());
        Collections.sort(parametersOfHole);
        if (parametersOfBrick.get(0) <= parametersOfHole.get(0) && parametersOfBrick.get(1) <= parametersOfHole.get(1)){
            System.out.println("Ура влез");
        } else System.out.println("Ура ... не влез:(");
    }
}

