package Arrayss;

import java.util.Arrays;
import java.util.Scanner;

public class QuickSort2 {
    public static void main(String[] args) {
//        Scanner s = new Scanner(System.in);
        int[] ar = {32,12,43,65,34};
        quicksort(ar,0,ar.length);
        System.out.println(Arrays.toString(ar));
    }
    public static void quicksort(int[] ar, int start, int end){

        if(start>=end){
            return;
        }
        int pivot = end-1;
        pivot = changePivot(ar,start,pivot);
        quicksort(ar,start,pivot);
        quicksort(ar,pivot+1,end);
    }
    public static int changePivot(int[] ar, int start,int pivot){
        int j=start;
        for (int i = start; i <pivot ; i++) {
            if(ar[i]<ar[pivot]){
                swap(ar,i,j);
                j++;
            }

        }
        swap(ar,j,pivot);
        return j; // pivot has come to its correct position, i.e j position will be pivot position
    }

    public static void swap(int[] ar,int i, int j){
        int temp = ar[i];
        ar[i]=ar[j];
        ar[j]=temp;
    }
}
