package Stringss;
//Given a positive number X. Find all Jumping Numbers smaller than or equal to X.
/*
Jumping Number: A number is called Jumping Number if all adjacent digits in it differ by only 1.
 All single digit numbers are considered as Jumping Numbers. For example 7, 8987 and 4343456 are
Jumping numbers but 796 and 89098 are not.
*/
import java.util.Scanner;

public class InterviewJumpingNumbers {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        findJumpingNumbers(num);
    }
    public static void findJumpingNumbers(int num){
        if(num<=10){
            for (int i = 1; i <=10; i++) {
                System.out.print(i+" ");
                return;
            }
        }
        // if number greater than 10
        for (int i = 1; i <=num ; i++) {
            boolean diffInDigits = checkDiff(i);
            if(diffInDigits){
                System.out.print(i+" ");
            }
        }
    }
    public static boolean checkDiff(int num){
        while(num>10){
            int digitRight = num%10;
            num = num/10;
            int digitLeft = num%10;
//            num = num/10;
            if(Math.abs(digitLeft-digitRight)!=1){
                return false;
            }
        }
        return true;
    }
}
