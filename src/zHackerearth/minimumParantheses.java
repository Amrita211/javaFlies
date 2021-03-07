package zHackerearth;

import java.util.Scanner;
import java.util.Stack;

public class minimumParantheses {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        Stack<Character> stack = new Stack<>();
        char[] arr = str.toCharArray();
        char br = '\0';   // also can use simply br = ''

        for (char c : arr) {
            if (c == '(') {
                br = ')';
            }
            else if (c == '{'){
                br = '}';
            }
            else if (c == '['){
                br = ']';
            }

            if (!stack.isEmpty() && stack.peek() == c){
                stack.pop();
            }
            else{
                stack.push(br);
            }
            br = '\0';
        }

        System.out.println(stack.size());
    }
}
