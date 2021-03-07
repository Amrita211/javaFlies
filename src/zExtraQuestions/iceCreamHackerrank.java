package zExtraQuestions;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
// giving time limit error becz of O(n^2) on hackerank, solve it using hashmap O(n) , them it submitted :)
public class iceCreamHackerrank {

    // Complete the whatFlavors function below.
    static void whatFlavors(int[] cost, int money) {
        for(int i=0; i<cost.length;i++){
            for(int j =i+1;j<cost.length ;j++){
                if(cost[i]+cost[j]==money){
                    if(i<j){
                        System.out.print(i+1 +" ");
                        System.out.print(j+1);
                    }
                    else {
                        System.out.print(j+1 +" ");
                        System.out.print(i+1);
                    }
//                    break;
                    return;
                }
//                break;
            }

        }
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int t = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int tItr = 0; tItr < t; tItr++) {
            int money = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            int n = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            int[] cost = new int[n];

            String[] costItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int i = 0; i < n; i++) {
                int costItem = Integer.parseInt(costItems[i]);
                cost[i] = costItem;
            }

            whatFlavors(cost, money);
        }

        scanner.close();
    }
}

