package com.jackycode.datastructure.linkedList;

public class CircleSingleLinkedList {

    Boy first = null;

    public void add(int num) {
        if(num < 1) {
            System.out.println("至少添加1個小孩");
        }
        Boy curBoy = null;
        for(int i=1; i <= num; i++) {
            Boy boy = new Boy(i);
            if(first == null) {
                first = boy;
                curBoy = first;
                boy.next = first;
                continue;
            }
            curBoy.next = boy;
            boy.next = first;
            curBoy = curBoy.next;
        }
    }

    /**
     *
     * @param startNo 從第幾個小孩開始數
     * @param countNum 數幾下
     * @param num 參與遊戲的人數
     */
    public void countBoy(int startNo, int countNum, int num) {
        // 將helper指向first的後一個節點
        Boy helper = first;
        while(helper.next != first) {
            helper = helper.next;
        }
        // 將指針移動至startNo位置
        for(int i=1; i <= startNo-1; i++) {
            first = first.next;
            helper = helper.next;
        }
        // 開始報數
        while(first != helper) {
            for(int i=0; i < countNum-1; i++) {
                first = first.next;
                helper = helper.next;
            }
            // 被first指向就拉出去
            System.out.print(first.no + " ");
            first = first.next;
            helper.next = first;
        }

        System.out.println(first.no);

    }

    public void show() {
        if(first == null) {
            System.out.println("鏈表為空");
        }
        Boy cur = first;
        while(cur.next != first) {
            System.out.print(cur.no + " ");
            cur = cur.next;
        }
        System.out.println(cur.no);
    }
}
