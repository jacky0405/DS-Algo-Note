package com.jackycode.datastructure.hashTable;

public class EmpLinkedList {

    private Employee head;

    public void add(Employee emp) {
        if(head == null) {
            head = emp;
            return;
        }
        Employee tmp = head;
        while(tmp.next != null) {
            tmp = tmp.next;
        }
        tmp.next = emp;
        return;
    }

    public Employee findById(int id) {

        Employee tmp = head;
        while(tmp != null) {
            if(tmp.id == id) {
                return tmp;
            }
            tmp = tmp.next;
        }

        return null;
    }

    public Employee delete(int id) {

        Employee curr = head;
        Employee pre = head;
        while(curr != null) {
            if(curr.id == id) {
                pre.next = curr.next;
                return curr;
            }
            pre = curr;
            curr = curr.next;
        }

        return null;
    }

    public void list() {
        if(head == null) {
            System.out.println("鏈表無元素");
            return;
        }
        Employee tmp = head;
        while(tmp != null) {
            System.out.println(tmp);
            tmp = tmp.next;
        }
    }

}
