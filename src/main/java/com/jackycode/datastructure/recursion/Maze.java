package com.jackycode.datastructure.recursion;

public class Maze {

    private int[][] maze;

    /**
     * 依圖創建迷宮
     * 0:可活動區域
     * 1:圍牆
     *
     * 1 1 1 1 1 1 1
     * 1 0 0 0 0 0 1
     * 1 0 0 0 0 0 1
     * 1 1 1 0 0 0 1
     * 1 0 0 0 0 0 1
     * 1 0 0 0 0 0 1
     * 1 0 0 0 0 0 1
     * 1 1 1 1 1 1 1
     */
    public void initMaze(int row, int col) {

        maze = new int[row][col];
        for(int r = 0; r < row; r++) {
            for(int c = 0; c < col; c++) {
                if(r == 0 || r == row - 1) {
                    maze[r][c] = 1;
                }
                if(c == 0 || c == col - 1) {
                    maze[r][c] = 1;
                }
            }
        }
        maze[3][1] = 1;
        maze[3][2] = 1;

    }

    public boolean setWay(int[] start, int[] end) {
        if(maze[end[0]][end[1]] == 2) {
            return true;
        }

        int r = start[0];
        int c = start[1];
        if(maze[r][c] != 0) {
            return false;
        }
        maze[r][c] = 2; // 先標記此點走過
        if(setWay(new int[]{r+1, c}, end)) { // 探索下
            return true;
        } else if(setWay(new int[]{r, c+1}, end)) { // 探索右
            return true;
        } else if(setWay(new int[]{r-1, c}, end)) { // 探索上
            return true;
        } else if(setWay(new int[]{r, c-1}, end)) { // 探索左
            return true;
        } else {
            maze[r][c] = 3;
            return false;
        }

    }

    public void print() {
        for(int[] r : maze) {
            for(int num : r) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }

}
