package Recursions;

import java.util.ArrayList;
import java.util.Scanner;

public class sumSubsetArray {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i <n ; i++) {
            arr[i] = s.nextInt();
        }
        int target = s.nextInt();
        findSumSubset(arr,0," ",0,target);

        ArrayList<Integer> set = new ArrayList<>();
//        findSumSubsetList(arr,0,set,0,target);
    }
    public static void findSumSubset(int[] arr, int index, String set, int sum , int target){
       if(index==arr.length){
           if(sum==target){
               System.out.print(set+",");
           }
           return;
       }

        findSumSubset(arr,index+1,set+" "+arr[index],sum+arr[index],target);
        findSumSubset(arr,index+1,set,sum,target);
    }

//    printing in list form
//    error aa raha hai .. aur mujhe error samjh nhi aa raha hai :(

//public static void findSumSubsetList(int[] arr, int index, ArrayList<Integer> set, int sum , int target){
//    if(index==arr.length){
//        if(sum==target){
//            System.out.print(set+",");
//        }
//        return;
//    }
//
//    findSumSubsetList(arr,index+1,set.add(arr[index]),sum+arr[index],target);
//    findSumSubsetList(arr,index+1,set,sum,target);
//    }

}
