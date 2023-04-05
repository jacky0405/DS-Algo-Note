package com.jackycode.datastructure.tree;

import java.util.List;

public class BinaryTree {

    private HeroNode root;

    public BinaryTree(HeroNode root) {
        this.root = root;
    }

    public void preOrder() {
        if(this.root == null) {
            System.out.println("樹為空");
            return;
        }
        root.preOrder();
    }

    public void inOrder() {
        if(this.root == null) {
            System.out.println("樹為空");
            return;
        }
        root.inOrder();
    }

    public void postOrder() {
        if(this.root == null) {
            System.out.println("樹為空");
            return;
        }
        root.postOrder();
    }

    public HeroNode preOrderSearch(int id) {
        if(this.root == null) {
            System.out.println("樹為空");
            return null;
        }
        return root.preOrderSearch(id);
    }

    public HeroNode inOrderSerach(int id) {
        if(this.root == null) {
            System.out.println("樹為空");
            return null;
        }
        return root.inOrderSearch(id);
    }

    public HeroNode postOrderSearch(int id) {
        if(this.root == null) {
            System.out.println("樹為空");
            return null;
        }
        return root.postOrderSearch(id);
    }

}
