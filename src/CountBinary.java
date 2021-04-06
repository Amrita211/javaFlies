import java.util.Scanner;
//1. You are given a number n.
//2. You are required to print the number of binary strings of length n with no consecutive 0's.
// note: total number of binary strings of length n is 2 to the power n.
public class CountBinary {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int oldCount0 = 1;
        int oldCount1 = 1;

        for (int i = 2; i <=n ; i++) {
            int newCount0 = oldCount1;
            int newCount1 = oldCount1 + oldCount0;

            oldCount0 = newCount0;
            oldCount1 = newCount1;
        }
        System.out.println(oldCount0 + oldCount1);
    }
}
