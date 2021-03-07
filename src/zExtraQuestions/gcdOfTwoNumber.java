package zExtraQuestions;

import java.util.Scanner;

public class gcdOfTwoNumber {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while(t-->0){
            int a = s.nextInt();
            int b = s.nextInt();
            System.out.println(gcd(a,b));
        }
    }
    public static int gcd(int a , int b){
        while(b>0){
            int temp =b;
            b = a%b;
            a = temp;
        }
        return a;
    }
}
