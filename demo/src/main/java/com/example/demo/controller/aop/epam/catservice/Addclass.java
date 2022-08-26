package com.example.demo.controller.aop.epam.catservice;

import net.bytebuddy.asm.Advice;

public class Addclass {
    public static void main(String[] args) {
     //   add(10, 20);
        String str= "EINV::test";
        if(str.startsWith("EINV")){

            String test= str;
            test = test.substring(test.lastIndexOf("::")+2);
            System.out.println("test : "+ test);
        }

    }

    private static void add(int a, int b) {
        int c = a + b;
        System.out.println("addition is :" + c);
    }

    private static void multiply(int a, int b) {
        int c = a / b;
        System.out.println("Multiplication is :" + c);
    }
}
