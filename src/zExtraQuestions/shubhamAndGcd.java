package zExtraQuestions;

import java.util.Scanner;

public class shubhamAndGcd {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while(t-->0){
            long sum =0;
            int len = s.nextInt();
            int[] ar1 = new int[len];
            int[] ar2 = new int[len];
            for (int i = 0; i <len ; i++) {
                ar1[i] = s.nextInt();
            }
            for (int i = 0; i < len; i++) {
                ar2[i] = s.nextInt();
            }
            for(int i=0;i<len;i++){
                sum += gcd(ar1[i] , ar2[len-i-1]);
            }
            System.out.println(sum);
        }
    }
    public static long gcd(long a, long b){
        if(a>0 && b>0){
            while(b>0){
                long temp = b;
                b = a%b;
                a = temp;
            }
        }
        return a;
    }
}
