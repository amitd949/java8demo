package com.example.demo.csvfile.betu;

public class TCSHacker {

    public static void main(String[] args) {
        int arr[] = {1, 2, 1};
        int n = arr.length;
        int result = (int) (sum(arr, n) + Math.pow(2, 0));
        System.out.println(result);
    }
    static int sum(int arr[], int n) {
        int ans = 0;
        for (int i = 0; i < n; i++)
            ans += arr[i];
        return ans * (int) (Math.pow(2, n - 1));
    }


}
