package com.example.demo.csvfile.arraymanipulation;

import java.util.ArrayList;
import java.util.Iterator;

public class IndexValueModify {

    public static void main(String[] args) {
        int[] array = {10, 20, 30, 40, 50};
        Modify(array);
    }

    static void Modify(int[] array) {
        int preValue = 0, tempValue = 0;
        int count=0;
        //array[count++]= array[0]*array[1];
        int firstInValue= array[0]*array[1];
        System.out.println("fi in,"+firstInValue);
        for (int i = 1; i < array.length; ++i) {

            if(i==array.length-1){
                array[i-1]= array[i-1]*array[i];
            }else {
                array[i - 1] = array[i - 1] * array[i + 1];
            }

            ArrayList al= new ArrayList();
            Iterator it= al.iterator();
            while(it.hasNext())
            {

               //
            }
        }
        array[array.length-1]=firstInValue;
        for (int i = 0;i<array.length;++i) {
            System.out.print(","+array[i]);

        }
        System.out.println();
        for (int i = array.length-1 ;i>=0; --i) {
            System.out.print(","+array[i]);
         // array[i]=array[i-1];
            //System.out.print(","+array[i]);
        }

    }
}
