package com.jackycode.datastructure.stack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class ReversePolishCalculator {

    public int getResult(String exp) {

        List<String> nums = Arrays.asList(exp.split(" "));

        Stack<Integer> numStack = new Stack<>();
        for(String s : nums) {
            if(s.matches("[0-9]+")) {
                numStack.push(Integer.parseInt(s));
                continue;
            }
            int num1 = numStack.pop();
            int num2 = numStack.pop();
            char c = s.charAt(0);
            int res = cal(num1, num2, c);
            numStack.push(res);
        }

        return numStack.pop();
    }

    private int cal(int num1, int num2, char oper) {

        switch (oper) {
            case '+':
                return num1 + num2;
            case '-':
                return num2 - num1;
            case '*':
                return num1 * num2;
            case '/':
                return num2 / num1;
        }

        throw new RuntimeException("符號不支持");
    }

}
