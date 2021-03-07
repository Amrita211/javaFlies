package DynamicProgramming;
//1. You are given a number n, representing the number of rows.
// 2. You are given a number m, representing the number of columns.
// 3. You are given n*m numbers, representing elements of 2d array a, which represents a gold mine.
// 4. You are standing in front of left wall and are supposed to dig to the right wall. You can start from any row in the left wall.
// 5. You are allowed to move 1 cell right-up (d1), 1 cell right (d2) or 1 cell right-down(d3).
import java.util.Scanner;

public class maxCostGoldMining {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int row = s.nextInt();
        int col = s.nextInt();
        int[][] arr = new int[row][col];
        for (int i = 0; i <arr.length ; i++) {
            for (int j = 0; j <arr[0].length ; j++) {
                arr[i][j] = s.nextInt();
            }
        }
        int[][] dp = new int[row][col];
        for (int j = dp[0].length-1; j >=0 ; j--) { // column loop from last
            for (int i = dp.length-1; i >=0 ; i--) { // row loop from last . We can also start it from 0
                if(j==dp[0].length-1){  // last column
                    dp[i][j] = arr[i][j];
                }
                else if(i==0){ // ist row
                    dp[i][j] = arr[i][j] + Math.max(dp[i][j+1], dp[i+1][j+1]);
                }
                else if(i== arr.length-1){ // last row
                    dp[i][j] = arr[i][j] + Math.max(dp[i][j+1], dp[i-1][j+1]);
                }
                else{ // rest of the table
                    dp[i][j] = arr[i][j] + Math.max(dp[i+1][j+1],Math.max(dp[i][j+1], dp[i-1][j+1]));
                }
            }
        }
//        now find tha maximum value of ist column , which will be our answer
        int max = dp[0][0];
        for (int i = 1; i < dp.length ; i++) {
            if(dp[i][0]>max){
                max = dp[i][0];
            }
        }
        System.out.println(max);
    }
}
