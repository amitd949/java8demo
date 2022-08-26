package com.example.demo.csvfile.arraymanipulation;

import java.util.Arrays;

public class PopulationBoat {
    public static void main(String[] args) {
        int a[] = {100, 200, 50, 80, 170};
        countBoat(a, 200);
        int product[] = {1, 2, 3, 4};
        int product1[] = {-100,-98,-1,2,3,4};
        maxProductOf3Num(product1);
    }

    static int countBoat(int people[], int limit) {

        // Arrays.sort(a);
        // 50,80,100,200
        // 50+80
        // 100
        // 200
        Arrays.sort(people);

        int boats = 0;
        int currWgt = 0;

        int i = 0;
        int j = people.length - 1;

        while (i <= j) {
            currWgt = people[i] + people[j];
            if (currWgt <= limit) {
                i++;
            }
            j--;
            boats++;
        }

        return boats;
    }

    static int maxProductOf3Num(int[] number) {

        Arrays.sort(number);
        int count = 0, product = 1;
        int size = number.length - 1;
        while (count < 3) {
            product = product * number[size--];
            count++;
        }
        System.out.println("product is :" + product);
        return product;

    }
}
