package DynamicProgramming;
// dulicacy of item is allowed therefore 1D is used
import java.util.Scanner;

public class unboundedKnapsack {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] wts = new int[n];
        int[] vals = new int[n];
        for (int i = 0; i <n ; i++) {
            wts[i] = s.nextInt();
        }
        for (int i = 0; i <n ; i++) {
            vals[i] = s.nextInt();
        }
        int cap = s.nextInt();
        int[] dp = new int[cap+1];
        for (int c = 1; c <=cap ; c++) {
            int max = 0;
            for (int i = 0; i <n ; i++) {
                if(wts[i]<=c){
                    int remCap = c-wts[i];
                    int remVal = dp[remCap];
                    int totalVal = remVal + vals[i];
                    if(totalVal>max){
                        max=totalVal;
                    }
                }
            }
            dp[c] = max;
        }
        System.out.println(dp[cap]);
    }
}
