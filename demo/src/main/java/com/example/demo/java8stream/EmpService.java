package com.example.demo.java8stream;

import java.util.List;
import java.util.stream.Collectors;

public class EmpService {
    public List<Emp> calTax(){

        return EmpDao.findList().stream().filter(e-> e.getSalary()<=1000000).collect(Collectors.toList());

    }
}
