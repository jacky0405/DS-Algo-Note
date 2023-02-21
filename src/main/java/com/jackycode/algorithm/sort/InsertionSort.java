package com.jackycode.algorithm.sort;

public class InsertionSort {

    public void process(int[] arr) {

        for(int i=1; i < arr.length; i++) {
            int currVal = arr[i];
            int compIdx = i-1;
            while(compIdx >= 0 && currVal < arr[compIdx]) {
                arr[compIdx+1] = arr[compIdx];
                compIdx--;
            }
            arr[compIdx+1] = currVal;
        }
    }
}
