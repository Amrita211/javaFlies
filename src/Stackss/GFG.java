package Stackss;

import java.util.Scanner;
import java.util.Stack;

public class GFG {
    public static void main (String[] args) {
        //count the occurence of "gfg"
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while(t-->0){
            String str = s.next();
//            String matching = "gfg";
            int count =0;
            for (int i = 0; i <str.length()-2 ; i++) {
                String sub = str.substring(i,i+3);
                if(sub.equals("gfg")){
                   count++;
                   i = i+2;
                }
            }
            if(count>0){
                System.out.println(count);
            }
            else{
                System.out.println(-1);
            }
        }
    }
}
