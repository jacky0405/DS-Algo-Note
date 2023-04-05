package com.jackycode.datastructure;

import com.jackycode.datastructure.tree.*;
import org.junit.jupiter.api.Test;

public class TreeTest {

    /**
     * 遍歷測試
     */
    @Test
    public void binaryTreeTest() {

        HeroNode n1 = new HeroNode(1, "宋江");
        HeroNode n2 = new HeroNode(2, "無用");
        HeroNode n3 = new HeroNode(3, "盧俊");
        HeroNode n4 = new HeroNode(4, "林沖");
        n1.left = n2;
        n1.right = n3;
        n3.right = n4;

        BinaryTree tree = new BinaryTree(n1);
        System.out.println("前序遍歷");
        tree.preOrder();
        System.out.println("中序遍歷");
        tree.inOrder();
        System.out.println("後序遍歷");
        tree.postOrder();
    }

    /**
     * 尋找測試
     */
    @Test
    public void binaryTreeTest1() {
        HeroNode n1 = new HeroNode(1, "宋江");
        HeroNode n2 = new HeroNode(2, "無用");
        HeroNode n3 = new HeroNode(3, "盧俊");
        HeroNode n4 = new HeroNode(4, "林沖");
        HeroNode n5 = new HeroNode(5, "關勝");
        n1.left = n2;
        n1.right = n3;
        n3.left = n5;
        n3.right = n4;

        BinaryTree tree = new BinaryTree(n1);
        System.out.println(tree.preOrderSearch(5));
        System.out.println(tree.inOrderSerach(5));
        System.out.println(tree.postOrderSearch(5));
    }

    @Test
    public void arrBinaryTree() {
        int[] arr = new int[]{1, 2, 3, 4, 5, 6, 7};
        ArrBinaryTree tree = new ArrBinaryTree(arr);
        System.out.println("preOrder");
        tree.preOrder(0);
        System.out.println("inOrder");
        tree.inOrder(0);
        System.out.println("postOrder");
        tree.postOrder(0);
    }

    @Test
    public void threadedBinarytree() {

        HeroNode2 n1 = new HeroNode2(1, "宋江");
        HeroNode2 n3 = new HeroNode2(3, "無用");
        HeroNode2 n6 = new HeroNode2(6, "盧俊");
        HeroNode2 n8 = new HeroNode2(8, "林沖");
        HeroNode2 n10 = new HeroNode2(10, "林沖2");
        HeroNode2 n14 = new HeroNode2(14, "林沖3");
        n1.left = n3;
        n1.right = n6;
        n3.left = n8;
        n3.right = n10;
        n6.left = n14;

        ThreadedBinaryTree tree = new ThreadedBinaryTree();
        tree.threadedNode(n1);
        System.out.println("10號前驅: " + n10.left.id);
        System.out.println("10號後繼: " + n10.right.id);

    }
}
