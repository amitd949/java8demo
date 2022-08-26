package com.example.demo.csvfile.arraymanipulation;

import java.io.BufferedInputStream;
import java.util.HashMap;
import java.util.Map;

public class AltTest2 {
    private static Object BufferedInputStream;

    public static void main(String[] args) {
        String str = "my name is amit";
        countOccr(str);
    }


    static void countOccr(String s) {
        Map<String, Integer> countCharacterIntegerMap = new HashMap<>();
        for (int i = 0; i < s.length(); ++i) {
            char c = s.charAt(i);
            String st = String.valueOf(c);
            if (countCharacterIntegerMap.containsKey(st)) {
                countCharacterIntegerMap.put(st, countCharacterIntegerMap.get(st) + 1);
            } else {
                countCharacterIntegerMap.put(st, 1);
            }


        }
        System.out.println("char occr count : " + countCharacterIntegerMap);

    }
}

