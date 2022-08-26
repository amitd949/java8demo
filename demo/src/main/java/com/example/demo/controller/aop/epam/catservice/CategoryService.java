package com.example.demo.controller.aop.epam.catservice;

import com.example.demo.controller.aop.epam.service.bean.Category;
import com.example.demo.controller.aop.epam.service.bean.Item;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService {
    public void calulatePrice(List<Item>item){

       // item.stream().map(this:getItemPrice(item))


    }

    Object getItemPrice(Item item){
        // find itemType
        item.getCategory().getPrice(item.getCategory(),25.0);

        return item;


    }
}
