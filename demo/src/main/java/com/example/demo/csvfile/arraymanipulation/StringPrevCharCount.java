package com.example.demo.csvfile.arraymanipulation;

public class StringPrevCharCount {

    public static void main(String[] args) {
        String str = "aaaabbccaaddddd";
        countOccurrences(str);
    }

    static void countOccurrences(String s) {

        char currentChar, prevChar;
        int count = 0;
        prevChar = s.charAt(0);
        for (int i = 0; i < s.length(); i++) {
            currentChar = s.charAt(i);
            if (prevChar == currentChar) {
                count++;
            } else {
                System.out.print(prevChar + " " + count);
                count = 1;
                prevChar = currentChar;

            }
            if(i==s.length()-1) {
                System.out.print(prevChar + " " + count);
            }
        }


    }
}
