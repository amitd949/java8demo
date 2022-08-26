package com.example.demo.java8stream;

import io.swagger.models.auth.In;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class prob2 {
    public static void main(String[] args) {
int a[]= new int[]{3,1,1,1};

        int a2[]= new int[]{3,1,5,2};
       List <Integer> a3= new ArrayList<>();
a3.add(3);
        a3.add(1);
        a3.add(5);a3.add(2);

        List<Integer> al = new ArrayList<Integer>();

      al.add(3); al.add(1);
        al.add(1); al.add(1);


        System.out.println("max is :: "+ (findMax(al)-1));
        System.out.println("max is :: "+ (findMax(a3)-1));
    }

// sol-2
static int  even=0 , odd =0;


    static public int findMax(List <Integer> arr){
int n= arr.size();
        for(int i = 0 ; i<n; i++){

            if(i%2==0)
                even = arr.get(i)+even;
            else odd = arr.get(i)+odd;
        }

        int cur = odd-even;
        int j=1;

        int f1= findOddEvenResult(arr,j);
        int e = odd-f1;
        int o = even+f1;
        int newCur = o-e;
        if(newCur>cur) cur=newCur;
        j=j+2;
        if(j<=n) findOddEvenResult(arr,j);
        return cur;
    }


    public static int findOddEvenResult(List<Integer>arr, int n){
        for(int i = 0 ; i<n ; i++){

            if(i%2==0)
                even = arr.get(i)+even;
            else odd = arr.get(i)+odd;
        }
        return odd-even;
    }
}
