package com.home_Hillel.Fruit;


import com.home_Hillel.Fruit.Type.TypeOfColor;
import com.home_Hillel.Fruit.Type.TypeOfFruit;

public class Fruit {
    private TypeOfFruit typeOfFruit;
    private TypeOfColor typeOfColor;
    private int weight;
    private double price;
    public int getWeight() {
        return weight;
    }
    public double getPrice() {
        return price;
    }

    public Fruit(TypeOfFruit typeOfFruit, TypeOfColor typeOfColor, int weight, double price){
        this.typeOfFruit = typeOfFruit;
        this.typeOfColor = typeOfColor;
        this.weight = weight;
        this.price = price;
    }
    @Override
    public String toString () {
        return typeOfFruit + " цвета " + typeOfColor + "." + "\nЦена за килограмм - "
                + price + " грн." + "\nВес в пакете составляет " + weight + "г.";
    }
}
