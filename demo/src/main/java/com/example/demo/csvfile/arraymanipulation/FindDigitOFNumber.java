package com.example.demo.csvfile.arraymanipulation;

public class FindDigitOFNumber {
    public static void main(String[] args) {
        findDigitSum(12);
    }

    static void findDigitSum(int n) {
        int sum = 0;
        while (n > 0) {
// 12%10= 2 ,
            System.out.println("number :"+n);
            int digit = n % 10;
            sum += digit;
            n = n / 10;
            System.out.println("digut " + digit + " no : " + n);

        }
        System.out.println("sum of digit is : "+ sum);

    }
}
