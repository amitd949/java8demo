package com.example.demo.csvfile.arraymanipulation;

public class ArmStrongNo {
    public static void main(String[] args) {
        testArm(152);
    }
    static  void testArm(int n){

        int sum=0, armNo=n;
        while(n>0){

            int mod= n%10;
            n=n/10;
            sum= sum+(mod*mod*mod);

        }
        if(sum==armNo){
            System.out.println("Numbe is armstrong : "+ armNo +" sum is : cube "+ sum);
        }else {

            System.out.println("Alert *** Number  is not armstrong : "+ armNo +" sum is : cube "+ sum);
        }
    }
}
