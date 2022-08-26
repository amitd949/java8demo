package com.example.demo.java8stream;

public interface I {
    void add();

   default void test(){
       System.out.println("sout ");
    }

}
