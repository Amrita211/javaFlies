package Stringss;
//Given an array of integers. Check whether it contains a triplet that sums up to zero.
import java.util.HashSet;
import java.util.Scanner;

public class InterviewTripletSumZero {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i <arr.length ; i++) {
            arr[i]=s.nextInt();
        }
        findTripletSum(arr,n);
    }
    public static void findTripletSum(int[] arr, int len){
        boolean result = false;
        for (int i = 0; i <len-1 ; i++) {
            HashSet<Integer> set = new HashSet<>();
            for (int j = i+1; j <len ; j++) {
                int x = -(arr[i]+arr[j]);
                if(set.contains(x)){
                    System.out.printf("%d %d %d\n", x, arr[i], arr[j]); // for printing the triplets
                    result = true;
//                    System.out.println(result);
//                    break;  // if you want to just check whether triplets with sum zero is present or not
                }
                else{
                    set.add(arr[j]);
                }
            }
//            break;  // if you want to just check whether triplets with sum zero is present or not
        }
        if(result==false){
            System.out.println("not found any triplet with sum zero! ");
        }
    }
}
