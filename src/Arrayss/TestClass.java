package Arrayss;

import java.util.Arrays;
import java.util.Scanner;

public class TestClass {
    public static void main(String args[] ) throws Exception {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = s.nextInt();
        }
        uniquePair(arr);
    }
    public static void uniquePair(int[] arr){  // gives the output as 49 but the expected output is 92 :(
        int count =0;
        Arrays.sort(arr);
        for (int i = 0; i <arr.length ; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        for(int i =0; i<arr.length-1; i++){
            if(arr[i]<arr[i+1]){
                count++;
            }
        }
        System.out.println(count);
    }
}
