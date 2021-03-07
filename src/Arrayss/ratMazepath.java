package Arrayss;

import java.util.Scanner;

public class ratMazepath {
    Scanner s = new Scanner(System.in);
    int m = s.nextInt();
    int n = s.nextInt();
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int m = s.nextInt();
        int n = s.nextInt();
        char[][] board = new char[m][n];
        char[][] maze = {{'o','x','x','x'},
                         {'o','o','x','o'},
                         {'x','o','x','x'},
                         {'x','x','x','x'}};

        solveMazePath(maze,m,n);
    }
    public static boolean solveMazePath(char[][] maze , int row, int col){
        char[][] sol = new char[row][col];
        if(solveMazeUtil(maze,row,col,sol)==false){
            System.out.println("can't find");
            return false;
        }
        printing(sol,row,col);
        return true;
    }

    private static boolean solveMazeUtil(char[][] maze, int row, int col, char[][] sol) {
        return true;
    }
//    private boolean isSafe(char[][] maze, int row, int col){
//
//    }

    private static void printing(char[][] sol, int row, int col) {
        for (int i = 0; i <row ; i++) {
            for (int j = 0; j <col ; j++) {
                System.out.println(sol[i][j]+" ");
            }
            System.out.println();
        }
    }
}
