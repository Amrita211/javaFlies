package Arrayss;

import java.util.Scanner;
// a x b = LCM(a, b) * GCD (a, b)
public class LcmAndHcf {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println(lcm(72,120));
        System.out.println(gcd(72,120));
        System.out.println("fibonacci sereis: ");
        fibSeries(7);
    }
    public static int lcm(int a , int b) {
        return (a/gcd(a,b))*b;
    }
    public static int gcd(int a , int b){
        if(a==0){
           return b;
        }
        return gcd(b%a,a);
    }
    // fibonacci series
    public static void fibSeries(int n){
        int first =0;
        int second =1;
        System.out.println(first);
        System.out.println(second);
        int third=0;
        int i=2;
        while(i<=n){
            third = first+second;
            System.out.println(third);
            first = second;
            second =third;
            i++;
        }
        System.out.println("the "+n+"th fibonacci number is: "+second);
    }
}
