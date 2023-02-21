package com.jackycode.algorithm.sort;

import java.util.List;

public class BubbleSort {

    public void process(int[] array) {
        boolean change = true;
        while(change) {
            change = false;
            for(int i=0; i < array.length - 1; i++) {
                if(array[i] > array[i+1]) {
                    swap(i, i+1, array);
                    change = true;
                }
            }
        }
    }

    private void swap(int i, int j, int[] arr) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }
}
