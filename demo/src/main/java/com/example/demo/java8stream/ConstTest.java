package com.example.demo.java8stream;

class  parent1{
int a;
   parent1(){
       a=40;
       System.out.println("parnet const default");
    }
    parent1(int a){
        System.out.println("parnet const parameter");
    }
    public  void disp(){

        System.out.println("parent class method)) ");
    }

}

class child1 extends parent1{

    child1(){
        super(10);
        System.out.println("child const default");
    }

    child1(int test){
        System.out.println("child const parameter");
    }

    public  void disp(){

        System.out.println("child class method)) ");
    }

}

class child2 extends parent1{

    child2(){
        super(10);
        System.out.println("child const default");
    }

    child2(int test){
        System.out.println("child const parameter");
    }

    public  void disp(){

        System.out.println("child2 class method)) ");
    }

}
// child class always call parent class defualt constructor
// if we want to call parameterised, super
public class ConstTest {
    public static void main(String[] args) {

        parent1 p= new child1(100);
        p.disp();
        p= new child2(100);
        p.disp();
    }
}
