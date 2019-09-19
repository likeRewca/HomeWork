package com.lessonHillel.oop;

public class Dancer {
    private String name;
    private int age;
    Object object = new Object();

    public Dancer(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void dance() {
        System.out.println(toString() + "Я танцую как все.");
    }

    @Override
    public String toString() {
        return "Я " + name + " мне " + age + " лет. ";
    }
}