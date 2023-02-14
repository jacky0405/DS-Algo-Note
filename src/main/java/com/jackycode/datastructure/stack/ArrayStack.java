package com.jackycode.datastructure.stack;

public class ArrayStack {

    int[] stack;
    int maxSize; // 棧的最大容量
    int top = -1;

    public ArrayStack(int maxSize) {
        this.maxSize = maxSize;
        this.stack = new int[maxSize];
    }

    /**
     * 檢查棧是否已滿
     */
    public boolean isFull() {
        return maxSize - 1 == top;
    }

    /**
     * 檢查棧是否為空
     */
    public boolean isEmpty() {
        return top == -1;
    }

    /**
     * 入棧
     */
    public void push(int val) {
        if(isFull()) {
            System.out.println("棧已滿");
            return;
        }
        stack[++top] = val;
    }

    /**
     * 出棧
     */
    public int pop() {
        if(isEmpty()) {
            throw new RuntimeException("棧中無元素");
        }
        return stack[top--];
    }

    /**
     * 檢查棧頂元素
     */
    public int peek() {
        if(isEmpty()) {
            throw new RuntimeException("棧中無元素");
        }
        return stack[top];
    }

    /**
     * 顯示佔中元素
     */
    public void show() {
        if(isEmpty()) {
            System.out.println("棧為空");
        }
        for(int i=top; i >= 0; i--) {
            System.out.printf("stack[%d]=%d\n", i, stack[i]);
        }
    }

}
