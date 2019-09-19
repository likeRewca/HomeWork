package com.home_Hillel.Fruit;


import com.home_Hillel.Fruit.Type.TypeOfColor;
import com.home_Hillel.Fruit.Type.TypeOfFruit;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Fruit greenApple = new GreenApple(TypeOfFruit.APPLE, TypeOfColor.GREEN, 200, 80.25);
        Fruit redApple = new RedApple(TypeOfFruit.APPLE, TypeOfColor.RED, 550, 30.80);
        Fruit lemon = new Lemon(TypeOfFruit.LEMON, TypeOfColor.YELLOW, 50, 49.99);
        Fruit banana = new Banana(TypeOfFruit.BANANA, TypeOfColor.YELLOW, 450, 20.99);
        List<Fruit> groceryPackage = Arrays.asList(greenApple, redApple, lemon, banana);
        for (Fruit f : groceryPackage){
            System.out.println(f.toString());
        }
        print("Общий вес: " + getFinaleWeight(greenApple, redApple, lemon, banana) + "г.");
        print("Общая ценна: " + round(countPrice(greenApple, redApple, lemon, banana))+ "грн.");
    }
    public static int getFinaleWeight (Fruit greenApple, Fruit redApple,Fruit lemon, Fruit banana){
        List<Integer> weightPackage = Arrays.asList(greenApple.getWeight(),redApple.getWeight(), lemon.getWeight(), banana.getWeight());
        int sumW = 0;
        for (int i = 0; i < weightPackage.size(); i++){
            sumW += weightPackage.get(i);
        }
        return sumW;
    }
    //Получаем конечную сумму
    public static double countPrice (Fruit greenApple, Fruit redApple, Fruit lemon, Fruit banana){
        List<Double> pricePackage = Arrays.asList(greenApple.getPrice(), redApple.getPrice(), lemon.getPrice(), banana.getPrice());
        List<Integer> weightPackage = Arrays.asList(greenApple.getWeight(),redApple.getWeight(), lemon.getWeight(), banana.getWeight());
        double finaleSum = 0;
        for (int i=0; i< weightPackage.size(); i++){
                finaleSum += ((pricePackage.get(i) * weightPackage.get(i))/1000.0);
        }
        return finaleSum;
    }
    private static double round (double value){
        return Math.round(value * 100)/100.0;
    }
    private static void print (String str){
        System.out.println(str);
    }
}
