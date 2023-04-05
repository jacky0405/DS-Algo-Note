package com.jackycode.datastructure.tree;

public class HeroNode {

    public int id;
    public String name;
    public HeroNode left;
    public HeroNode right;

    public HeroNode(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public void preOrder() {
        System.out.println(this);
        if(this.left != null) {
            this.left.preOrder();
        }
        if(this.right != null) {
            this.right.preOrder();
        }
    }

    public HeroNode preOrderSearch(int id) {
        System.out.println("進入前序遍歷");
        if(this.id == id) {
            return this;
        }
        if(this.left != null) {
            HeroNode result = this.left.preOrderSearch(id);
            if(result != null) {
                return result;
            }
        }
        if(this.right != null) {
            HeroNode result = this.right.preOrderSearch(id);
            if(result != null) {
                return result;
            }
        }

        return null;
    }


    public void inOrder() {
        if(this.left != null) {
            this.left.inOrder();
        }
        System.out.println(this);
        if(this.right != null) {
            this.right.inOrder();
        }
    }

    public HeroNode inOrderSearch(int id) {

        if(this.left != null) {
            HeroNode result = this.left.inOrderSearch(id);
            if(result != null) {
                return result;
            }
        }

        System.out.println("進入中序遍歷");
        if(this.id == id) {
            return this;
        }

        if(this.right != null) {
            HeroNode result = this.right.inOrderSearch(id);
            if(result != null) {
                return result;
            }
        }

        return null;
    }

    public void postOrder() {
        if(this.left != null) {
            this.left.postOrder();
        }
        if(this.right != null) {
            this.right.postOrder();
        }
        System.out.println(this);
    }

    public HeroNode postOrderSearch(int id) {
        if(this.left != null) {
            HeroNode result = this.left.postOrderSearch(id);
            if(result != null) {
                return result;
            }
        }

        if(this.right != null) {
            HeroNode result = this.right.postOrderSearch(id);
            if(result != null) {
                return result;
            }
        }

        System.out.println("進入後序遍歷");
        if(this.id == id) {
            return this;
        }

        return null;
    }

    @Override
    public String toString() {
        return "HeroNode{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
