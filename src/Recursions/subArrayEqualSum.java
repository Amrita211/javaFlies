package Recursions;

import java.util.ArrayList;

// divide an array in two sub array such that sum of each sub arrays are equal. find such pairs !!!!!
public class subArrayEqualSum {
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        ArrayList<Integer> first = new ArrayList<>();
        ArrayList<Integer> sec = new ArrayList<>();
        eqSum(arr,first, sec, 0,0,0);
    }
    public static void eqSum(int[] arr, ArrayList<Integer> first, ArrayList<Integer> sec , int fSum, int sSum, int index){
       if(index==arr.length){
           if(fSum==sSum){
               System.out.println(first +" : "+sec);
           }
           return;
       }
        int item = arr[index];

       first.add(item);
       eqSum(arr,first,sec,fSum+item,sSum,index+1);
       first.remove(first.size()-1);

       sec.add(item);
       eqSum(arr,first,sec,fSum,sSum+item,index+1);
       sec.remove(sec.size()-1);
    }
}
