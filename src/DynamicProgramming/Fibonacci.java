package DynamicProgramming;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
//
//       System.out.println(recursiveFibDP(n));
//        System.out.println(iterativeFactDP(n));

        System.out.println(fibboDP(n));
    }

//    top down DP i.e recursive dp
    private static int recursiveFibDP(int n) {

        Integer[] table = new Integer[n + 1];
        if(table[n]==null){
             if (n <= 1) {
            table[n] = n;
            }
             else {
            table[n] =recursiveFibDP(n-1)+recursiveFibDP(n-2);
            }
        }
        return table[n];
    }

    //bottom to top DP i.e iterative dp
    public static int iterativeFactDP(int n){
        int[] table = new int[n+1];
        table[0] = 0;
        table[1] = 1;
        for (int i = 2; i <=n ; i++) {
            table[i] = table[i-2]+table[i-1];
        }
        return table[n];
    }

//    recursive dp another way
    public static int fibboDP(int n){
        int[] mem = new int[n+1];
        if(n==0 || n==1){
            return mem[n]=n;
        }
        if(mem[n]!=0){
            return mem[n];
        }
        int fib1 = fibboDP(n-1);
        int fib2 = fibboDP(n-2);
        return mem[n] = fib1+fib2;
    }
}
