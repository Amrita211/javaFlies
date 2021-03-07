package Stringss;

import java.util.Arrays;
import java.util.Scanner;

public class InterviewPairSumTarget {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i <n ; i++) {
            arr[i] = s.nextInt();
        }
        int target = s.nextInt();
        pairSumTarget(arr, target);
    }
    public static void pairSumTarget(int[] arr, int target){
        Arrays.sort(arr);
        int start=0;
        int end= arr.length-1;
        while(start<end){
            if(arr[start]+arr[end]==target){
                System.out.print(arr[start]+", "+arr[end]);
                System.out.println();
                start++;
                end--;
            }
            else if(arr[start]+arr[end]<target){
                start++;
            }
            else{
                end--;
            }
        }
    }
    public static void tripletSumTarget(int[] arr, int target){
    }
}
// 1 1 2 2 3