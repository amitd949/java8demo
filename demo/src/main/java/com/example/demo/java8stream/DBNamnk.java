package com.example.demo.java8stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class DBNamnk {

    public static void main(String[] args) {
        long[] artest = new long[]{5, 8, 2, 1};
        long[] artest2 = new long[]{6, 8, 2, 1, 7};

        String[] str = new String[]
                {"A", "b", "c"};
        List<String> strmew = Arrays.asList(str);
        //strmew.add("D");
        System.out.println(strmew);
        List<Long> list = Arrays.stream(artest).boxed().collect(Collectors.toList());
        list.add(80l);
        System.out.println(" lkist is :: >> " + list);


        // values(artest2);
        //values(artest);
        //Arrays.stream(data).sorted().forEach(System.out::println);
    }

    static long values(long[] A) {
        Arrays.sort(A);
        long binarydata = A[A.length - 1];
        long maxValues = A[A.length - 2];
        String binaryValue = Long.toBinaryString(binarydata);
        long last3Digit = Long.parseLong(binaryValue.substring(1), 2);
        Long finalMaxMalue = maxValues - last3Digit;
        System.out.println(binarydata + " and last 3 digit is : " + last3Digit + ">>  final resumt is : " + finalMaxMalue);
        return finalMaxMalue;
    }
}
