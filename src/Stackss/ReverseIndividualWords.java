package Stackss;

import java.util.Scanner;
import java.util.Stack;

// sorting array using stack
public class ReverseIndividualWords {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str =  "java point for java programmer";      //s.nextLine();
        Stack<Character> st = new Stack<>();
        for(int i =0 ;i<str.length(); i++){
            char ch = str.charAt(i);
            if(ch!=' '){
                st.push(ch);
            }
            else{
                while(st.empty()==false){
                    System.out.print(st.pop());
                }
                System.out.print(" ");
            }
        }
    }
}
