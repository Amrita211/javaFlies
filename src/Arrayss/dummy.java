package Arrayss;

import java.util.Scanner;

public class dummy {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[][] board = new int[n][n];
        NQueens(board,0);
    }

    private static void NQueens(int[][] board, int row) {
        if(row==board.length){
            printb(board);
            return;
        }

        for (int col = 0; col <board.length ; col++) {
            if(isSafePlace(board,row,col)==true) {
                board[row][col] = 1;
                NQueens(board, row + 1);
                board[row][col] = 0;
            }
        }
    }
    // printing the board
    private static void printb(int[][] board) {
        for (int i = 0; i <board.length ; i++) {
            for (int j = 0; j <board.length ; j++) {
                if(board[i][j]==1){
                    System.out.print("Q ");
                }
                else{
                    System.out.print("X ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }

    private static boolean isSafePlace(int[][] board, int row, int col) {
        // checking vertically
        for(int i = row-1,j=col; i>=0;i--){
            if(board[i][j]==1){
                return false;
            }
        }
        // checking left diagonal
        for(int i=row-1, j=col-1;i>=0&&j>=0;i--,j--){
            if(board[i][j]==1){
                return false;
            }
        }
        // checking right diagonal
        for(int i=row-1,j=col+1;i>=0&&j<board.length;i--,j++){
            if(board[i][j]==1){
                return false;
            }
        }
        return true;
    }
}
