package zExtraQuestions;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class balanceParanthesesArray {

    static String isBalanced(String s) {
        char[] stack = new char[s.length()];
        int top=-1;
        for(int i=0;i<s.length();i++){
            if(top==-1){
                stack[++top] = s.charAt(i);
            }
            else if((stack[top]=='('&&s.charAt(i)==')') || (stack[top]=='['&&s.charAt(i)==']') ||               (stack[top]=='{'&&s.charAt(i)=='}')){
                top=top-1;
            }
            else{
                stack[++top] = s.charAt(i);
            }
        }
        if(top==-1){
            return "YES";
        }
        else{
            return "NO";
        }

    }

//    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);
        int t=scanner.nextInt();
        for (int tItr = 0; tItr < t; tItr++) {
            String s = scanner.next();
            String result = isBalanced(s);
            System.out.println(result);
        }
    }
}
