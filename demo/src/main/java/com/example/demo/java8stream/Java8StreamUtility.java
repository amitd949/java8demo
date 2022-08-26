package com.example.demo.java8stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.DoublePredicate;

public class Java8StreamUtility {

    public static void main(String[] args) {
        Employee employee = new Employee(10, "test", 1000);
        Employee employee1 = new Employee(11, "test", 3000);
        Employee employee2 = new Employee(12, "test", 2000);

        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(employee);
        employeeList.add(employee1);
        employeeList.add(employee2);

        sortbyField(employeeList);
    }

    public static void sortbyField(List<Employee> employeeList) {
        //DoublePredicate
        employeeList.sort(Comparator.comparing(Employee::getSalary));
        System.out.println("after the sorting " + employeeList);

        employeeList.sort(Comparator.comparing(Employee::getAge).reversed().thenComparing(Employee::getName));
        System.out.println("after the sorting " + employeeList);


    }
}
