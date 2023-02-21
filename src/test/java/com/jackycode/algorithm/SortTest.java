package com.jackycode.algorithm;

import com.jackycode.algorithm.sort.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class SortTest {

    @Test
    public void bubbleSortTest() {
        int[] arr = new int[]{3, 9, -1, 20, 10};
        BubbleSort sort = new BubbleSort();
        sort.process(arr);
        Assertions.assertArrayEquals(new int[]{-1,3,9,10,20}, arr);
    }

    @Test
    public void selectSortTest() {
        int[] arr = new int[]{3, 9, -1, 20, 10};
        SelectSort sort = new SelectSort();
        sort.process(arr, true);
        Assertions.assertArrayEquals(new int[]{-1,3,9,10,20}, arr);
        sort.process(arr, false);
        Assertions.assertArrayEquals(new int[]{20,10,9,3,-1}, arr);
    }

    @Test
    public void insertionSortTest() {
        int[] arr = new int[]{3, 9, -1, 20, 10};
        InsertionSort sort = new InsertionSort();
        sort.process(arr);
        Assertions.assertArrayEquals(new int[]{-1,3,9,10,20}, arr);
    }

    @Test
    public void shellSort() {
        int[] arr = new int[]{3, 9, -1, 20, 10};
        ShellSort sort = new ShellSort();
        sort.process_swap(arr);
        Assertions.assertArrayEquals(new int[]{-1,3,9,10,20}, arr);
        int[] arr1 = new int[]{3, 9, -1, 20, 10};
        sort.process_move(arr1);
        Assertions.assertArrayEquals(new int[]{-1,3,9,10,20}, arr1);
    }

    @Test
    public void quickSort() {
        int[] arr = new int[]{3, 9, -1, 20, 10};
        QuickSort sort = new QuickSort();
        sort.process(arr, 0, arr.length-1);
        Assertions.assertArrayEquals(new int[]{-1,3,9,10,20}, arr);
    }

    @Test
    public void mergeSort() {
        int[] arr = new int[]{3, 9, -1, 20, 10};
        MergeSort sort = new MergeSort();
        sort.process(arr);
        Assertions.assertArrayEquals(new int[]{-1,3,9,10,20}, arr);
    }

    @Test
    public void radixSort() {
        int[] arr = new int[]{53,3,542,748,14,214};
        RadixSort sort = new RadixSort();
        sort.process(arr);
        Assertions.assertArrayEquals(new int[]{3,14,53,214,542,748}, arr);
    }

}
