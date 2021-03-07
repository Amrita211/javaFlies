package zExtraQuestions;

import java.util.Scanner;

public class maxMinAnother {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while(t-->0){
            int n = s.nextInt();
            int k = s.nextInt();
            int[] ar = new int[n];
            for(int i=0;i<n;i++){
                ar[i] = s.nextInt();
            }
            int sumMax =0;
            int sumMin =0;
            for(int i =0;i<k;i++){
                sumMax+= ar[i];
                sumMin += ar[i];
            }
            int currMax =sumMax;
            int currMin = sumMin;
            for(int i=k;i<ar.length;i++){
                currMax += ar[i]-ar[i-k];
                currMin +=ar[i]-ar[i-k];
                sumMax = Math.max(sumMax, currMax);
                sumMin = Math.min(sumMin, currMin);
            }
            System.out.println(sumMax-sumMin);
        }
    }
}
