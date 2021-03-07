package DynamicProgramming;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int n = s.nextInt();
//        System.out.println(recursiveFactDP(n));

//        System.out.println(iterativeFactDP(n));

        System.out.println(factDP(n));
    }
    // top to bottom DP i.e memoization
    private static Integer recursiveFactDP(int n) {
        Integer[] table = new Integer[n+1];
        if(table[n]==null){
            if(n<2){
                table[n]=1;
            }
            else{
                table[n] = recursiveFactDP(n-1)*n;
            }
        }
        return table[n];
    }

    // bottom to up DP i.e table solution
    public static int iterativeFactDP(int n){
        Integer[] table = new Integer[n+1];
        table[0]=1;
        table[1]=1;
        for (int i = 2; i <=n ; i++) {
            table[i] = table[i-1]*i;
        }
        return table[n];
    }

    // factorial memoization
    public static int factDP(int n){
        int[] mem = new int[n+1];
        if(n==0 || n==1){
            return mem[n]=n;
        }
        if(mem[n]!=0){
            return mem[n];
        }
        return mem[n] = factDP(n-1)*n;
    }

}
