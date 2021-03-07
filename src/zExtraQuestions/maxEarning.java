//package zExtraQuestions;
//
//import java.io.BufferedReader;
//import java.io.InputStreamReader;
//import java.util.Scanner;
//
//public class maxEarning {
//    public static void main(String args[] ) throws Exception {
//        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
//        int streets = Integer.parseInt(bf.readLine());
////        Scanner s = new Scanner(System.in);
////        int streets = s.nextInt();
//        while(streets-->0){
//
//
//            int build =Integer.parseInt(bf.readLine());
//            int rupee = Integer.parseInt(bf.readLine());
////            int build = s.nextInt();
////            int rupee = s.nextInt();
//            int[] arr = new int[build];
//            for(int i=0;i<arr.length;i++){
//                arr[i] = Integer.parseInt(bf.readLine());
//            }
//            maxProfit(arr,build,rupee);
//        }
//    }
//    public static void maxProfit(int[] arr, int build, int rupee){
//        int max =0;
//        int count=0;
//        for(int i=0;i<arr.length;i++){
//            if(arr[i]>max){
//                max=arr[i];
//                count++;
//            }
//        }
//        System.out.println(count*rupee);
//    }
//}
