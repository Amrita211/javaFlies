package DynamicProgramming;

import java.util.Scanner;

// 0/1 knapsack problem, where duplicacy is not allowed
public class KnapsackProblem {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] val = new int[n];  // profit array
        int[] wts = new int[n]; // weighty array
        for (int i = 0; i <val.length ; i++) {
            val[i] = s.nextInt();
        }
        for (int i = 0; i <wts.length ; i++) {
            wts[i] = s.nextInt();
        }
        int cap = s.nextInt();
        int[][] dp = new int[n+1][cap+1];
        for (int i = 1; i <dp.length ; i++) {
            for (int j = 1; j <dp[0].length ; j++) {
                // when he has enough balls, i.e greater or equals balls to i
                if(j>=wts[i-1]){
                    // if he doesn't bat
                    int remCap = j-wts[i-1];
                    if(dp[i-1][remCap]+val[i-1] > dp[i-1][j]){
                        dp[i][j] = dp[i-1][remCap]+val[i-1];
                    }
                    else{   // when he doesn't bat
                        dp[i][j] = dp[i-1][j];
                    }
                }
                else{   // when he has not enough balls then copy the upper value of the cell
                    dp[i][j] = dp[i-1][j];
                }
            }
        }
        System.out.println("maximum profit: "+dp[n][cap]);
    }
}
