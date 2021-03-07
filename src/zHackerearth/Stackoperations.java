package zHackerearth;

import java.util.Scanner;
import java.util.Stack;

public class Stackoperations {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n =s.nextInt();
        int k = s.nextInt();
//        Stack<Long> stack = new Stack<>();
         long[] arr = new long[n];
        for(int i =0; i<n ; i++){
//            stack.push(s.nextLong());
             arr[i] = s.nextLong();
        }
        operation(arr, n, k);
//        long max = Integer.MIN_VALUE;
//        for(int i=0; i<k-1; i++){
//            if(arr[i]>max){
//                max = arr[i];
//            }
//
//        }
//        for (int i = n-k; i >=0 ; i--) {
////            System.out.print(stack.get(i)+" ");
//            if(stack.get(i)>max){
//                max = Math.max(max, stack.peek());
//            }
//            stack.pop();
//        }
//        System.out.println(max);
//        System.out.println(stack.peek());
    }
    public  static void operation(long[] arr, int n , int k ){
        long max = Integer.MIN_VALUE;
        for (int i = 0; i <k-1 ; i++) {
            if(arr[i]>max){
                max = arr[i];
            }
        }
        System.out.println(max);
    }
}
