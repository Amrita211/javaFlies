package pepcoding;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n1 = s.nextInt();
        int[] arr1 = new int[n1];
        for(int i =0; i<arr1.length; i++){
            arr1[i] = s.nextInt();
        }
        int n2 = s.nextInt();
        int[] arr2 = new int[n2];

        for(int i =0; i<arr2.length; i++){
            arr2[i] = s.nextInt();
        }

        int num1 =0;
        int p1 =1;
        int num2 =0;
        int p2 =1;
        for(int i=n1-1; i>=0; i--){
            num1 = num1 + arr1[i]*p1;
            p1 = p1*10;
        }
        for(int i=n2-1; i>=0; i--){
            num2 = num2 + arr2[i]*p2;
            p2 = p2*10;
        }

        int sum = num1 + num2;
        String ans = Integer.toString(sum);
        for(int i=0; i<ans.length(); i++){
            System.out.println(ans.charAt(i));
        }
    }
}
