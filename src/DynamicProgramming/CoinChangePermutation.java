package DynamicProgramming;
// given an array of coins. and a target amount. we have to find the all permutations to
// pay the target amount by using the given coins. And we have infinte number of each
// coins are available i.e we can use duplicate coins !

import java.util.Scanner;

public class CoinChangePermutation {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] coins = new int[n];
        for (int i = 0; i <coins.length ; i++) {
            coins[i] = s.nextInt();
        }
        int amt = s.nextInt();
        int[] dp = new int[amt+1];
        dp[0] =1;  // we have always 1 way to pay 0 rupee i.e na kuchh lena , na kuchh dena

        for (int i = 1; i <dp.length ; i++) {  // puting dp loop outside as we have to make permutation here
            for (int j = 0; j <coins.length ; j++) {  // coins array
                if(i>=coins[j]){   // amount should be greater or equal to coin
                    dp[i] += dp[i-coins[j]];
                }
            }
        }
        System.out.println(" counts of all permutations to pay target amount using given coins: "+dp[amt]);
    }
}
