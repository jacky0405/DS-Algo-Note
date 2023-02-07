package com.jackycode.datastructure.arrayAndQueue;

public class SparseArray {

    public int[][] chessToArray(int[][] matrix) {
        // 1. 先算出有效個數
        int count = 0;
        for(int row=0; row < matrix.length; row++) {
            for(int col=0; col < matrix[0].length; col++) {
                if(matrix[row][col] != 0) {
                    count++;
                }
            }
        }

        // 2. 創建sparse array
        int[][] sparseArray = new int[count+1][3];
        sparseArray[0] = new int[]{matrix.length, matrix[0].length, count};
        int idx = 1;
        for(int row=0; row < sparseArray[0][0]; row++) {
            for(int col=0; col < sparseArray[0][1]; col++) {
                if(matrix[row][col] != 0 && idx <= count) {
                    sparseArray[idx] = new int[]{row, col, matrix[row][col]};
                    idx++;
                }
            }
        }

        return sparseArray;
    }

    public int[][] arrayToChess(int[][] array) {
        // 稀疏數組還原二維數組
        int[][] matrix = new int[array[0][0]][array[0][1]];
        for(int i=1; i <= array[0][2]; i++) {
            matrix[array[i][0]][array[i][1]] = array[i][2];
        }

        return matrix;
    }

    public static void main(String[] args) {
        // 創建 11x11 的棋盤
        // 0:無棋子 1:白子 2:黑子
        int[][] chess = new int[11][11];
        chess[1][2] = 1;
        chess[2][3] = 2;

        System.out.println("原始二維數組");
        for(int row=0; row < chess.length; row++) {
            for(int col=0; col < chess[0].length; col++) {
                System.out.print(chess[row][col] + " ");
            }
            System.out.println();
        }

        SparseArray sparseArray = new SparseArray();
        System.out.println("二維數組轉稀疏數組");
        int[][] sparse = sparseArray.chessToArray(chess);
        for(int row=0; row < sparse.length; row++) {
            for(int col=0; col < sparse[0].length; col++) {
                System.out.print(sparse[row][col] + " ");
            }
            System.out.println();
        }

        System.out.println("稀疏數組轉二維數組");
        int[][] maxtrix = sparseArray.arrayToChess(sparse);
        for(int row=0; row < maxtrix.length; row++) {
            for(int col=0; col < maxtrix[0].length; col++) {
                System.out.print(maxtrix[row][col] + " ");
            }
            System.out.println();
        }



    }
}
