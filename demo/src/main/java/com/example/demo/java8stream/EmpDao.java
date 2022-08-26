package com.example.demo.java8stream;

import java.util.ArrayList;
import java.util.List;

public class EmpDao {

static List<Emp> findList(){
    Emp e1=  new Emp(1,"A",10000);
    Emp e2=  new Emp(2,"b",500000);
    Emp e3=  new Emp(3,"c",600000);
    Emp e4=  new Emp(4,"d",700000);
    Emp e5=  new Emp(5,"e",1000000);

    ArrayList<Emp> empArrayList= new ArrayList<>();


    empArrayList.add(e1);
    empArrayList.add(e2);
    empArrayList.add(e3);
    empArrayList.add(e4);
    empArrayList.add(e5);

    return  empArrayList;
}
}
