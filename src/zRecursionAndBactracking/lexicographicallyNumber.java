package zRecursionAndBactracking;

import java.util.Scanner;

// print the 1-N numbers in lexicographical order
public class lexicographicallyNumber {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        for (int i = 1 ; i <=9; i++) {
            dfs(i,n);
        }
    }
    public static void dfs(int i, int n){
        if(i>n){
            return;
        }
        System.out.println(i);
        for (int j = 0; j <10 ; j++) {
            dfs(i*10+j,n);
        }
    }
}
