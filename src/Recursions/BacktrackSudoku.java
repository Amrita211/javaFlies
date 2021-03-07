package Recursions;

import java.util.Scanner;

public class BacktrackSudoku {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[][] board = new int[n][n];
//        int board[][] = { { 3, 1, 6, 5, 7, 8, 4, 9, 2 },
//                { 5, 2, 9, 1, 3, 4, 7, 6, 8 },


//                { 4, 8, 7, 6, 2, 9, 5, 3, 1 },
//                { 2, 6, 3, 0, 1, 5, 9, 8, 7 },
//                { 9, 7, 4, 8, 6, 0, 1, 2, 5 },
//                { 8, 5, 1, 7, 9, 2, 6, 4, 3 },
//                { 1, 3, 8, 0, 4, 7, 2, 0, 6 },
//                { 6, 9, 2, 3, 5, 1, 8, 7, 4 },
//                { 7, 4, 5, 0, 8, 6, 3, 1, 0 } };

        for (int i = 0; i < n ; i++) {
            for (int j = 0; j <n ; j++) {
                board[i][j] = s.nextInt();
            }
        }
        sudokuSolver(board,0,0);
    }
    public static void display(int[][] board){
        for (int i = 0; i <board.length ; i++) {
            for (int j = 0; j <board[0].length ; j++) {
                System.out.print(board[i][j]+" ");
            }
            System.out.println();
        }
    }
    private static void sudokuSolver(int[][] board, int i , int j) {
        if(i==board.length){
        display(board);
        return;
        }
        int nexti = 0;
        int nextj=0;
        if(j==board[0].length-1){
            nexti =i+1;
            nextj=0;
        }
        else{
            nextj =j+1;
            nexti=i;
        }
        
        // if the cell is already filled , just move to the same row but next column, i.e next cell
        if(board[i][j]!=0){
            sudokuSolver(board,nexti,nextj);
        }
//        putting the values in cell , but before putting first ensure its validity 
        else{
            for (int po = 1; po <=9 ; po++) { // values which can be put is from 0-9
                if(isValid(board,i,j,po)==true){
                    board[i][j] = po;
                    sudokuSolver(board,nexti,nextj);
                    board[i][j] =0;
                }
            }
        }
    }
    // checking validity function
    public static boolean isValid(int[][] board, int x, int y, int val){
        // checking in the same row of the cell
        for (int i = 0; i <board[0].length ; i++) {
            if(board[x][i]==val){
                return false;
            }
        }
        // checking in the same column of the cell
        for (int i = 0; i <board.length ; i++) {
            if(board[i][y]==val){
                return false;
            }
        }

        // checking in the sub array
        int subi= (x/3)*3;
        int subj= (y/3)*3;
        for (int i = 0; i <3 ; i++) {
            for (int j = 0; j <3 ; j++) {
                if(board[subi+i][subj+j]==val){
                    return false;
                }
            }
        }
        return true;
    }

}
