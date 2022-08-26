package com.example.demo.java8stream;

import java.util.ArrayList;
import java.util.List;

public class addsubaaary {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        list.add(3);
        list.add(1);
        list.add(1);
        list.add(1);

        List<Integer> list2 = new ArrayList<>();

        list2.add(3);
        list2.add(2);
        list2.add(5);
       // list2.add(2);

        List<Integer> list3 = new ArrayList<>();

        list3.add(5);
        list3.add(1);
        list3.add(10);
        list3.add(1);
        list3.add(5);
       // list3.add(2);
// 10-1+5-2+1=
        getmax(list);
        System.out.println(" *****   >>>>>>>>>>> ");
        getmax(list2);
        System.out.println("for 3ld case list :: ***  >>>>  ");
        getmax(list3);
    }

    static public int getmax(List<Integer> A) {
        int maxSum = A.get(1);
        for (int i = 1; i < A.size(); ++i) {
            if (i % 2 == 0) {
                maxSum = maxSum - A.get(i);
            } else {
                maxSum = maxSum + A.get(i);
            }
        }        if (maxSum <= 0) {
            int sum2 = A.get(2);
            int count = 0;
            for (int i = 3; i < A.size(); ++i) {
                if (i % 2 == 0) {
                    sum2 = sum2 + A.get(i);

                } else {
                    sum2 = sum2 - A.get(i);
                }
                count++;
            }
            if (count % 2 == 0) {
                sum2 = sum2 - A.get(1);
            } else sum2 = sum2 + A.get(1);
            System.out.println("final sum :: " + sum2);
            return sum2;
        }
        System.out.println("maxSum os : " + (maxSum - 1));
        return maxSum;
    }
}
