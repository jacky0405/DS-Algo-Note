package com.jackycode.datastructure;

import com.jackycode.datastructure.hashTable.Employee;
import com.jackycode.datastructure.hashTable.HashTable;
import org.junit.jupiter.api.Test;

public class HashTableTest {

    @Test
    public void test() {

        HashTable t = new HashTable(7);

        t.add(new Employee(24, "A", 50));
        t.add(new Employee(26, "B", 26));
        t.add(new Employee(75, "C", 30));
        t.add(new Employee(104, "D", 23));
        t.add(new Employee(140, "E", 46));
        t.list();
        t.findById(104);
        t.deleteById(75);
        t.list();
    }


}
