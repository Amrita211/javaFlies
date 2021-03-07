package DynamicProgramming;

import java.util.Scanner;

// climb the stairs by maximumm3 jumps to reach to 0(down to the stairs) position of the stairs
public class ClimbStair {
    public static void main(String[] args) {
        System.out.println(climbStairRec(6));

        System.out.println(countPairMemoization(6, new int[7]));

        System.out.println(countPairTabulation(6));

//        variable climb stairs jump
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arrJump = new int[n];
        for (int i = 0; i <arrJump.length ; i++) {
            arrJump[i] = s.nextInt();
        }
        System.out.println(countVariableStepsTabulation(n, arrJump));
    }
    // recursion method
    public static int climbStairRec(int n){
        if(n==0){
            return 1;
        }
        else if(n<0){
            return 0;
        }
        int nm1 = climbStairRec(n-1);
        int nm2 = climbStairRec(n-2);
        int nm3 = climbStairRec(n-3);
        int countPair = nm1 + nm2 + nm3;
        return countPair;
    }
//    using DP -> memoization method
    public static int countPairMemoization(int n, int[] qb){
        if(n==0){
            return 1;
        }
        else if(n<0){
            return 0;
        }
        if(qb[n]!=0){
            return  qb[n];
        }
        int nm1 = countPairMemoization(n-1,qb);
        int nm2 = countPairMemoization(n-2, qb);
        int nm3 = countPairMemoization(n-3, qb);
        int countPair = nm1 + nm2 + nm3;
        qb[n] = countPair;
        return countPair;
    }
//    using DP -> tabulation or iteration method
    public static int countPairTabulation(int n){
        int[] dp = new int[n+1];
        dp[0] = 1;
        for (int i = 1; i <=n ; i++) {
            if(i==1){
                dp[i] = dp[i-1];
            }
            else if(i==2){
                dp[i] = dp[i-1]+dp[i-2];
            }
            else{
                dp[i] = dp[i-1]+dp[i-2] + dp[i-3];
            }
        }
        return dp[n];
    }

//    climb stairs with variable jumps. we have to jump up to last stair and each step have assigned
//    no. of jumps that we can jump from that step. count the number of ways to reach up to nth step stair from 0

//    DP -> tabulation or iteration
    public static int countVariableStepsTabulation(int n, int[] arrJump){
        int[] dp = new int[n+1];
        dp[n] =1;
        for (int i = n-1; i >=0 ; i--) {
            for (int j = 1; j <=arrJump[i] && (i+j)<dp.length ; j++) {
                dp[i] += dp[i+j];
            }
        }
        return dp[0];
    }
}
