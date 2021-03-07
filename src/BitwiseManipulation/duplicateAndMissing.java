package BitwiseManipulation;
// we have given 1-N array in which we have to find missing and dplicate number
// e.g- arr= [3,6,2,5,1,2,7] output is missing = 4 and dupllicate is 2

import java.util.Scanner;

public class duplicateAndMissing {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] arr ={3,6,2,5,1,2,7};
        solution(arr);
    }
    public static void solution(int[] arr){
        int xor = 0;
        for (int val:arr){
            xor^=val;
        }
        for (int i = 1; i <=arr.length ; i++) {
            xor^=i;
        }
        int rsbm = xor&-xor;
        int x=0;
        int y=0;
        for (int val:arr){
            if((val&rsbm)==0){
               x^=val;
            }
            else{
                y^=val;
            }
        }
        for (int i = 1; i <=arr.length ; i++) {
            if((i&rsbm)==0){
                x^=i;
            }
            else{
                y^=i;
            }
        }
        for (int val:arr) {
            if(val==x){
                System.out.println("missing"+y);
                System.out.println("duplicate"+x);
                break;
            }
            else{
                System.out.println("missing -> "+x);
                System.out.println("duplicate -> " + y);
                break;
            }
        }
    }
}
