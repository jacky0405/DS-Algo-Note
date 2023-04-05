package com.jackycode.datastructure.tree;

public class HeroNode2 {

    public int id;
    public String name;
    public HeroNode2 left;
    public HeroNode2 right;
    // 左節點類型 0:子節點 1:前驅節點
    public int leftType;
    // 右節點類型 0:子節點 1:前驅節點
    public int rightType;

    public HeroNode2(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "HeroNode2{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
