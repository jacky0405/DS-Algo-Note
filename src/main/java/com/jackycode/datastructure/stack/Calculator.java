package com.jackycode.datastructure.stack;

public class Calculator {

    private ArrayStack numStack = new ArrayStack(10);
    private ArrayStack operStack = new ArrayStack(10);

    public void scan(String exp) {

        String multiNum = ""; // 用於儲存多位數數字

        for(int i=0; i < exp.length(); i++) {
            char c = exp.charAt(i);

            if(isOper(c)) {
                if(operStack.isEmpty()) { // 符號棧為空則，直接壓入
                    operStack.push(c);
                    continue;
                }
                // 當前操作符優先級大於棧頂時
                if(getPriority(c) > getPriority((char)operStack.peek())) {
                    operStack.push(c);
                    continue;
                }
                // 當前操作符優先級小於或等於棧頂時
                int num1 = numStack.pop();
                int num2 = numStack.pop();
                char oper = (char)operStack.pop();
                int res = cal(num1, num2, oper);
                numStack.push(res);
                operStack.push(c);
            } else {
                multiNum += c;
                if(i == exp.length()-1) {
                    numStack.push(Integer.parseInt(multiNum));
                    continue;
                }
                char nextchar = exp.charAt(i+1); // 判斷下個char是否為數字或符號
                if(isOper(nextchar)) {
                    numStack.push(Integer.parseInt(multiNum));
                    multiNum = "";
                }
            }
        }

    }

    public int getResult() {

        while(!operStack.isEmpty()) {
            int num1 = numStack.pop();
            int num2 = numStack.pop();
            char oper = (char)operStack.pop();
            int res = cal(num1, num2, oper);
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

        return 0; // 不會走到
    }

    private int getPriority(char c) {
        switch (c) {
            case '*':
            case '/':
                return 1;
            case '+':
            case '-':
                return 0;
        }

        return -1;
    }

    private boolean isOper(char c) {
        switch (c) {
            case '+':
            case '-':
            case '*':
            case '/':
                return true;
        }

        return false;
    }

}
