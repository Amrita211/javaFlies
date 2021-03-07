package Stringss;

import java.util.Scanner;

public class InterviewMaximumIndex {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=s.nextInt();
        }
        System.out.println(maximumINdex(arr));
    }
    public static int maximumINdex(int[] arr){
        int max=0;
        int curr=0;
        for (int i = 0; i <arr.length-1 ; i++) {
            for (int j = 0; j <arr.length ; j++) {
                if(arr[i]<=arr[j]){
                    curr=j-i;
                    max = Math.max(max,curr);
                }
            }
        }
        return max;
    }
}
