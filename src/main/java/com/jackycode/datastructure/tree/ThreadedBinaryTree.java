package com.jackycode.datastructure.tree;

public class ThreadedBinaryTree {

    public HeroNode2 pre;

    public void threadedNode(HeroNode2 node) {
        if(node == null) {
            return;
        }
        this.threadedNode(node.left);

        if(node.left == null) {
            node.left = pre;
            node.leftType = 1;
        }

        if(pre != null && pre.right == null) {
            pre.right = node;
            pre.rightType = 1;
        }

        pre = node;

        this.threadedNode(node.right);
    }

}
