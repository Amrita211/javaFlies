package Stackss;

import java.util.Iterator;
import java.util.Scanner;
import java.util.Stack;

//You are given a binary string, (string which contains 0's and 1's), You have to perform several operations on this string, in one operation choose a non-empty even length substring containing only 0's or only 1's and remove it from the string.
//Your goal is to minimize the final length of the string after performing several operations.It is possible that the final string may become empty, in that case print "KHALI" without quotes.
//And it can be proved that there is always an unique string with minimal length after performing the operations.
public class hackerearth1 {
    public static void main(String args[] ) throws Exception {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while(t-->0){
            String str = s.next();
            Stack<Character> st = new Stack<>();
            st.push(str.charAt(0));
            for(int i=1; i<str.length(); i++){
                char ch = str.charAt(i);
                if(st.peek()!=ch){
                    st.push(ch);
                }
                else{
                    st.pop();
                }
            }
            Iterator<Character> it = st.iterator();
            if(!st.empty()){
                while(it.hasNext()){
                    System.out.print(it.next());
                }
            }
            else{
                System.out.println("KHALI");
            }
        }
    }
}
