package com.jackycode.datastructure.arrayAndQueue;

public class ArrayQueue {

    private int maxSize;
    private int front;
    private int rear;
    private int[] arr;

    public ArrayQueue(int arrMaxSize) {
        maxSize = arrMaxSize;
        front = -1;
        rear = -1;
        arr = new int[arrMaxSize];
    }

    /**
     * 取出隊列數據
     */
    public int get() {
        if(isEmpty()) {
            throw new RuntimeException("隊列為空，不能取值");
        }
        front++;
        return arr[front];
    }

    /**
     * 放入數據到隊列
     */
    public void add(int num) {
        if(isFull()) {
            System.out.println("隊列滿了");
            return;
        }
        rear++;
        arr[rear] = num;
    }

    /**
     * 顯示隊列數據
     */
    public void show() {
        if(isEmpty()) {
            System.out.println("隊列為空");
            return;
        }
        for(int i=0; i < arr.length; i++) {
            System.out.printf("arr[%d]=%d\n", i, arr[i]);
        }
    }

    /**
     * 查看隊列頭部數據
     */
    public int head() {
        if(isEmpty()) {
            throw new RuntimeException("隊列為空");
        }
        return arr[front+1];
    }

    /**
     * 查看隊列尾部數據
     */
    public int tail() {
        if(isEmpty()) {
            throw new RuntimeException("隊列為空");
        }
        return arr[rear];
    }

    /**
     * 判斷隊列是否為空
     */
    public boolean isEmpty() {
        return front == rear;
    }

    /**
     * 判斷隊列是否滿了
     */
    public boolean isFull() {
        return rear == maxSize-1;
    }

}
