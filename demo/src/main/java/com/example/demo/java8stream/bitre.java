package com.example.demo.java8stream;

public class bitre {

    public static void main(String[] args) {
        int inputList[] = new int [] {1,1,0,0,1,0};
        int a2[] = new int[inputList.length];
        a2[0]= inputList[0];
        for(int i=2;i< inputList.length;i++){

            if (inputList[i]==inputList[i-1]){
                a2[i]=0;
                //System.out.println(a[i]);
            }else
                a2[i]=1;

        }
        for(int i=0;i< a2.length;i++){
            System.out.print(a2[i]);
        }

    }
}
