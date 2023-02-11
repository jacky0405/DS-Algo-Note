package com.jackycode.datastructure;

import com.jackycode.datastructure.linkedList.*;
import org.junit.jupiter.api.Test;

public class LinkedListTest {

    /**
     *  單向鏈表新增測試
     */
    @Test
    public void singleLinkedListTest() {
        HeroNode hero1 = new HeroNode(1, "趙雲");
        HeroNode hero2 = new HeroNode(2, "邦尼");
        HeroNode hero3 = new HeroNode(3, "特爾安娜斯");
        SingleLinkedList list = new SingleLinkedList();
        list.add(hero2);
        list.add(hero1);
        list.add(hero3);
        list.show();
    }

    /**
     * 單向鏈表新增測試(有排序)
     */
    @Test
    public void singleLinkedListTest2() {
        HeroNode hero1 = new HeroNode(1, "趙雲");
        HeroNode hero2 = new HeroNode(2, "邦尼");
        HeroNode hero3 = new HeroNode(3, "特爾安娜斯");
        SingleLinkedList list = new SingleLinkedList();
        list.addByOrder(hero2);
        list.addByOrder(hero1);
        list.addByOrder(hero3);
        list.show();
    }

    /**
     * 單向鏈表刪除測試
     */
    @Test
    public void singleLinkedListTest3() {
        HeroNode hero1 = new HeroNode(1, "趙雲");
        HeroNode hero2 = new HeroNode(2, "邦尼");
        HeroNode hero3 = new HeroNode(3, "特爾安娜斯");
        SingleLinkedList list = new SingleLinkedList();
        list.addByOrder(hero2);
        list.addByOrder(hero1);
        list.addByOrder(hero3);
        list.remove(2);
        list.show();
    }

    /**
     * 單向鏈表修改測試
     */
    @Test
    public void singleLinkedListTest4() {
        HeroNode hero1 = new HeroNode(1, "趙雲");
        HeroNode hero2 = new HeroNode(2, "邦尼");
        HeroNode hero3 = new HeroNode(3, "特爾安娜斯");
        SingleLinkedList list = new SingleLinkedList();
        list.addByOrder(hero2);
        list.addByOrder(hero1);
        list.addByOrder(hero3);
        HeroNode hero2_modi = new HeroNode(2, "邦尼2");
        list.update(hero2_modi);
        list.show();
    }

    /**
     * 雙向鏈表測試
     */
    @Test
    public void doubleLinkedListTest() {
        HeroNode2 hero1 = new HeroNode2(1, "趙雲");
        HeroNode2 hero2 = new HeroNode2(2, "邦尼");
        HeroNode2 hero3 = new HeroNode2(3, "特爾安娜斯");
        DoubleLinkedList list = new DoubleLinkedList();
        list.addByOrder(hero2);
        list.addByOrder(hero1);
        list.addByOrder(hero3);
        list.show();
        System.out.println("------------------");
        HeroNode2 hero2_modi = new HeroNode2(2, "邦尼2");
        list.update(hero2_modi);
        list.remove(3);
        list.show();
    }

    /**
     * 環形單向鏈表測試
     */
    @Test
    public void circleLinkedListTest() {
        CircleSingleLinkedList list = new CircleSingleLinkedList();
        list.add(5);
        list.show();
        list.countBoy(1,2,5);
    }
}
