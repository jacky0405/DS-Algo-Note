package com.jackycode.algorithm.search;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BinarySearch {

    public List<Integer> start(int[] arr, int target) {
        List<Integer> result = new ArrayList<>();
        if(arr.length == 0) {
            return result;
        }
        int l = 0, r = arr.length - 1;

        while (l < r) {
            int mid = (l+r) / 2;

            // 找到後，再往左右查找有無相同的值
            if(target == arr[mid]) {
                result.add(mid);
                // 先向右找
                int tmpIdx = mid + 1;
                while(tmpIdx < arr.length && arr[tmpIdx] == target) {
                    result.add(tmpIdx);
                    tmpIdx += 1;
                }
                // 向左找
                tmpIdx = mid - 1;
                while(tmpIdx >= 0 && arr[tmpIdx] == target) {
                    result.add(tmpIdx);
                    tmpIdx -= 1;
                }
                return result;
            }

            if(arr[mid] < target) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }

        }

        return Arrays.asList(-1);

    }
}
