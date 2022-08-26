package com.example.demo.java8stream;

import java.util.Arrays;

public class inforamationTest {

    static final int mod = 1000000007;

    public static void main(String[] args) {
        String str="";
        char chars[]= new char[]{'A'};
        String str1 = "abcab";
        int n = 2;

       // System.out.print(countSubStr(str1, n));

        int n1 = 3;

        //System.out.print(count_special(n1) + "\n");

        int arra[]= new int[]{3 ,2,1,2,3};
        int arra2[]= new int[]{5 ,3,1,1,1,1,1};
        System.out.println("max coind is :"+ maxCoins(arra));
        System.out.println("max coind is :"+ maxCoins(arra2));

    }

    public static int  maxCoins(int[] piles) {
        Arrays.sort(piles);
        int res = 0, n = piles.length;
        for (int i = n / 3; i < n; i += 2)
            res += piles[i];
        return res;
    }

    static int countSubStr(String str, int n)
    {
        int len = str.length();
        return (len - n + 1);
    }

    static int count_special(int n)
    {

        // Stores the answer for a
        // particular value of n
        int []fib = new int[n + 1];

        // For n = 0 we have empty String
        fib[0] = 1;

        // For n = 1 we have
        // 2 special Strings
        fib[1] = 2;

        for(int i = 2; i <= n; i++)
        {

            // Calculate count of special
            // String of length i
            fib[i] = (fib[i - 1] % mod +
                    fib[i - 2] % mod) % mod;
        }

        // fib[n] stores the count of
        // special Strings of length n
        return fib[n];
    }

    public  void perfomrOp(){

    }
}
