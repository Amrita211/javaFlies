package Stringss;
// Given an array A containing 2*N+2 positive numbers, out of which 2*N numbers exist in pairs whereas
// the other two number occur exactly once and are distinct. Find the other two numbers  (in ascending order).
// in simple, print the value which occurs exactly once
import java.util.HashMap;
import java.util.Scanner;

public class InterviewFindDistinct {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();;
        int[] arr = new int[2*n+2];
        for (int i = 0; i <arr.length ; i++) {
            arr[i]=s.nextInt();
        }
        findDistinct(arr);
    }
    public static void findDistinct(int[] arr){
        HashMap<Integer, Integer> map = new HashMap<>();
//        store the frequency of each number in hashmap
        for (Integer num:arr){
            if(map.containsKey(num)){
                map.put(num,map.get(num)+1);
            }
            else{
                map.put(num,1);
            }
        }
        // getting values from map which are distinct
        for (Integer num:map.keySet()){
            int values = map.get(num);
            if(values==1){
                System.out.println(num);
            }
        }
    }
}
