package DynamicProgramming;

import java.util.Scanner;

// we explain about A+B+C+ subsequences and state the problem where we are required to count and print the number of such sequences formed for a given string. In this problem,
//         1. You are given a string str.
//         2. You are required to calculate and print the count of subsequences of the nature a+b+c+.
//         For abbc - there are 3 subsequences. abc, abc, abbc
//         For abcabc - there are 7 subsequences. abc, abc, abbc, aabc, abcc, abc, abc.
public class SubsequenceABC {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.next();
        int a =0;
        int ab =0;
        int abc =0;

        for (int i = 0; i <str.length() ; i++) {
            char ch = str.charAt(i);
            if(ch=='a'){
                a = 2*a +1;
            }
            else if(ch == 'b'){
                ab = ab*2 +a;
            }
            else if(ch == 'c'){
                abc = 2*abc + ab;
            }
        }
        System.out.println("no. of counts of subsequence followed by abc : "+abc);
    }
}
