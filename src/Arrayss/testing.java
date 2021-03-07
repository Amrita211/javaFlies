package Arrayss;

import java.util.Arrays;
import java.util.Scanner;

public class testing {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int n = s.nextInt();
        int[] arr = new int[n];
        int[] dup = new int[n];
        for(int i=0 ;i<arr.length; i++){
            int a = s.nextInt();
            arr[i] = a;
            dup[i] = a;
        }
//        Arrays.sort(dup);
        //    for(int i=0; i<dup.length; i++){
        //        System.out.print(dup[i]+"  ");
        //    }
        bubbleSort(dup);
        for(int i=0; i<dup.length; i++){
            for(int j =0; i<arr.length;j++){
                if(dup[i]==arr[j]){
                    System.out.print(j+" ");
                    break;
                }
            }
        }
    }
    public static void bubbleSort(int[] ar){
        for (int i=0;i<ar.length-1;i++){
            for (int j = 0; j <ar.length-1-i ; j++) {
                if(ar[j]>ar[j+1]){
                    int temp = ar[j];
                    ar[j] = ar[j+1];
                    ar[j+1] = temp;
                }
            }
        }
    }
}
