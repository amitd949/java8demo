package com.example.demo.csvfile.arraymanipulation;

import java.util.ArrayList;
import java.util.Stack;

public class ExprerssValidator {
    public static void main(String[] args) {

        String expr = "{([])}";
        System.out.println("is valid Expression :** " + isValidExpr(expr));

    }

    static boolean isValidExpression(String expression) {

        ArrayList<String> openBracketList = new ArrayList<>(); // {(
        openBracketList.add("{");
        openBracketList.add("(");
        openBracketList.add("[");
        // openBracketList.add("{");

        ArrayList<String> closeBraketList = new ArrayList<>();// ])} //
        closeBraketList.add("}");
        closeBraketList.add(")");
        closeBraketList.add("]");

        ArrayList<String> openDataList = new ArrayList<>();

        ArrayList<String> closeDataList = new ArrayList<>();


        for (int i = 0; i < expression.length(); ++i) {

            char c = expression.charAt(i);
            System.out.println("char  of expression is " + c);
            if (openBracketList.contains(String.valueOf(c))) {
                openDataList.add(String.valueOf(c));
            }

            if (closeBraketList.contains(String.valueOf(c))) {
                closeDataList.add(String.valueOf(c));
            }
        }
        boolean isValid = true;
        System.out.println("open data list : " + openDataList + "\n close data list : " + closeDataList);
        // validate the data
        if (openDataList.size() == closeDataList.size()) {
            int size = closeDataList.size() - 1;
            for (int i = 0; i < openDataList.size(); ++i) {

                if (openDataList.get(i) == closeDataList.get(size - 1)) {

                } else {
                    isValid = false;
                    System.out.println(" expression is not valid ");
                    break;
                }
            }
        }
        return isValid;
    }

    static boolean isValidExpr(String s) {

        Stack<Character> stack = new Stack<Character>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '[' || c == '(' || c == '{') {
                stack.push(c);
            } else if (c == ']') {
                if (stack.isEmpty() || stack.pop() != '[') {
                    return false;
                }
            } else if (c == ')' || c == ']' || c == '}') {
                //nothing to match with
                if (stack.isEmpty()) {
                    return false;
                } else if (stack.pop() != c) {
                    return false;
                }

            }

        }
        return stack.isEmpty();


    }
}
