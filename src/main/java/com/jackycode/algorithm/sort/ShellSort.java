package com.jackycode.algorithm.sort;

public class ShellSort {

    public void process_swap(int[] arr) {
        int gap = arr.length / 2;
        while(gap > 0) {
            for(int i=gap; i < arr.length; i++) {
                for(int j=i-gap; j >= 0; j -= gap) {
                    if(arr[j] > arr[j+gap]) {
                        swap(j, j+gap, arr);
                    }
                }
            }
            gap /= 2;
        }
    }

    public void process_move(int[] arr) {
        int gap = arr.length / 2;
        while(gap > 0) {
            for(int i=gap; i < arr.length; i++) {
                int currVal = arr[i];
                int comIdx = i - gap;
                while(comIdx >= 0 && arr[comIdx] > currVal) {
                    arr[comIdx + gap] = arr[comIdx];
                    comIdx -= gap;
                }
                arr[comIdx + gap] = currVal;
            }
            gap /= 2;
        }
    }

    private void swap(int i, int j, int[] arr) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }
}
