package com.example.demo;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;

//@EnableSwagger2
@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        // SpringApplication.run(DemoApplication.class, args);
        //swap(10,20);

        int arr[] = {-40, -5, 1, 3, 6, 7, 8, 20};

        // test(15, arr);
        int arr1[] = {100, 14, 46, 47, 94, 94, 52, 86, 36, 94, 89};
        test1(2, arr1);
    }

    public static void swap(int x, int y) {
        x = x + y;// 10, 20 // 30
        y = x - y; // 10
        x = x - y;

        System.out.println("X" + x + " Y : " + y);


    }

    public static void test(int sum, int[] arr) {
        int tempSum = 0;
        //array[]={ -40, -5, 1, 3, 6, 7, 8, 20 };
        for (int i = 0; i < arr.length; ++i) {

            for (int j = i; j < arr.length; ++j) {
                tempSum = arr[i] + arr[j];
                if (tempSum == sum) {
                    System.out.println(" sum :" + tempSum + " of " + arr[i] + arr[j]);

                }

            }
        }


    }
    // int arr[] = { 100,14, 46, 47, 94, 94, 52, 86, 36, 94, 89 };

    public static void test1(int nthHighest, int[] arr) {
        // 2nd hi
        // 12345
        Arrays.sort(arr);
        int highValue = arr[arr.length - nthHighest];
        System.out.println("value is : " + highValue);
       /* for(int i=0;i<arr.length;++i){

        }*/
    }

   /* class sing
    {
        // static private dta of calss type
        // private consttur

        Sing getins(){
            // synch(this)
            // if initi
            // returnsing
            else
                new = singlton

        }
    }*/

}

