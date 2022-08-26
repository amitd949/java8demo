package com.example.demo.controller.aop.epam.service.bean;

public class FoodCategory implements  Category{
    @Override
    public Double getPrice(Category category,Double price) {
        double discPrice= price*.10;
        return discPrice;
    }
}
