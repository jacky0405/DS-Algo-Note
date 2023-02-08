package com.jackycode.datastructure.arrayAndQueue;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class QueueTest {

    @Test
    public void ArrayQueueTest() {
        ArrayQueue queue = new ArrayQueue(3);
        queue.add(1);
        queue.add(2);
        queue.add(3);
        System.out.println("查看數據");
        queue.show();
        Assertions.assertEquals(1, queue.head());
        Assertions.assertEquals(3, queue.tail());
        Assertions.assertEquals(1, queue.get());
        queue.add(4); // 隊列滿了，不能在加了，即使上面已經有取出了一個(需改善)
        Assertions.assertEquals(true, queue.isFull());

    }

    @Test
    public void CircleQueueTest() {
        CircleQueue queue = new CircleQueue(4);
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        System.out.println("查看數據");
        queue.show();
        queue.get();
        queue.show();
        queue.add(6);
        queue.show();
        queue.add(7); // 顯示隊列滿了
    }
}
