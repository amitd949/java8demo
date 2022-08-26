package com.example.demo.controller.aop.epam.service.bean;

import org.springframework.stereotype.Service;

@Service
public interface Category {

    Double getPrice(Category category,Double price);

}
