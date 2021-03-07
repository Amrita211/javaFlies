package zExtraQuestions;

import java.util.*;
class maximumProfit1 {
    public static void main(String args[] ) throws Exception {
        Scanner s = new Scanner(System.in);
        int streets = s.nextInt();
        while(streets-->0){
            int build = s.nextInt();
            int rupee = s.nextInt();
            int[] arr = new int[build];
            for(int i=0;i<arr.length;i++){
                arr[i] = s.nextInt();
            }
            maxProfit(arr,build,rupee);
        }
    }
    public static void maxProfit(int[] arr, int build, int rupee){
        int max =0;
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
                count++;
            }
        }
        System.out.println(count*rupee);
    }
}
