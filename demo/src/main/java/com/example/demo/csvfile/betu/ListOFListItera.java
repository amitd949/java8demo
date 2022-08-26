package com.example.demo.csvfile.betu;

import com.example.demo.java8stream.Emp;
import com.example.demo.java8stream.EmpService;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ListOFListItera {

    public static void main(String[] args) {
        // ListOfIterator();
        //SeqAndParallelStreaming();
        convertListAfterJava8();
    }

    private static void SeqAndParallelStreaming() {
        List<Integer> listListData = Arrays.asList(1, 2, 3, 4);

        listListData.stream()
                .forEach(number -> System.out.println(number + " " + Thread.currentThread().getName()));
        System.out.println("paraller streaming data is :: >> ");
        listListData.stream().parallel()
                .forEach(number -> System.out.println(number + " " + Thread.currentThread().getName()));

        System.out.println("reduce method usage ::: ");

        int sum = listListData.stream().parallel().reduce(5, Integer::sum);
        System.out.println(" sum in parlle strem is :: " + sum);

        int seqsum = listListData.stream().reduce(5, Integer::sum);
        System.out.println(" sum in seqsum strem is :: " + seqsum);

        //.forEach(number -> System.out.println(number + " " + Thread.currentThread().getName()));
    }

    private static void ListOfIterator() {
        List<List<String>> listListData = new ArrayList<>();
        listListData.add(Arrays.asList("10", "20", "30"));
        //System.out.println(listListData);
        List<String> collect = listListData.stream().flatMap(Collection::stream).collect(Collectors.toList());
        //collect.forEach(System.out::println);

        EmpService empService = new EmpService();

        List<List<Emp>> empList = new ArrayList<>();
        empList.add(empService.calTax());

        empList.stream().forEach(System.out::println);
        empList.stream()
                .flatMap(Collection::stream)
                .filter(emp -> emp.getSalary() > 100).
                forEach(System.out::println);

        empList.stream()
                .flatMap(Collection::stream)
                .filter(emp -> emp.getSalary() > 100)
                .sorted(Comparator.comparing(Emp::getName)
                        .thenComparing(Emp::getId).reversed())
                .collect(Collectors.toList())
                .forEach(System.out::println);

        boolean parallel = empList.stream().parallel().isParallel();
        System.out.println("praller stream datai >>> ");
        empList.parallelStream()
                .flatMap(Collection::parallelStream)
                .forEach(System.out::println);
        System.out.println("is paralle :  " + parallel);
    }

    public static void convertListAfterJava8() {

        EmpService empService = new EmpService();

        List<Emp> empList = empService.calTax();

        Map<Integer, Emp> integerEmpMap = empList.stream()
                .collect(Collectors.toMap(Emp::getId, Function.identity()));
        System.out.println(" in map data is :: " + integerEmpMap);

        List<Integer> collect = integerEmpMap.keySet().stream()
                .collect(Collectors.toList());
        System.out.println(" keys is :: "+ collect);

    }
}
