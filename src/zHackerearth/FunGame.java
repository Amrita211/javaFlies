package zHackerearth;

import java.util.ArrayList;
import java.util.Scanner;

public class FunGame {
    public static void main(String args[] ) throws Exception {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
//        ArrayList<Integer> list = new ArrayList<>();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = s.nextInt();
        }
        int start =0;
        int end =n-1;
        while(start<n && end>=0){
            if(arr[start]> arr[end]){
                System.out.print("1 ");
                end--;
            }
            else if(arr[start]< arr[end]){
                System.out.print("2 ");
                start++;
            }
            else if(arr[start]==arr[end]){
                start++;
                end--;
                System.out.print("0 ");
            }
        }
    }
}
