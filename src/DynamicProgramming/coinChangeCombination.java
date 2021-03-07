package DynamicProgramming;

import java.util.Scanner;
// count the number of combinations to make a payment of target value from the given array of coins , where each coin can be used any times, i.e repeatitions are allowed
public class coinChangeCombination {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i <n ; i++) {
            arr[i] = s.nextInt();
        }

        int amt = s.nextInt();
        int[] dp = new int[amt+1];
        dp[0] =1;
        for (int i = 0; i <arr.length ; i++) { // traverse in coins array first for combination purpose
            for (int j = arr[i]; j <dp.length ; j++) {
                dp[j] += dp[j-arr[i]];
            }
        }
        System.out.println(dp[amt]);
    }
}
