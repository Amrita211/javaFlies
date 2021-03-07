package zExtraQuestions;

import java.util.Scanner;

public class Test1 {
    public static void main(String args[] ) throws Exception {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while(t-->0){
            int start = s.nextInt();
            int end = s.nextInt();
            int sUnit = s.nextInt();

            double lower = (Math.ceil((double)start/sUnit));
            double upper =  (Math.floor((double)end/sUnit));
            int left = (int)(lower);
            int right  = (int)upper;

            if(left>right){
                System.out.println(-1 + " "+-1 );

            }
            else{
                System.out.println(left+" "+right);
            }
        }
    }
}
