package com.example.demo.java8stream;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class Bracketbalanced {
    public static void main(String[] args) {
        String str = "[]";
        String str2 = "{[]}[";
        List<String> bracesList = new ArrayList<>();
        bracesList.add(str);
        bracesList.add(str2);

        System.out.println(" is balance : " + areBracketsBalanced(bracesList));
    }

    static List<String> areBracketsBalanced(List<String> bracesList) {
        // Using ArrayDeque is faster than using Stack class
        List<String> resultList = new ArrayList<>();

        for (String braces : bracesList) {
            resultList.add(validateStr(braces));
        }
        return resultList;
    }

    static String validateStr(String braces) {
        Deque<Character> stack
                = new ArrayDeque<Character>();
        boolean isEmptty = false;
        // Traversing the Expression
        for (int i = 0; i < braces.length(); i++) {
            char x = braces.charAt(i);

            if (x == '(' || x == '[' || x == '{') {
                // Push the element in the stack
                stack.push(x);
                continue;
            }

            // If current character is not opening
            // bracket, then it must be closing. So stack
            // cannot be empty at this point.
            if (stack.isEmpty())
                return "NO";
            char check;
            switch (x) {
                case ')':
                    check = stack.pop();
                    if (check == '{' || check == '[')
                        return "NO";
                    break;

                case '}':
                    check = stack.pop();
                    if (check == '(' || check == '[')
                        return "NO";
                    break;

                case ']':
                    check = stack.pop();
                    if (check == '(' || check == '{')
                        return "NO";
                    break;
            }
        }

        // Check Empty Stack
        isEmptty = stack.isEmpty();
        if (isEmptty)
            return "YES";
        else return "NO";
    }


}
