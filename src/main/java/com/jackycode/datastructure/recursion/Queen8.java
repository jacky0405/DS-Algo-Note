package com.jackycode.datastructure.recursion;

import java.util.Arrays;

public class Queen8 {

    private int max;
    private int[] array;
    private int count = 0;

    public Queen8(int max) {
        this.max = max;
        array = new int[max];
    }

    public void start(int chessNo) {
        if(chessNo == max) {
            count++;
            print();
            return;
        }
        //  開始從頭擺放
        for(int i=0; i < max; i++) {
            array[chessNo] = i;
            if(check(chessNo)) {
                start(chessNo+1);
            }
        }
    }

    private boolean check(int chessNo) {
        for(int i=0; i < chessNo; i++) {
            if(array[chessNo] == array[i] || Math.abs(i - chessNo) == Math.abs(array[i]-array[chessNo])) {
                return false;
            }
        }
        return true;
    }

    private void print() {
        System.out.printf("第%d個結果："+ Arrays.toString(array), count);
        System.out.println();
    }
}
