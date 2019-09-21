package com.home_Hillel.Fruit.Type;

    public enum TypeOfColor {
        GREEN("green"), RED("red"), YELLOW("red");
        private String color;
        TypeOfColor (String color){
            this.color = color;
        }
        @Override
        public String toString() {
            return color;
        }
    }
