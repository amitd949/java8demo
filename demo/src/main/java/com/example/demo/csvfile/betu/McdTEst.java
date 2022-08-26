package com.example.demo.csvfile.betu;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

import static java.lang.System.out;
import static java.util.Map.Entry.comparingByValue;

public class McdTEst {

    static int sum = 1;

    public static void main(String[] args) {

        int data[] = new int[]{2, 6, 4, 7, 9, 1, 3, 5, 7, 0, 2, 6, 5, 1, 2, 5};
        getData(data);
        int d = 5;
        // System.out.println("fact is : " + countFact(d));
        //System.out.println("fact is  with rec: " + withRec(d));

    }

    private static int withRec(int d) {

        if (d == 0)
            return 1;
        else
            return (d * withRec(d - 1));
    }


    private static int countFact(int d) {
        int sum = 1;
        for (int i = 1; i <= d; ++i) {
            sum *= i;
        }
        return sum;
    }

    static void getData(int[] data) {

        //  Input: [2,6,4,7,9,1,3,5,7,0, 2,6,5,1, 2,5]
        // Output: [2, 5, 1, 6, 0, 3, 4, 7, 9]

        Map<Integer, Integer> resultData = new HashMap<>();

        for (int i = 0; i < data.length; ++i) {

            if (resultData.containsKey(data[i])) {
                resultData.put(data[i], resultData.get(data[i]) + 1);
            } else
                resultData.put(data[i], 1);
        }


        resultData.entrySet().stream().sorted(comparingByValue(Comparator.reverseOrder())).collect(Collectors.toList());

        resultData.keySet().stream().forEach(out::println);

        resultData.entrySet().stream().sorted(comparingByValue(Comparator.reverseOrder())).collect(Collectors.toList());


        resultData.entrySet().stream().sorted(Comparator.comparing(Map.Entry::getValue)).collect(Collectors.toList())
                .forEach(x -> x.getKey());

        // resultData.entrySet().stream().sorted(Comparator.comparing( (o1, o2) ->{o1.getValue().compareTo()}


    }
}
