package DynamicProgramming;

import java.util.Scanner;
//
public class targetSumArrayDP {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        // array
        int n = s.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }

        // target
        int target = s.nextInt();
        boolean[][] dp = new boolean[n + 1][target + 1];

        for (int i = 0; i <dp.length ; i++) {
            for (int j = 0; j <dp[0].length ; j++) {
                if(i==0 && j==0){
                    dp[i][j] = true;
                }
                else if(i==0){
                    dp[i][j] = false;
                }
                else if(j==0){
                    dp[i][j] = true;
                }
                else{
                    if(dp[i-1][j]==true){
                        dp[i][j] = true;
                    }
                    else{
                        int value = arr[i-1];
                        if(j>=value){
                            if(dp[i-1][j-value]==true){
                                dp[i][j] = true;
                            }
                        }
                    }
                } // outest else
            } // for j
        } // for i
        System.out.println(dp[arr.length][target]);
    }
}
