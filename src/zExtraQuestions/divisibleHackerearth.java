package zExtraQuestions;

import java.io.*;
import java.util.*;


public class divisibleHackerearth {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter wr = new PrintWriter(System.out);
        int N = Integer.parseInt(br.readLine().trim());
        String[] arr_A = br.readLine().split(" ");
        int[] A = new int[N];
        for(int i_A=0; i_A<arr_A.length; i_A++)
        {
            A[i_A] = Integer.parseInt(arr_A[i_A]);
        }

        String out_ = solve(A);
        System.out.println(out_);

        wr.close();
        br.close();
    }
    static String solve(int[] arr){
        // Write your code here
        int midIndex = arr.length/2;
        String res ="";
        //  for the first halve, finding the first digit of array element
        for(int i=0;i<midIndex;i++){
            int firstDigit = findFirst(arr[i]);
            res = res + Integer.toString(firstDigit);
        }
        //  finding the last digit of array element
        for(int i=midIndex;i<arr.length;i++){
            int lastDigit = arr[i]%10;
            res = res + Integer.toString(lastDigit);
        }
        int finalAns = Integer.parseInt(res);
        if(finalAns%11==0){
            return "OUI";
        }
        else{
            return "NON";
        }

    }
    static int findFirst(int num){
        while(num>10){
            num= num/10;
        }
        return num;
    }
}
