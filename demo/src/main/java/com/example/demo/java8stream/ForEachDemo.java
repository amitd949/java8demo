package com.example.demo.java8stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class ForEachDemo {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList();
       /* al.add("A");
        al.add("b");
        al.add("c");
        al.add("d");*/
        al.forEach(i -> System.out.println("list item :>>> " + i));
        // by using lamda.

        Consumer<String> consumer = (t) -> System.out.println("using lamda :::<< >>> " + t);
        al.forEach(consumer);

        Supplier<String> st = () -> {
            System.out.println(" supplier part is ");
            return "default value is test";
        };


        al.stream().findAny().orElseGet(st);

        Map<String, Integer> map = new HashMap<>();
        map.put("a", 1);
        map.put("b", 2);
        map.put("c", 3);
        map.put("d", 4);
        map.forEach((param1, param2) -> System.out.println("key " + param1 + " and value is >> " + param2));
        map.forEach((param1, param2) -> System.out.println("key " + param1 + " and value is >> " + param2));

        map.entrySet().stream().filter(i -> i.getValue() % 2 == 0).forEach(keyvalue -> System.out.println(" only even values  key values is  " + keyvalue));

        EmpService empService = new EmpService();
        empService.calTax().forEach(obj -> System.out.println("taxable detail -- >> " + obj.toString()));
        empService.calTax().sort(Comparator.comparing(Emp::getSalary).reversed());
        int avgid = empService.calTax().stream().collect(Collectors.averagingInt(Emp::getId)).intValue();
        int total = empService.calTax().stream().collect(Collectors.summingInt(Emp::getId)).intValue();

        int count = empService.calTax().stream().collect(Collectors.counting()).intValue();

        System.out.println("svg of " + avgid + "total " + total + "count : >> " + count);
        empService.calTax().stream().filter(obj -> obj.getId() >= 1)
                .sorted(Comparator.comparing(Emp::getSalary)
                        .thenComparing(Emp::getId).reversed())
                .forEach(System.out::println);

    }
}
