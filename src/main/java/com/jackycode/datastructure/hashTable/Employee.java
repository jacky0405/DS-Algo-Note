package com.jackycode.datastructure.hashTable;

public class Employee {

    public int id;
    public String name;
    public int age;
    public Employee next;

    public Employee(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
