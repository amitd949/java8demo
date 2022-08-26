package com.example.demo.java8stream;

public class OutOfRAnge {
    public static void main(String[] args) {
        byte c= (byte) 128;
        Integer i=127;
        Integer i2=127;

        // == object - locatiopn

        // == and .equals
        String s1= "ab";
        String s2= "ab";// pool

        String s3=  new String("ab");
        String s4= new  String("ab"); // heap

        System.out.println(" both are  :: " + (i==i2));


        System.out.println("char is "+ c);
        test('A', 20);
        //test('A', 'B');
        //test('A', 10);
       // test(10, 'A');

        test('A', 'B','A');

    }

    static void test(int a, char b, int c){
        System.out.println(" int type is called");
    }// type para , no of parame // return type

/*    static void test(int a, int b){
        System.out.println(" char type is called");

    }*/

    static void test(char a, int b){
        System.out.println(" char type is called");

    }
}
