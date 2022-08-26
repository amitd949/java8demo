package com.example.demo.csvfile;

import lombok.Data;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
@Data
public class User {
    private String id;
    private int age;
    private String name;

    public User(String id, int age, String name) {
        this.id = id;
        this.age = age;
        this.name = name;
    }

    public User() {

    }

    static int[] commonFootSteps(int fatherPos, int martinPos, int velFather, int steps) {

        int[] answer = new int[2];
        int[] temp = new int[steps + 1];
        for (int i = 0; i <= steps; i++)
            temp[i] = fatherPos + velFather * i - martinPos;
        for (int i = 0; i <= steps; i++) {
            if (temp[i] <= 0)
                continue;
            int v2 = temp[i];
            int count = 0;
            for (int j = i; j <= steps; j++) {
                if (temp[j] % v2 == 0)
                    count++;
            }

            if (answer[0] <= count) {
                answer[0] = count;
                answer[1] = v2;
            }
        }

        return answer;

    }

    public static void main(String[] args) {

        List<User> userList = new ArrayList<>();
        userList.add(new User("1", 25, "A"));
        userList.add(new User("2", 26, "B"));
        userList.add(new User("3", 27, "C"));
        // print age>25
        userList.stream().filter(e -> e.age > 25).forEach(System.out::println);
        userList.stream().filter(e -> e.age > 25).map(e -> e.age).collect(Collectors.toList()).forEach(System.out::println);
        Integer[] data = new Integer[]{0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0};
//userList.stream().sorted(Comparator.comparing(User::getAge)).reduce()
        sorts(data);
        for(int i=0;i< data.length-1;++i){

            System.out.println(data[i]);
        }

// all 0 left side , all 1 in right.
        //0,0,0,0,0,1,1,1,1
        Integer[] data2 = new Integer[11];
        int count = 0;
        for (int i = 0; i < data.length; ++i) {
            if (data[i] == 0) {
                data2[count++] = data[i];

            }

        }

        for (int i = 0; i < data.length; ++i) {
            if (data[i] == 1) {
                data2[count++] = data[i];

            }

        }

        int[] result  = commonFootSteps(3,2,2,20);
        for(int i : result)
            System.out.print(i+" ");



    }
    public static void sorts(Integer[] a) {

        //  Arrays.sort(a);
        //
        for (int i = 0; i <= a.length - 1; i++) {
            int temp = a[i];
            for (int j = i; j <= a.length - 1; ++j) {
                if (a[i] > a[j]) {
                    temp = a[j];
                    a[j] = a[i];
                    a[i] = temp;

                }

            }

        }
    }
    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}