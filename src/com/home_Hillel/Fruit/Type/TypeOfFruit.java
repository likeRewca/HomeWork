package com.home_Hillel.Fruit.Type;

     public enum TypeOfFruit {
        APPLE("Яблоко"), LEMON("Лемон"), BANANA("Банан");
        private String fruit;
        TypeOfFruit (String fruit){
            this.fruit = fruit;
        }
         @Override
         public String toString() {
             return fruit;
         }
     }

