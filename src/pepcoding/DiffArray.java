package pepcoding;

import java.io.*;
import java.util.*;

public class DiffArray
{

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner s = new Scanner(System.in);
        int n1 = s.nextInt();
        int[] a1 = new int[n1];
        for(int i=0; i<a1.length; i++){
            a1[i] = s.nextInt();
        }

        int n2 = s.nextInt();
        int[] a2 = new int[n2];
        for(int i=0; i<a2.length; i++){
            a2[i] = s.nextInt();
        }

        int[] diff = new int[n2];
        int c =0;
        int i = a1.length-1;
        int j = a2.length-1;
        int k = diff.length-1;

        while(k>=0){
            int d =0;
            int a1Val = i>=0?a1[i]:0;

            if(a2[j]+c >= a1Val){
                d = a2[j]+c - a1Val;
                c=0;
            }
            else{
                d = a2[j]+c+10 - a1Val;
                c=-1;
            }
            diff[k] = d;
            i--; j--; k--;
        }
        // printing
        // excluding leading zeros
        int ind =0;
        while(ind<diff.length){
            if(diff[ind]==0){
                ind++;
            }
            else{
                break;
            }
        }
        // printing numbers after leading zeros
        while(ind<diff.length){
            System.out.println(diff[ind]);
            ind++;
        }
    }

}
