package com.home_Hillel.Fruit;

import com.home_Hillel.Fruit.Type.TypeOfFruit;

public class Banana extends Fruit {
    public Banana (TypeOfFruit.FruitType name, TypeOfFruit.FruitColor color, int weight, double price) {
        super(name, color, weight, price);
    }
    @Override
    public void getInfo() {
        System.out.println(TypeOfFruit.FruitType.APPLE + " цвета " + TypeOfFruit.FruitColor.GREEN + "." +
                "\nЦена за килограмм - " + super.getPrice() + " грн." + " Вес в пакете составляет " + getWeight() + "г.");
    }
}
