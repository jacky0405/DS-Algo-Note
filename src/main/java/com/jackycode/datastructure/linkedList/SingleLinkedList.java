package com.jackycode.datastructure.linkedList;

public class SingleLinkedList {

    // 創建頭部
    private HeroNode head = new HeroNode(0,"");

    /**
     * 添加節點(不按照排名順序)
     */
    public void add(HeroNode node) {
        HeroNode tmp = head;
        while(tmp.next != null) {
            tmp = tmp.next;
        }
        tmp.next = node;
    }

    /**
     * 添加節點(會按照排名順序插入)
     */
    public void addByOrder(HeroNode node) {
        HeroNode tmp = head;
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
                return;
            }
            tmp = tmp.next;
        }
        tmp.next = node;
    }

    /**
     *  刪除鏈表元素
     */
    public void remove(int no) {
        HeroNode tmp = head;
        if(tmp.next == null) {
            System.out.println("鏈表為空");
        }
        while(tmp.next != null) {
            if(tmp.next.no == no) {
                tmp.next = tmp.next.next;
                return;
            }
            tmp = tmp.next;
        }
    }

    /**
     * 鏈表元素修改
     */
    public void update(HeroNode node) {
        HeroNode tmp = head;
        while(tmp.next != null) {
            if(tmp.next.no == node.no) {
                node.next = tmp.next.next;
                tmp.next = node;
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
        HeroNode tmp = head.next;
        while(tmp != null) {
            System.out.println(tmp.toString());
            tmp = tmp.next;
        }
    }

}
