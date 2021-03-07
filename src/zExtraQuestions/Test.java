package zExtraQuestions;

import java.util.Scanner;

public class Test {
    public static void main(String args[] ) throws Exception {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while(t-->0){
            int start = s.nextInt();
            int end = s.nextInt();
            int sUnit = s.nextInt();
            double lower = (Math.ceil((double)start/sUnit));
            double upper =  (Math.floor((double)end/sUnit));
            System.out.println((int)(lower)+" "+(int)upper);
        }
    }
}
