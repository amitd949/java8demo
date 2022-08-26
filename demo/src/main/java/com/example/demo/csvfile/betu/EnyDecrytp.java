package com.example.demo.csvfile.betu;

import java.util.HashMap;
import java.util.Map;

public class EnyDecrytp {
    public static void main(String[] args) {


        // System.out.println(map);
        String str = "vmx";
        // String result = Decrypt(str);
        String cons = "1C0C1C1A0B1";
        System.out.println(" converting data is : " + con(cons));
        System.out.println(" bit xor for 1^1 ::>> " + (1 ^ 1));
    }

    static String Decrypt(String str) {

        Map<String, String> map = new HashMap<>();
        int count = 122;
        for (int i = 97; i <= 122; i++) {
            map.put(Character.toString((char) i), Character.toString((char) count--));
        }

        String resultStr = "";
        for (int i = 0; i < str.length(); ++i) {
            resultStr = resultStr + map.get(str.charAt(i) + "");
        }
        // System.out.println("result is :" + resultStr);
        return resultStr;
    }

    static int con(String str) {

        int a = Integer.parseInt(String.valueOf(str.charAt(0)));
        System.out.println(" initila is : " + a);
        int i = 1;
// "abc--z"
        // "zyx"

        while (i < str.length()) {

            int parseInt = Integer.parseInt(String.valueOf(str.charAt(i + 1)));
            if (str.charAt(i) == 'A') {
                a &= parseInt;
            } else if (str.charAt(i) == 'B') {
                a |= parseInt;
            } else {

                a ^= parseInt;
            }
            i += 2;
        }
        return a;
    }
}
