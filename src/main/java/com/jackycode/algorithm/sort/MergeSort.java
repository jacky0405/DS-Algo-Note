package com.jackycode.algorithm.sort;

public class MergeSort {

    public void process(int[] arr) {
        int[] tmp = new int[arr.length];
        doMergeSort(arr, 0, arr.length-1, tmp);
    }

    private void doMergeSort(int[] arr, int left, int right, int[] tmp) {
        if(left < right) {
            // 先分到最小
            int mid = (left + right) / 2;
            doMergeSort(arr, left, mid, tmp);
            doMergeSort(arr, mid+1, right, tmp);
            // 在合併
            merge(arr, left, mid, right, tmp);
        }
    }

    private void merge(int[] arr, int left, int mid, int right, int[] tmp) {
        int l = left;
        int r = mid + 1;
        int tmpIdx = 0;
        while(l <= mid && r <= right) {
            if(arr[l] < arr[r]) {
                tmp[tmpIdx++] = arr[l++];
            } else {
                tmp[tmpIdx++] = arr[r++];
            }
        }
        while(l <= mid) {
            tmp[tmpIdx++] = arr[l++];
        }
        while(r <= right) {
            tmp[tmpIdx++] = arr[r++];
        }

        // 覆蓋原數組
        tmpIdx = 0;
        int tmpL = left;
        while(tmpL <= right) {
            arr[tmpL++] = tmp[tmpIdx++];
        }
    }
}
