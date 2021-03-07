package zRecursionAndBactracking;

import java.util.Scanner;

// given n= no. of people sitting in a circle and k= every kth people is killed untill only one is left alive
public class JosephProblem {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int k = s.nextInt();
        System.out.println(findAlive(n,k));
    }
    public static int findAlive(int n, int k){
        if(n==1){
            return 0;
        }
        int x=findAlive(n-1,k);
        int y = (x+k)%n;
        return y;
    }
}
