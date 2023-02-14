package com.jackycode.datastructure.stack;

public class LinkedListStack {

    int maxSize;
    int size; // 記錄當前鏈表中有多少元素
    StackNode top;

    public LinkedListStack(int maxSize) {
        this.maxSize = maxSize;
    }

    /**
     * 檢查棧是否已滿
     */
    public boolean isFull() {
        return maxSize == size;
    }

    /**
     * 檢查棧是否為空
     */
    public boolean isEmpty() {
        return size == 0;
    }

    /**
     * 入棧
     */
    public void push(int val) {
        if(isFull()) {
            System.out.println("棧已滿");
            return;
        }
        StackNode tmp = top;
        top = new StackNode(val);
        top.next = tmp;
        size++;
    }

    /**
     * 出棧
     */
    public int pop() {
        if(isEmpty()) {
            throw new RuntimeException("棧中無元素");
        }
        int tmp = top.val;
        top = top.next;
        size--;
        return tmp;
    }

    /**
     * 顯示佔中元素
     */
    public void show() {
        if(isEmpty()) {
            System.out.println("棧為空");
        }
        StackNode cur = top;
        while(cur != null) {
            System.out.println(cur);
            cur = cur.next;
        }
    }
}
