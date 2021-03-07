package zExtraQuestions;

import java.util.Scanner;

public class maximumProfit {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while(t-->0){
            int n = s.nextInt();
            int rupee = s.nextInt();
            int total=1;
            int[] ar = new int[n];
            for(int i=0;i<n;i++){
                ar[i] = s.nextInt();
            }
            for(int i=1;i<n;i++){
                if(ar[i]>ar[i-1]){
                    int j=i-1;
                    while(j>=0){
                        if(ar[i]>ar[j]){
                            j--;
                        }
                        else{
                            total =total-1;
                            break;
                        }
                    }
                    total++;
                }
            }
            System.out.println(total*rupee);
        }
    }
}
