package Arrayss;

import java.util.Arrays;
import java.util.Stack;

public class Sortings {
    public static void main(String[] args) {
        int[] ar = {7,1,3,2,4,5,6};
//        bubbleSort(ar);
//        Math.ceil(7.8);

//        selectionSort(ar);

//        insertionSort(ar);

//        Stack<Integer> st = new Stack<>();
//        for (int i = 0; i <st.size() ; i++) {
//            int max = i;
//            if(st.get(i)>st.get(max));
//            switch(max){
//                case 1:
//                    return;
//            }
//        }

        countSort(new int[]{2, 5, 0, 2, 3, 0, 3});
    }
//bubble sorting
    private static void bubbleSort(int[] ar) {

        for (int i=0;i<ar.length-1;i++){
            for (int j = 0; j <ar.length-1-i ; j++) {
                if(ar[j]>ar[j+1]){
                    int temp = ar[j];
                    ar[j] = ar[j+1];
                    ar[j+1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(ar));
    }

    // selection sorting
    public static void selectionSort(int[] ar){
        int swapNo =0;
        for (int i = 0; i <ar.length-1 ; i++) {
            int min = i;

            for ( int j = i+1; j <ar.length ; j++) {
                if(ar[j]<ar[min]){
                    min=j;
                }
            }
            if(i!=min){
                int temp = ar[min];
                ar[min] = ar[i];
                ar[i] = temp;
                swapNo++;
            }
        }
        System.out.println(Arrays.toString(ar));
        System.out.println("swapping are:"+swapNo);
    }

    // insertion sorting
    public static void insertionSort(int[] ar){
        for (int i = 0; i <ar.length-1 ; i++) {
            for(int j=i+1;j>0;j--){
                if(ar[j]<ar[j-1]){
                    int temp = ar[j];
                    ar[j] = ar[j-1];
                    ar[j-1]=temp;
                }
                else{
                    break;
                }
            }
        }
        System.out.println(Arrays.toString(ar));
    }

//    counting sort
    public static void countSort(int[] arr){
        int[] count = new int[10];
        for (int i = 0; i <count.length ; i++) {
            count[i]=0;
        }
        //updating count array value
        for (int i = 0; i <arr.length ; i++) {
            ++count[arr[i]];
        }
        //summation
        for (int i = 1; i <count.length ; i++) {
            count[i] += count[i-1];
        }
        // sorted array
        int[] sorted = new int[arr.length];
        for (int i =arr.length-1;i>=0;i--) {
            sorted[count[arr[i]]-1] = arr[i];
            --count[arr[i]];
        }
        System.out.println(Arrays.toString(sorted));
    }
}
