package DynamicProgramming;
// count the number of  minimum moves(jump) to reach nth stair from 0. number of moves for a
// particulat stair is given in the form of array
import java.util.Scanner;

public class ClimbStairMoves {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] jumpArr = new int[n];
        for (int i = 0; i <jumpArr.length ; i++) {
            jumpArr[i] = s.nextInt();
        }
        Integer[] dp = new Integer[n+1];
        dp[n] =0;
        for (int i = n-1; i >=0 ; i--) {
            if(jumpArr[i]>0) {
                int min = Integer.MAX_VALUE;
                for (int j = 1; j <= jumpArr[i] && (i + j) < dp.length; j++) {
                   if(dp[i+j]!=null) {
                       min = Math.min(dp[i + j], min);
                   }
                }
                if(min!=Integer.MAX_VALUE){
                    dp[i] = min+1;
                }
            }
        }
        System.out.println(dp[0]);
    }
}
