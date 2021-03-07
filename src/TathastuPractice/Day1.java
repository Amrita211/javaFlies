package TathastuPractice;

import java.util.Arrays;

public class Day1 {
    public static void main(String[] args) {
        int[] arr = {22,21,34,56,4,3,2,45};
//        System.out.println(indexSearch(arr,56));

//        reverse(arr);

//            rotation(arr,3);

//        int[] ar2 = {0,2,1,0,5,6,0,4};
//            zerosToEnd(ar2);

        int[] ar3 = {1, -3, 5, 6, -3, 6, 7, -4, 9, 10};
        oddEvenPosition(ar3);
    }

    // returning the index of a number input
    public static int indexSearch(int[] arr, int num){
        for (int i = 0; i <arr.length ; i++) {
            if(arr[i]==num){
                return i;
            }
        }
        return  -1;
    }

//    reversing all elements without using additional array
    public static void reverse(int[] arr){
        int start =0;
        int end  =arr.length-1;
        while(start<=end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp ;
            start++;
            end--;
        }
        System.out.println(Arrays.toString(arr));
    }

//    rotating an array through an element to the left
    public static void rotation(int[] arr, int k){
        int len = arr.length;
        int[] rotatedArr = new int[len];
        int mod = k%len;
        for(int i=0 ;i<len;i++){
            rotatedArr[i] = arr[(i+mod)%len];
        }
        System.out.println(Arrays.toString(rotatedArr));
    }

//    pushing all zeros to the end , keeping the order of all numbers intact

    public static void zerosToEnd(int[] arr){
        int len =   arr.length;
        int count =0;
        for (int i=0; i<len;i++){
            if (arr[i]!=0){
                arr[count++] = arr[i];
            }
        }
        while(count<len){
            arr[count++]=0;
        }
        System.out.println(Arrays.toString(arr));
    }

//    positive number at even index and negative number at odd index
    public static void oddEvenPosition(int[] arr){
       int posi =0;
        int neg =1;
        int len = arr.length;
        while(true){
            while(posi<len && arr[posi]>0){
                posi+=2;
            }
            while(neg<len && arr[neg]<0){
                neg+=2;
            }
            if (posi<len && neg<len){
                int temp = arr[posi];
                arr[posi] = arr[neg];
                arr[neg] = temp;
            }
            else{
                break;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
