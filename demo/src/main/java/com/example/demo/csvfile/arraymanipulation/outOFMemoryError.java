package com.example.demo.csvfile.arraymanipulation;

import java.util.ArrayList;
import java.util.List;

public class outOFMemoryError {
    public static void main(String[] args) {
        om();
    }

    static  void  om(){
        List<OutOfMemoryError>outOfMemoryErrorList= new ArrayList<>();
        int count=0;
        while (true){
            OutOfMemoryError outOfMemoryError= new OutOfMemoryError();
            outOfMemoryErrorList.add(outOfMemoryError);
            System.out.println("Count is : "+ count++);
        }

    }
}
