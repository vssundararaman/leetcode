package com.vidya.leetcode;

public class TicTacToe {

    int[] rowCounter;
    int[] colCounter;
    int diagRight;
    int diagLeft;
    int n;

    public TicTacToe(int n) {
        rowCounter = new int[n];
        colCounter = new int[n];
        diagRight = 0;
        diagLeft = 0;
        this.n = n;
    }

    public static void main(String[] args) {
        TicTacToe ticTacToe = new TicTacToe(3);
        System.out.println(ticTacToe.move(0,0,1));
        System.out.println(ticTacToe.move(0, 2, 2));
        System.out.println( ticTacToe.move(2, 2, 1));
        System.out.println(ticTacToe.move(1, 1, 2));
        System.out.println(ticTacToe.move(2, 0, 1));
        System.out.println(ticTacToe.move(1, 0, 2));
        System.out.println(ticTacToe.move(2, 1, 1));
    }

    int move(int row, int col, int player){
        int move = player == 1? 1: -1;

        rowCounter[row] +=move;
        colCounter[col] +=move;

        if(row == col) diagLeft +=move;
        if(row == n - col - 1) diagRight +=move;

        if(rowCounter[row] == n || colCounter[col] == n || diagLeft == n || diagRight ==n){
            return 1;
        }else if(rowCounter[row] == -n || colCounter[col] == -n || diagLeft == -n || diagRight == -n){
            return 2;
        }else{
            return 0;
        }
    }
}
