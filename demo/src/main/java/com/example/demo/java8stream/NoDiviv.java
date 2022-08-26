package com.example.demo.java8stream;

import java.util.Arrays;

public class NoDiviv {


    public static void main(String[] args) {

        int n = 4;
        find4Divisible(n);

        String str = " this is test";
        getSplilting(str);
    }

    private static void getSplilting(String str) {

        String strarr[] = str.split(" ");
        Arrays.sort(strarr);
        for (int i = 0; i < strarr.length; ++i) {
            System.out.println(strarr[i]);
        }


    }

    private static void find4Divisible(int n) {
        int num;
        for (int i = 1; i <= n + 1; ++i) {
            num = 3 * i + 2;
            if (num % 4 != 0) {
                System.out.println(num);
            }
        }
    }
}
