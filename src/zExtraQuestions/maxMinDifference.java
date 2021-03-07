package zExtraQuestions;

import java.util.Arrays;
import java.util.Scanner;
// error aa rha hai :(
public class maxMinDifference {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while(t-->0){
            int n = s.nextInt();
            int k = s.nextInt();
            int[] ar = new int[n];
            for(int i=0;i<k;i++){
                ar[i] = s.nextInt();
            }
            Arrays.sort(ar);
            int max =0;
            int min =0;
            int cnt =0;
            for(int i=ar.length-1; i>=0;i--){
                cnt++;
                if(cnt!=k){
                    max+=ar[i];
                }
                else{
                    break;
                }
            }
//            int cnt =0;
            for(int i=0;i<k;i++){
                min +=ar[i];
            }
            System.out.println(max-min);
        }
    }
}
