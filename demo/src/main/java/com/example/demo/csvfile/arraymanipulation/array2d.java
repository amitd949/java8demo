package com.example.demo.csvfile.arraymanipulation;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeSet;

public class array2d {
    public static void main(String[] args) {
        int [][]data= new int[10][10];

       //data[0][0]= Integer.parseInt("2 3 4");
      //  System.out.println(data[0][0]);
        TreeSet<String>ts = new TreeSet<>();
        ts.add("amit");
        Iterator<String> it= ts.iterator();;
        while (it.hasNext())
        {

            String data1= it.next();
            System.out.println(data1.charAt(3));

        }
    }
}
