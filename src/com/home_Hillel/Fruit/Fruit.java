package com.home_Hillel.Fruit;

import com.home_Hillel.Fruit.Type.TypeOfFruit;

public class Fruit {
    private final TypeOfFruit.FruitType type;
    private final TypeOfFruit.FruitColor color;
    private int weight;
    private double price;
    public int getWeight() {
        return weight;
    }
    public double getPrice() {
        return price;
    }

    public Fruit(TypeOfFruit.FruitType type, TypeOfFruit.FruitColor color, int weight, double price){
        this.type = type;
        this.color = color;
        this.weight = weight;
        this.price = price;
    }

    public void getInfo() {
        System.out.println(type + " цвета " + color + "." + "\nЦена за килограмм - " + price + " грн." + " Вес в пакете составляет " + weight + "г.");
    }

    }
