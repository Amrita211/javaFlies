package Stringss;

import java.util.Scanner;

// find all permutations of a string by iterative method
public class permutationIterative {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.next();
        findpermute(str);
    }
    public  static void findpermute(String str){
        int n = str.length();
        int f = factorial(n);
        for (int i = 0; i <f ; i++) {
            StringBuilder bd = new StringBuilder(str);
            int temp =i;
            for (int div = n; div >=1 ; div--) {
                int q = temp/div;
                int r = temp%div;
                System.out.print(bd.charAt(r));
                bd.deleteCharAt(r);
                temp=q;
            }
            System.out.println();
        }
    }
    public  static int factorial(int val){
        int fact = 1;
        for (int i = 2; i <=val ; i++) {
            fact *= i;
        }
        return fact;
    }
}
