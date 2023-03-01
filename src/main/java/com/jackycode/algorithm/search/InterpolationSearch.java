package com.jackycode.algorithm.search;

public class InterpolationSearch {

    public int start(int[] arr, int target) {
        int l = 0, r = arr.length - 1;
        while(l < r) {
            int mid = l + (r - l) * (target -arr[l]) / (arr[r] - arr[l]);
            if(arr[mid] == target) {
                return mid;
            }
            if(arr[mid] < target) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }

        return -1;
    }
}
