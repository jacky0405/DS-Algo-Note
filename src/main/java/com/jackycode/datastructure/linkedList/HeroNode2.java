package com.jackycode.datastructure.linkedList;

public class HeroNode2 {

    public int no;
    public String name;
    public HeroNode2 next;
    public HeroNode2 pre;

    public HeroNode2(int no, String name) {
        this.no = no;
        this.name = name;
    }

    @Override
    public String toString() {
        return "HeroNode2{" +
                "no=" + no +
                ", name='" + name + '\'' +
                '}';
    }
}
