package com.home_Hillel.Fruit;

import com.home_Hillel.Fruit.Type.TypeOfFruit;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        print("Весь ниже читаемый текст читать в Грузинском акценте, для большей атмосферности!!!");
        Fruit greenApple = new GreenApple(TypeOfFruit.FruitType.APPLE, TypeOfFruit.FruitColor.GREEN, 200, 80.25);
        Fruit redApple = new RedApple(TypeOfFruit.FruitType.APPLE, TypeOfFruit.FruitColor.RED, 550, 30.80);
        Fruit lemon = new Lemon(TypeOfFruit.FruitType.LEMON, TypeOfFruit.FruitColor.YELLOW, 50, 49.99);
        Fruit banana = new Banana(TypeOfFruit.FruitType.BANANA, TypeOfFruit.FruitColor.YELLOW, 450, 20.99);
        List<Fruit> groceryPackage = Arrays.asList(greenApple, redApple, lemon, banana);
        for (Fruit f : groceryPackage){
            f.getInfo();
        }
        print("Общий вес: " + getFinaleWeight(greenApple.getWeight(), redApple.getWeight(), lemon.getWeight(), banana.getWeight()) + "г.");
        print("Общая ценна: " + round(countPrice(greenApple.getWeight(), redApple.getWeight(), lemon.getWeight(), banana.getWeight(),
                greenApple.getPrice(), redApple.getPrice(), lemon.getPrice(), banana.getPrice())) + "грн.");
    }
    public static int getFinaleWeight (int greenApple, int redApple, int lemon, int banana){
        List<Integer> weightPackage = Arrays.asList(greenApple,redApple, lemon, banana);
        int sumW = 0;
        for (int i = 0; i < weightPackage.size(); i++){
            sumW += weightPackage.get(i);
        }
        return sumW;
    }

    public static double countPrice (int w1A, int w2A, int wL, int wB, double p1A, double p2A, double pL, double pB){
        List<Double> pricePackage = Arrays.asList(p1A, p2A, pL, pB);
        List<Integer> weightPackage = Arrays.asList(w1A, w2A, wL, wB);
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
