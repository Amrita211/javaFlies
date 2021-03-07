package Stackss;

import java.util.Scanner;
import java.util.Stack;

/*
reverse the stack without using any while , for or etc loop
 */
public class reverseStack {
    static Stack<Integer> st = new Stack<>();
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        for (int i = 1; i <=4 ; i++) {
            st.push(i);
        }
        System.out.println("original stack is: "+st);
        reverse();
        System.out.println("reversed stack is: "+st);
    }
    public static void reverse(){
        if(st.size()>0){
            int x = st.peek();
            st.pop();
            reverse();
            insertAtBottom(x);
        }
    }
    public static void insertAtBottom(int x){
        if(st.isEmpty()){
            st.push(x);
        }
        else{
            int a = st.peek();
            st.pop();
            insertAtBottom(x);
            st.push(a);
        }
    }
}