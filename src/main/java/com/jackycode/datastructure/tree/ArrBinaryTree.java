package com.jackycode.datastructure.tree;

public class ArrBinaryTree {

    int[] arr;

    public ArrBinaryTree(int[] arr) {
        this.arr = arr;
    }

    public void preOrder(int idx) {
        if(this.arr == null || this.arr.length == 0) {
            System.out.println("數組為空");
        }
        System.out.println(arr[idx]);
        int left = 2 * idx + 1;
        if(left < arr.length) {
            this.preOrder(left);
        }
        int right = 2 * idx + 2;
        if(right < arr.length) {
            this.preOrder(right);
        }
    }

    public void inOrder(int idx) {
        if(this.arr == null || this.arr.length == 0) {
            System.out.println("數組為空");
        }
        int left = 2 * idx + 1;
        if(left < arr.length) {
            this.inOrder(left);
        }
        System.out.println(arr[idx]);
        int right = 2 * idx + 2;
        if(right < arr.length) {
            this.inOrder(right);
        }
    }

    public void postOrder(int idx) {
        if(this.arr == null || this.arr.length == 0) {
            System.out.println("數組為空");
        }
        int left = 2 * idx + 1;
        if(left < arr.length) {
            this.postOrder(left);
        }
        int right = 2 * idx + 2;
        if(right < arr.length) {
            this.postOrder(right);
        }
        System.out.println(arr[idx]);
    }
}
