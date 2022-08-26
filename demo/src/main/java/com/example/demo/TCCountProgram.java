package com.example.demo;

import java.util.Arrays;

public class TCCountProgram {
    //String="aabbbcccddd";
    public static void main(String[] args) {
        String str= "aabbbcccddd";
        // a2 b3c3d3
        //String str2 ="abcdeeeffzz";
        // a=2, b3, c3, d3
        getCount(str);
// a=[1,2,90,9,8]
        int a[]= new int[]{1,2,90,9,8};
       // sorts(a);

        // 90 , 8
        // a[i]= 8, a[j]= temp

    }

    public static void sorts(  int [] a){

      //  Arrays.sort(a);
        //
        for( int i=0;i<=a.length-1;i++){
           int  temp= a[i];
            for(int j=i;j<=a.length-1;++j){
               if(a[i]>a[j]){
                  temp= a[j];
                   a[j]= a[i];
                   a[i]= temp;

               }

            }

        }
        for( int i=0;i<=a.length-1;i++){

            System.out.println(a[i]);
        }


    }
    public static void getCount(String str){
        StringBuffer stringBuffer= new StringBuffer();
        char c= str.charAt(0);
        int count=1;
        for(int i=1;i<=str.length()-1;++i){
            if(c==str.charAt(i)){
                count++;
            }else{
                System.out.println(c +" " +count);
                stringBuffer.append(c +" " +count);
                count=1;
                c= str.charAt(i);
            }
            if(i==str.length()-1){
                System.out.println(c +" " +count);
                stringBuffer.append(c +" " +count);
            }
        }
        System.out.println("char occur : "+ stringBuffer);
    }

}
