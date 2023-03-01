package com.jackycode.algorithm;

import com.jackycode.algorithm.search.BinarySearch;
import com.jackycode.algorithm.search.InterpolationSearch;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

public class SearchTest {

    @Test
    public void binarySearchTest() {
        int[] arr = new int[]{1, 8, 10, 89, 1000, 1000, 1234};
        BinarySearch search = new BinarySearch();
        List<Integer> act = search.start(arr, 89);
        Assertions.assertArrayEquals(new Integer[]{3}, act.toArray());
        act = search.start(arr, 1000);
        Assertions.assertArrayEquals(new Integer[]{5,4}, act.toArray());
        act = search.start(arr, 7);
        Assertions.assertArrayEquals(new Integer[]{-1}, act.toArray());

    }

    @Test
    public void interpolationSearchTest() {
        int[] arr = new int[]{1, 8, 10, 89, 1000, 1000, 1234};
        InterpolationSearch search = new InterpolationSearch();
        int idx = search.start(arr, 89);
        Assertions.assertEquals(3, idx);
        idx = search.start(arr, 1000);
        Assertions.assertEquals(4, idx);
        idx = search.start(arr, 7);
        Assertions.assertEquals(-1, idx);
    }

}
