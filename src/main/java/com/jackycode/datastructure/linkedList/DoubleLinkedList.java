package com.jackycode.datastructure.linkedList;

public class DoubleLinkedList {

    // 創建頭部
    private HeroNode2 head = new HeroNode2(0,"");

    /**
     * 添加節點(不按照排名順序)
     */
    public void add(HeroNode2 node) {
        HeroNode2 tmp = head;
        while(tmp.next != null) {
            tmp = tmp.next;
        }
        tmp.next = node;
        node.pre = tmp;
    }

    /**
     * 添加節點(會按照排名順序插入)
     */
    public void addByOrder(HeroNode2 node) {
        HeroNode2 tmp = head;
        if(tmp.next == null) {
            head.next = node;
            return;
        }
        while(tmp.next != null) {
            if(tmp.next.no == node.no) {
                System.out.println("已有相同英雄");
            }
            if(tmp.next.no > node.no) {
                node.next = tmp.next;
                tmp.next = node;
                node.pre = tmp;
                return;
            }
            tmp = tmp.next;
        }
        tmp.next = node;
        node.pre = tmp;
    }

    /**
     *  刪除鏈表元素
     */
    public void remove(int no) {
        HeroNode2 tmp = head.next;
        if(tmp == null) {
            System.out.println("鏈表為空");
        }
        while(tmp != null) {
            if(tmp.no == no) {
                tmp.pre.next = tmp.next;
                if(tmp.next != null) {
                    tmp.next.pre = tmp.pre;
                }
                return;
            }
            tmp = tmp.next;
        }
    }

    /**
     * 鏈表元素修改
     */
    public void update(HeroNode2 node) {
        HeroNode2 tmp = head.next;
        while(tmp.next != null) {
            if(tmp.next.no == node.no) {
                node.next = tmp.next.next;
                tmp.next.next.pre = node;
                tmp.next = node;
                node.pre = tmp;
                return;
            }
            tmp = tmp.next;
        }
        System.out.println("並無該英雄");
    }

    /**
     * 印出鏈表中的節點訊息
     */
    public void show() {
        if(head.next == null) {
            System.out.println("鏈表為空");
            return;
        }
        HeroNode2 tmp = head.next;
        while(tmp != null) {
            System.out.println(tmp.toString());
            tmp = tmp.next;
        }
    }

}
