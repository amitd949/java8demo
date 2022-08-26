package com.example.demo.csvfile.betu;

public class Sudeko {

    public static void main(String[] args) {
        //fillSudeko();
Fi2 fi2= () -> System.out.println(" test program");

fi2.test();
        fi2.test2();
    }

    private static void fillSudeko() {
        for (int i = 1; i <= 9; ++i) {
            for (int j = i; j <= 9; ++j) {
                System.out.print(j);

            }
            for(int k=2;k<=i;k++){
                System.out.print(k-1);
               // System.out.print("module is needed "+ k%9);
            }
            // for backfill of remaining--

            System.out.println("\n--");
        }
    }
}
