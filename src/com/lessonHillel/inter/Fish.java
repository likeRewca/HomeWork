package com.lessonHillel.inter;

public class Fish implements Swim {
    private String name;

    public Fish(String name) {
        this.name = name;
    }

    @Override
    public void swim() {
        System.out.println("Я рыба " + name + ". Я плыву, двигая плавниками.");
    }
}