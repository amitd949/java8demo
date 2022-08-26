package com.example.demo.controller.aop.epam.service.bean;

public class ClearingCategory implements  Category{
    @Override
    public Double getPrice(Category category,Double price) {
        double discPrice= price*.5;
        return discPrice;
    }
}
