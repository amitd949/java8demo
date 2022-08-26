package com.example.demo.java8stream;

abstract class Food {
    public abstract String getType();

}

class FastFood extends Food {
    public String getType() {
        System.out.println("I m serving Fast Food");
        return "I m serving Fast Food";
    }
}

class Fruit extends Food {

    public String getType() {
        System.out.println("I m serving Fruit");
        return "I m serving Fruit";
    }
}

class foodFactory {

    public Food getFood(String order) {

        if (order.equals("FastFood")) {
            Food fastFood = new FastFood();
            return fastFood;
        } else if (order.equals("fruit")) {
            Food fruit = new Fruit();
            return fruit;
        } else {
            return null;
        }
    }


}

public class FoodFActoryimpl {
    public static void main(String[] args) {
        foodFactory foodFActoryimpl = new foodFactory();
        Food food1 = foodFActoryimpl.getFood("FastFood");
        Food food2 = foodFActoryimpl.getFood("fruit");
        System.out.println(" my name is : " + food1.getClass().getName());
        System.out.println(" my name is : " + food2.getClass().getName());
        food1.getType();
        food2.getType();

    }
}


