package zRecursionAndBactracking;

import java.util.Scanner;

public class NQueens {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        boolean[][] board = new boolean[n][n];
//        boolean[][] board = new boolean[4][4];
        solution(board,0);
    }
    public static void solution(boolean[][] board, int row){
        if(row==board.length){  // base function ka code nhi chal rahah hai.. Don't know why !!!!
            printB(board);
            System.out.println("**********************");
            return;
        }
        for (int col = 0; col <board.length ; col++) {
            if(isQueenSafe(board,row,col)==true){
                board[row][col] = true;
                solution(board,row+1);
                board[row][col] = false;
            }
        }
    }
    public  static boolean isQueenSafe(boolean[][] board, int row , int col){
        for (int i = row-1, j=col; i >=0 ; i--) {  // vertically
            if(board[i][j] == true){
                return false;
            }
        }
        for (int i = row-1, j=col-1; i>=0&&j>=0 ; i--,j--) {  // left diagonal
            if(board[i][j]== true){
                return false;
            }
        }
        for (int i = row-1,j=col+1; i>=0 && j<board.length ; i--,j++) {   // right diagonal
            if(board[i][j] == true){
                return false;
            }
        }
        return true;
    }
    public  static void printB(boolean[][] board){
        for (int i = 0; i <board.length ; i++) {
            for (int j = 0; j <board.length ; j++) {
                if(board[i][j]==true){
                    System.out.print("Q ");
                }
                else{
                    System.out.print("X ");
                }
            }
            System.out.println();
        }
    }
}
