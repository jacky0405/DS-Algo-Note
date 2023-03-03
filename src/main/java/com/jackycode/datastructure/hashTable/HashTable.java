package com.jackycode.datastructure.hashTable;

public class HashTable {

    private EmpLinkedList[] linkedArray;
    private int size;

    public HashTable(int size) {
        this.linkedArray = new EmpLinkedList[size];
        this.size = size;
        for(int i=0; i < size; i++) {
            this.linkedArray[i] = new EmpLinkedList();
        }
    }

    public void add(Employee emp) {
        int idx = hash(emp.id);
        linkedArray[idx].add(emp);
    }

    public Employee findById(int id) {
        int idx = hash(id);
        Employee emp = linkedArray[idx].findById(id);
        if(emp == null) {
            System.out.println("沒有此id");
        } else {
            System.out.println("在第"+idx+"格中找到："+emp.toString());
        }

        return emp;
    }

    public Employee deleteById(int id) {
        int idx = hash(id);
        Employee emp = linkedArray[idx].delete(id);
        if(emp == null) {
            System.out.println("沒有此id");
        } else {
            System.out.println("在第"+idx+"格中刪除："+emp.toString());
        }

        return emp;
    }

    public void list() {
        for(int i=0; i < size; i++) {
            System.out.println("第"+i+"格");
            linkedArray[i].list();
        }
    }

    private int hash(int id) {
        return id % size;
    }

}
