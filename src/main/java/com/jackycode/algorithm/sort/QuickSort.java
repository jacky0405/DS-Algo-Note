package com.jackycode.algorithm.sort;

public class QuickSort {

    public void process(int[] arr, int left, int right) {
        if(left >= right) {
            return;
        }
        // 最左為基準點
        int pivot = arr[left];
        int l = left;
        int r = right+1;
        while(l < r) {
            while(l+1 < arr.length && arr[++l] < pivot);
            while(r-1 >= 0 && arr[--r] > pivot);

            if(l >= r) {
                break;
            }
            swap(l, r, arr);
        }

        swap(left , r, arr); // 基準點與 r 交換
        process(arr, left , r - 1);
        process(arr, r + 1 , right);

    }

    private void swap(int i, int j, int[] arr) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }
}
