package DynamicProgramming;

import java.util.Scanner;

public class CoinChangeCombination2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i <arr.length ; i++) {   // coin array
            arr[i] = s.nextInt();
        }
        int amt = s.nextInt();

        int[] dp = new int[amt+1];
        dp[0] = 1;
        for (int i = 0; i <arr.length ; i++) { // for coin , so that second coin always come next to the the first one
            for (int j = arr[i]; j <dp.length ; j++) {
                dp[j] += dp[j-arr[i]];
            }
        }
        System.out.println(dp[amt]);
    }
}
