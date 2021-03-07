package zExtraQuestions;

import java.util.Scanner;
import java.util.Stack;

public class stackIntro {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        Stack<Character> st = new Stack<>();
        st.add('a');
        st.add('b');
        st.add('c');
        st.add('d');
        System.out.println(st.get(1));
        System.out.println(st.size());
    }
}
