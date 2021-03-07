package zExtraQuestions;
// FizzBuzz problem
import java.util.Scanner;

public class FizzBuzz{
    public static void main(String[]args){
            Scanner s = new Scanner(System.in);

            // taking input by user
            int start = s.nextInt();
            int last = s.nextInt();

//            checking for all numbers lying between start and last
        for(int i = start; i<=last; i++){
            if(i % 3 == 0){
                System.out.print("Fizz");
            }
            if(i%5==0){
                System.out.print("Buzz");
            }

            else if(i%3 != 0){
                System.out.print(i);
            }
            System.out.println();
        }
    }
}
