package com.jackycode.datastructure.arrayAndQueue;

public class CircleQueue {

    private int maxSize;
    private int front;
    private int rear;
    private int[] arr;

    public CircleQueue(int arrMaxSize) {
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
        int num = arr[front];
        if(front == rear) { // 代表這是隊列中最後一個數了，取完後隊列重新開始
            front = -1;
            rear = -1;
            return num;
        }
        front = (front+1) % maxSize;
        return num;
    }

    /**
     * 放入數據到隊列
     */
    public void add(int num) {
        if(isFull()) {
            System.out.println("隊列滿了");
            return;
        }
        if(front == -1) {
            front = 0;
        }
        rear = (rear+1) % maxSize;
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
        System.out.println("front=" + front + ", rear=" + rear);
        for(int i=front; i != rear; i = (i+1) % maxSize) {
            System.out.printf("arr[%d]=%d\n", i, arr[i]);
        }
        System.out.printf("arr[%d]=%d\n", rear, arr[rear]);
    }

    /**
     * 判斷隊列是否為空
     */
    public boolean isEmpty() {
        return front == -1;
    }

    /**
     * 判斷隊列是否滿了
     */
    public boolean isFull() {
        if((front == 0 && rear == maxSize-1) || (front == rear+1)) {
            return true;
        }
        return false;
    }
}
