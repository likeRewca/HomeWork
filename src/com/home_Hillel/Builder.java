package com.home_Hillel;

public class Builder {
    public static void main(String[] args) {

        StringBuilder builder = new StringBuilder();
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                builder.append("HelloWord ");
            } else if (i % 3 == 0) {
                builder.append("Hello ");
            } else if (i % 5 == 0) {
                builder.append("Word ");
            }else {
                builder.append(String.valueOf(i)).append(" ");
            }
        }
        System.out.println(builder);
    }
}

