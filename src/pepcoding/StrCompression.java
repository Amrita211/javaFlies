package pepcoding;

import java.util.Scanner;

public class StrCompression {
    public static String compression1(String str){
        // write your code here
        String res ="";
        int i=0;
        while(i<str.length()-1){
            if(str.charAt(i)==str.charAt(i+1)){
                i++;
            }
            else{
                res += str.charAt(i);
                i++;
            }

        }
        return res+str.charAt(str.length()-1);
    }

    public static String compression2(String str){
        // write your code here
        String res = "";
        int i =0;
        int count =1;
        while(i<str.length()-1){
            //  int count =1;
            if(str.charAt(i)==str.charAt(i+1)){
                i++;
                count++;
            }
            else{
                if(count>1){
                    res = res+ str.charAt(i)+count;
                }
                else{
                    res = res+ str.charAt(i);
                }

                i++;
                count=1;
            }
        }

        if(count>1){
            return res+str.charAt(str.length()-1)+count;
        }
        else{
            return res+str.charAt(str.length()-1);
        }
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        System.out.println(compression1(str));
        System.out.println(compression2(str));
    }
}
