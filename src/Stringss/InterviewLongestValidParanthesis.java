package Stringss;

import java.util.Scanner;

// we have given a string of parantheses, we have to find the valid longest parantheses string, and print the length of that valid string
public class InterviewLongestValidParanthesis {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.next();
        System.out.println(countValidParan(str));
    }
    public static int countValidParan(String str){
        int countClose=0;
        int countOpen=0;
        for (int i = 0; i <str.length() ; i++) {
            char ch = str.charAt(i);
            if(ch=='('){
                countOpen++;
            }
            else if(ch==')'){
                countClose++;
            }
        }
        if(countClose==countOpen){
            return countOpen*2;
        }
        if(countOpen<countClose){
            return countOpen*2;
        }
        if(countClose<countOpen){
            return countClose*2;
        }
        return -1;
    }
}
