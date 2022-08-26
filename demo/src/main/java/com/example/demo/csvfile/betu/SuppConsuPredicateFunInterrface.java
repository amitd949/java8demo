package com.example.demo.csvfile.betu;

import java.util.*;
import java.util.function.*;
import java.util.stream.Collectors;

import static java.lang.System.*;

public class SuppConsuPredicateFunInterrface {

    public static void main(String[] args) {

        supplierUsage();
        out.println("consumer");
        consumerUsage();

        predicateTest();

        testFunctions();


    }

    private static void predicateTest() {

        List<String> names = Arrays.asList("John", "Smith", "Samueal", "Catley", "Sie");
        Predicate<String> nameStartsWithS = (str) -> str.startsWith("S");
        names.stream().filter(nameStartsWithS).forEach(out::println);

        Consumer<String> stringConsumer = out::println;
        names.stream().filter(nameStartsWithS).forEach(out::println);
        names.stream().filter(nameStartsWithS).forEach(stringConsumer);
    }

    private static void consumerUsage() {

        List<List<String>> listListData = new ArrayList<>();
        listListData.add(Arrays.asList("10", "20", "30"));

        List<String> collect = listListData.stream()
                .flatMap(Collection::stream).

                        collect(Collectors.toList());

        collect.forEach(out::println);
        collect.stream().filter(s -> Integer.parseInt(s) > 10).forEach(out::println);
        // using consumer interface;
        Consumer<String> printdata = t -> out.println(" consuker data is :" + t);
        collect.forEach(printdata);


    }

    private static void supplierUsage() {
        Supplier<Double> doubleSupplier1 = Math::random;
        DoubleSupplier doubleSupplier2 = Math::random;

        out.println(doubleSupplier1.get());
        out.println(doubleSupplier2.getAsDouble());
    }

    public static void testFunctions() {
        List<String> names = Arrays.asList("Smith", "Gourav", "Heather", "John", "Catania");
        Function<String, Integer> nameMappingFunction = String::length;
        List<Integer> nameLength = names.stream().map(nameMappingFunction).collect(Collectors.toList());
        out.println(nameLength);
    }
}
