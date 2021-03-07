package zExtraQuestions;

import java.util.Scanner;

public class maxProfit {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while(t-->0){
            int n = s.nextInt();
            int rupee = s.nextInt();
            int total=1;
            int[] ar = new int[n];
            for (int i = 0; i <n ; i++) {
                ar[i]=s.nextInt();
            }
            for(int i=1;i<n;i++){
//                total =1;
                if(ar[i]>ar[0] && ar[i]!=ar[i-1] && ar[i]>ar[i-1]){
                    total++;
                }
            }
            System.out.println(total*rupee);
        }
    }
}
