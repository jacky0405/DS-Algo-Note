package com.jackycode.datastructure;

import com.jackycode.datastructure.recursion.Maze;
import com.jackycode.datastructure.recursion.Queen8;
import org.junit.jupiter.api.Test;

public class RecursionTest {

    @Test
    public void recursionTest1() {
        Maze maze = new Maze();
        maze.initMaze(8, 7);
        System.out.println("---原地圖---");
        maze.print();
        System.out.println("---探索後---");
        maze.setWay(new int[]{1,1}, new int[]{4,1});
        maze.print();
    }

    @Test
    public void queen8Test() {
        Queen8 queen8 = new Queen8(8);
        queen8.start(0);
    }
}
