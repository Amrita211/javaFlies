package DynamicProgramming;
// given a 2-D matrix . each cell have some number denoting the cost of that cell.
// we have to go from source(first cell) to destination(last cell) . and
// choose that path which costs minimum price an dprint the price
// using tabulation method of DP
import java.util.Scanner;

public class minCostMazePath {
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
        for (int i = dp.length-1; i >=0 ; i--) {
            for (int j = dp[0].length-1; j >=0 ; j--) {
                if(i== dp.length-1 && j ==dp[0].length-1){  // last cell of matrix
                    dp[i][j] = arr[row-1][col-1];
                }
                else if(i==dp.length-1){  // last row (just add cell value of arr and the next value of dp)
                    dp[i][j] = dp[i][j+1] + arr[i][j];
                }
                else if(j==dp[0].length-1){  // last column (just add the value of arr and next down value of th last cloumn)
                    dp[i][j] = dp[i+1][j] + arr[i][j];
                }
                else{ // for the rest of the values i.e except last row and column and the last cell
                    dp[i][j] = Math.min(dp[i][j+1], dp[i+1][j]) + arr[i][j];
                }
            }
        }
        System.out.println(dp[0][0]);
    }
}
