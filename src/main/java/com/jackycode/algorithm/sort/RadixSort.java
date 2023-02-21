package com.jackycode.algorithm.sort;

import java.util.Arrays;

public class RadixSort {

    public void process(int[] arr) {
        // 得到最大位數
        int max = arr[0];
        for(int i : arr) {
            if(i > max) {
                max = i;
            }
        }
        int maxLength = (max+"").length();

        // 定義桶
        int[][] buckets = new int[10][arr.length];
        int[] bucketsElementCount = new int[buckets.length];

        // 開始循環數值放入桶
        int divideNum = 1;
        for(int i=0; i < maxLength; i++) {
            // 將元素放入桶
            for (int j = 0; j < arr.length; j++) {
                int digit = arr[j] / divideNum % 10;
                buckets[digit][bucketsElementCount[digit]] = arr[j];
                bucketsElementCount[digit] += 1;
            }

            // 將桶中元素取出放入數組
            int idx = 0;
            for (int k = 0; k < buckets.length; k++) {
                int tmpIdx = 0;
                while (bucketsElementCount[k] > 0) {
                    arr[idx++] = buckets[k][tmpIdx++];
                    bucketsElementCount[k]--;
                }
            }
            divideNum *= 10;
        }

    }

}
