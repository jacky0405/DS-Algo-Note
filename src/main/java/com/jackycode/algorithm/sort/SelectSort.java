package com.jackycode.algorithm.sort;

public class SelectSort {

    public void process(int[] arr, boolean asc) {
        for(int i=0; i < arr.length - 1; i++) {
            int curr = arr[i];
            int currIdx = i;
            if(asc) {
                for(int j=i+1; j < arr.length; j++) {
                    if(arr[j] < curr) {
                        curr = arr[j];
                        currIdx = j;
                    }
                }
            } else {
                for(int j=i+1; j < arr.length; j++) {
                    if(arr[j] > curr) {
                        curr = arr[j];
                        currIdx = j;
                    }
                }
            }

            if(currIdx == i) {
                continue;
            }
            swap(i, currIdx, arr);
        }
    }

    private void swap(int i, int j, int[] arr) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }
}
